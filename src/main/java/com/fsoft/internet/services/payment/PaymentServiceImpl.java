package com.fsoft.internet.services.payment;

import com.fsoft.internet.mappers.PaymentMapper;
import com.fsoft.internet.models.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements IPaymentService {


  private PaymentMapper paymentMapper;

  public PaymentServiceImpl() {
  }

  @Autowired
  public PaymentServiceImpl(PaymentMapper paymentMapper) {
    this.paymentMapper = paymentMapper;
  }

  @Override
  public void createOrUpdate(Payment payment) {
    paymentMapper.insert(payment);

  }

  @Override
  public Page<Payment> findAll(Pageable pageable) {
    return null;
  }

  @Override
  public Integer getLastId() {

    return null;
  }

  @Override
  public int getNoOfRecords() {
    return 0;
  }

  @Override
  public List<Payment> getRecordsForCurrentPage(int start, int recordsPerPage) {
    return null;
  }

  @Override
  public Optional<Payment> findById(String id) {
    return Optional.empty();
  }

  @Override
  public List<Payment> getList() {
    return null;
  }

  @Override
  public List<Payment> getAllByCustomerId(String id) {
    return null;
  }

  @Override
  public Double caculateTotal(List<Payment> payments) {
    return null;
  }

  @Override
  public List<Payment> search(String customerId, String productId, int i,
      int recordsPerPage) {
    return null;
  }

  @Override
  public List<Payment> search(String customerId, String productId) {
    return null;
  }

}
