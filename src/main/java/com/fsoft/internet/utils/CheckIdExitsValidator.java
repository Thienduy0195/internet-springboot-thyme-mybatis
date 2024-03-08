package com.fsoft.internet.utils;

import com.fsoft.internet.services.computer.IComputerService;
import com.fsoft.internet.services.customer.ICustomerService;
import com.fsoft.internet.services.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckIdExitsValidator
    implements ConstraintValidator<CheckIdExistsConstraint, String> {

  @Autowired
  private ICustomerService customerService;

  @Autowired
  private IComputerService computerService;

  @Autowired
  private IProductService productService;

  @Override
  public void initialize(CheckIdExistsConstraint constraintAnnotation) {
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    if (value.startsWith("CUS")) {
      return customerService.findById(value).isPresent();
    } else if (value.startsWith("COM")) {
      return computerService.findById(value).isPresent();
    }
    return productService.findById(value).isPresent();
  }

}
