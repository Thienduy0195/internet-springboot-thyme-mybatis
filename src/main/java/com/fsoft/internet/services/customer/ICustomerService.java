package com.fsoft.internet.services.customer;

import com.fsoft.internet.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

  void create(Customer customer);

  Page<Customer> findAll(Pageable pageable);

  Integer getLastId();

  int getNoOfRecords();

  Optional<Customer> findById(String id);

  Optional<Customer> findByPhoneNumber(String phone);

  List<Customer> getList();

  boolean delete(String id);

  List<Customer> searchByNameAndAddress(String searchName, String searchAddress,
      int start, int recordsPerPage);

  List<Customer> getRecordsForCurrentPage(int start, int recordsPerPage);

  Optional<Customer> findByEmail(String email);

  List<Customer> searchByNameAndAddress(String searchName,
      String searchAddress);

  List<Customer> findAllCustomer();

  void update(Customer customer);
}
