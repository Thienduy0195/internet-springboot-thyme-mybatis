package com.fsoft.internet.controllers;

import com.fsoft.internet.dto.CustomerDTO;
import com.fsoft.internet.models.Customer;
import com.fsoft.internet.models.Payment;
import com.fsoft.internet.models.Record;
import com.fsoft.internet.services.customer.ICustomerService;
import com.fsoft.internet.services.payment.IPaymentService;
import com.fsoft.internet.services.record.IRecordService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.text.NumberFormat;
import java.util.*;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    private IRecordService recordService;

    private IPaymentService paymentService;

    private ICustomerService customerService;

    private ModelMapper modelMapper;

    @Autowired
    public CustomerController(@Qualifier("main") IRecordService recordService, IPaymentService paymentService, ICustomerService customerService, ModelMapper modelMapper) {
        this.recordService = recordService;
        this.paymentService = paymentService;
        this.customerService = customerService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("customerDto", new CustomerDTO());
        return "customer/create-customer";
    }

    @PostMapping("/create")
    public String createNew(@Valid
           @ModelAttribute("customerDto") CustomerDTO customerDto,
            BindingResult bindingResult, Model model,
            RedirectAttributes redirectAttributes) {
        try {
            new CustomerDTO().validate(customerDto, bindingResult);
            if (bindingResult.hasErrors()) {
                return "customer/create-customer";
            }
            model.addAttribute("message", "Add new customer successfully!");
            Customer customer = modelMapper.map(customerDto, Customer.class);
//            System.out.println(customer.toString());
            customerService.create(customer);
            redirectAttributes.addFlashAttribute("message",
                    "Create customer successfully!");
            return "redirect:/customer/list";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/customer/error";

    }

    @GetMapping("/list")
    public String showList(Model model,
                           @RequestParam(name = "page", defaultValue = "0") int page) {
        int noOfRecords = customerService.getNoOfRecords();
        int recordsPerPage = 5;
        int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
        if (page < 1) {
            page = 1;
        } else if (page > noOfRecords) {
            page = noOfRecords;
        }
        int start = page > 0 ? page - 1 : 0;
//        List<Customer> customers = customerService
//                .getRecordsForCurrentPage((start) * recordsPerPage, recordsPerPage);
        List<Customer> customers = customerService.findAllCustomer();
        model.addAttribute("noOfPages", noOfPages);
        model.addAttribute("currentPage", page);
        model.addAttribute("customers", customers);
        return "customer/customer-list";
    }

    @GetMapping("/search")
    public String search(
            @RequestParam(value = "searchName", required = true) String searchName,
            @RequestParam(value = "searchAddress", required = true) String searchAddress,
            @RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        try {
            int start = page > 0 ? page - 1 : 0;
            int recordsPerPage = 5;
            int noOfRecords = 10;
//            int noOfRecords = customerService
//                    .searchByNameAndAddress(searchName, searchAddress).size();
//            List<Customer> customers = customerService.searchByNameAndAddress(
//                    searchName, searchAddress, (start) * recordsPerPage, recordsPerPage);
            List<Customer> customers = customerService.findAllCustomer();
            int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / recordsPerPage);
            if (page < 1) {
                page = 2;
            } else if (page > noOfPages) {
                page = noOfPages - 1;
            }
            model.addAttribute("searchName", searchName);
            model.addAttribute("searchAddress", searchAddress);
            model.addAttribute("noOfPages", noOfPages);
            model.addAttribute("currentPage", page);
            model.addAttribute("customers", customers);
            return "customer/customer-list";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "customer/customer-list";
    }

    @GetMapping("/{id}")
    public String showUpdateForm(Model model, @PathVariable("id") String id) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isEmpty()) {
            return "commons/error-page";
        }
        CustomerDTO customerDTO = modelMapper.map(customer.get(), CustomerDTO.class);
        System.out.println(customerDTO.toString());
        model.addAttribute("customerDto", customerDTO);
        return "customer/edit-customer";
    }

    @PostMapping("/{id}")
    public String update(@ModelAttribute("customer") CustomerDTO customerDto,
                         BindingResult bindingResult, Model model, @PathVariable("id") String id,
                         RedirectAttributes redirectAttributes) {
        customerDto.setCustomerId(id);
        customerDto.validate(customerDto, bindingResult);

        if (bindingResult.hasErrors()) {
            model.addAttribute("customerDto", customerDto);
            return "customer/edit-customer";
        }
        Customer customer = modelMapper.map(customerDto, Customer.class);
        customerService.update(customer);
        redirectAttributes.addFlashAttribute("message",
                "Update customer successfully!");
        return "redirect:/customer/list";
    }

    @PostMapping("/delete")
    public String deleteCustomer(@RequestParam String customerId, Model model,
                                 RedirectAttributes redirectAttributes) {
        if (customerService.delete(customerId)) {
            model.addAttribute("message", "Delete successfully");
        }
        redirectAttributes.addFlashAttribute("message",
                "Delete customer successfully!");
        return "redirect:/customer/list";
    }

    @GetMapping("/history/{id}")
    public String showHistory(Model model, @PathVariable("id") String id) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()) {
            return "commons/error-page";
        }
        List<Record> records = recordService.getAllByCustomerId(id);
        List<Payment> payments = paymentService.getAllByCustomerId(id);
        Double totalDouble = paymentService.caculateTotal(payments);
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        String moneyString = formatter.format(totalDouble);
        model.addAttribute("records", records);
        model.addAttribute("payments", payments);
        model.addAttribute("totalDouble", moneyString);
        return "customer/history";
    }

    @GetMapping("/search/*")
    public String notFound() {
        return "commons/error-page";
    }

}
