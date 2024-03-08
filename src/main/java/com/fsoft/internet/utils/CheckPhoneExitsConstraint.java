package com.fsoft.internet.utils;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Constraint(validatedBy = CheckPhoneExitsValidator.class)
public @interface CheckPhoneExitsConstraint {
  String message() default "This phone number is exist!";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
