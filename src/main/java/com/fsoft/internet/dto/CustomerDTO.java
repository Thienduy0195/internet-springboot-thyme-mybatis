package com.fsoft.internet.dto;

import com.fsoft.internet.utils.CheckEmailExitsConstraint;
import com.fsoft.internet.utils.CheckIdExistsConstraint;
import com.fsoft.internet.utils.CheckPhoneExitsConstraint;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CustomerDTO implements Validator {

    static final String REGEX_ID = "^CUS[0-9]{5}$";
    static final String REGEX_PHONE = "^(090|091|032|033|034|035|036|037|038|039|070|079|077|076|078|083|084|085|081|082|056|058|059|\\\\(84\\\\)\\\\+90|\\\\(84\\\\)\\\\+91)[0-9]{7}$";
    static final String REGEX_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    @Pattern(regexp = REGEX_ID, message = "Wrong format CUSxxxxx124")
    @CheckIdExistsConstraint
    private String customerId;

    @Pattern(regexp = "^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêêềễìíứừựớờợòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s?]+$", message = "Name cannot be blank or contain special characters!")
    private String customerName;
    @NotEmpty(message = "Address is required!")
    @NotNull(message = "Address is required!")
    private String address;

    @NotNull(message = "Phone is required!")
    @NotEmpty(message = "Address is required!")
    @CheckPhoneExitsConstraint
    private String phoneNumber;

    @NotNull(message = "Email is required!")
    @NotEmpty(message = "Address is required!")
    @CheckEmailExitsConstraint
    private String email;

    private Integer deleteStatus = 0;

    public CustomerDTO() {
    }

    public CustomerDTO(String customerId, String customerName, String address,
                       String phoneNumber, String email, Integer deleteStatus) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.deleteStatus = deleteStatus;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Override
    public String toString() {
        return "CustomerDTO [customerId=" + customerId + ", name=" + customerName
                + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email="
                + email + ", deleteStatus=" + deleteStatus + "]";
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerDTO customerDto = (CustomerDTO) target;
        if (customerDto.getCustomerId() == null
                || "".equals(customerDto.getCustomerId())) {
            errors.rejectValue("customerId", "customerId", "Required!");
        } else if (!customerDto.getCustomerId().matches(REGEX_ID)) {
            errors.rejectValue("customerId", "code.format", "Wrong format CUSxxxxx!!");
        }

        String phone = customerDto.getPhoneNumber();
        // validate phone:
        if (phone.isEmpty()) {
            errors.rejectValue("phoneNumber", "phone.empty", "Required!");
        } else if (phone.length() > 12 || phone.length() < 10) {
            errors.rejectValue("phoneNumber", "phone.length",
                    "Phone must be from 10 to 12 characters!");
        } else if (!phone.startsWith("0")) {
            errors.rejectValue("phoneNumber", "phone.startWith",
                    "Phone must start with 0!");
        } else if (!phone.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phoneNumber", "phone.matchs",
                    "Phone is in wrong format!");
        }
        if (customerDto.getCustomerName() == null || customerDto.getCustomerName().isEmpty()) {
            errors.rejectValue("customerName", "customerName.error", "Required!");
        }

        if (customerDto.getEmail() == null || customerDto.getEmail().isEmpty()) {
            errors.rejectValue("email", "email.error", "Required!");
        }

        if (customerDto.getAddress() == null
                || customerDto.getAddress().isEmpty()) {
            errors.rejectValue("address", "address.error", "Required!");
        }

    }

}
