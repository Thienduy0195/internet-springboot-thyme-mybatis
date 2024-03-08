package com.fsoft.internet.repositories.payment;

import com.fsoft.internet.entities.Payment;
import com.fsoft.internet.entities.PaymentId;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface IPaymentRepository extends JpaRepository<Payment, PaymentId> {

}
