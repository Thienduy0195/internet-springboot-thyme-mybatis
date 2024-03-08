package com.fsoft.internet.utils;

import com.fsoft.internet.services.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckPhoneExitsValidator
    implements ConstraintValidator<CheckPhoneExitsConstraint, String> {
  @Autowired
  private ICustomerService customerService;

  @Override
  public void initialize(CheckPhoneExitsConstraint constraintAnnotation) {

  }

  /**
   * @author DuyNT58
   * @Author_birth_date: 1995-01-01
   * @param value
   * @param context
   * @return
   * @TODO
   */
  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return customerService.findByPhoneNumber(value).isPresent();
  }
}
