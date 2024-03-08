package com.fsoft.internet.repositories.customer;

import com.fsoft.internet.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Component
@Transactional
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
