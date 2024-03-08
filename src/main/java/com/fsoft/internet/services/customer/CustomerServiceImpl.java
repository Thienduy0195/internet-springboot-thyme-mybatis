package com.fsoft.internet.services.customer;

import com.fsoft.internet.entities.Customer;
import com.fsoft.internet.repositories.customer.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {


    private ICustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public ICustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    @Autowired
    public void setCustomerRepository(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerServiceImpl() {
    }

    @Override
    public void createOrUpdate(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Integer getLastId() {
        Optional<Customer> customer = customerRepository.findAll().stream()
                .reduce((first, second) -> second);
        if (customer.isPresent()) {
            return Integer.parseInt(customer.get().getCustomerId().substring(3));
        }
        return 0;
    }

    @Override
    public int getNoOfRecords() {
        return customerRepository.findAll().size();
    }

    @Override
    public List<Customer> getRecordsForCurrentPage(int start,
                                                   int recordsPerPage) {
        return null;
    }

    @Override
    public Optional<Customer> findById(String id) {
        return null;
    }

    @Override
    public List<Customer> getList() {
        return customerRepository.findAll();
    }

    @Override
    public boolean delete(String id) {
        return true;
    }

    @Override
    public List<Customer> searchByNameAndAddress(String searchName,
                                                 String searchAddress, int start, int recordsPerPage) {
        return null;
    }

    @Override
    public Optional<Customer> findByPhoneNumber(String phone) {
        return null;
    }

    @Override
    public Optional<Customer> findByEmail(String email) {
        return null;
    }

    @Override
    public List<Customer> searchByNameAndAddress(String searchName,
                                                 String searchAddress) {
        return null;
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }


}
