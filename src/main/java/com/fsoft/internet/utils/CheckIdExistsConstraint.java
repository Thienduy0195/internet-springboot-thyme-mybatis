package com.fsoft.internet.utils;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Constraint(validatedBy = CheckIdExitsValidator.class)
public @interface CheckIdExistsConstraint {
  String message() default "This code is exist!";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
