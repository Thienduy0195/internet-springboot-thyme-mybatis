package com.fsoft.internet.models;

import java.util.Date;

public class PaymentKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.customer_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    private String customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.product_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.using_date
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    private Date usingDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.using_hour
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    private Date usingHour;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.customer_id
     *
     * @return the value of payment.customer_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.customer_id
     *
     * @param customerId the value for payment.customer_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.product_id
     *
     * @return the value of payment.product_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.product_id
     *
     * @param productId the value for payment.product_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.using_date
     *
     * @return the value of payment.using_date
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public Date getUsingDate() {
        return usingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.using_date
     *
     * @param usingDate the value for payment.using_date
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void setUsingDate(Date usingDate) {
        this.usingDate = usingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.using_hour
     *
     * @return the value of payment.using_hour
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public Date getUsingHour() {
        return usingHour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.using_hour
     *
     * @param usingHour the value for payment.using_hour
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void setUsingHour(Date usingHour) {
        this.usingHour = usingHour;
    }
}