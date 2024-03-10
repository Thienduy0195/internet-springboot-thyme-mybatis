package com.fsoft.internet.services.customer;

import com.fsoft.internet.mappers.CustomerMapper;
import com.fsoft.internet.models.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

    private CustomerMapper customerMapper;

    @Autowired
    public CustomerServiceImpl(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    public CustomerMapper getCustomerMapper() {
        return customerMapper;
    }

    @Autowired
    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    public CustomerServiceImpl() {
    }

    @Override
    public void create(Customer customer) {
        customerMapper.insertCustomer(customer);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Integer getLastId() {
        return 0;
    }

    @Override
    public int getNoOfRecords() {
        return 0;
    }

    @Override
    public List<Customer> getRecordsForCurrentPage(int start,
                                                   int recordsPerPage) {
        return null;
    }

    @Override
    public Optional<Customer> findById(String id) {
        return Optional.ofNullable(customerMapper.selectByPrimaryKey(id));
    }

    @Override
    public List<Customer> getList() {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return customerMapper.deleteByPrimaryKey(id) > 0;
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
        return customerMapper.selectAll();
    }

    @Override
    public void update(Customer customer) {
        customerMapper.updateByPrimaryKeySelective(customer);
    }


}
