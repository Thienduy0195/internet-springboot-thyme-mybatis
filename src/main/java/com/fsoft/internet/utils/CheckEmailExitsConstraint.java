package com.fsoft.internet.utils;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Constraint(validatedBy = CheckEmailExitsValidator.class)
public @interface CheckEmailExitsConstraint {
  String message() default "Email is exist!";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
