package com.fsoft.internet.models;

import java.util.Date;

public class RecordKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.computer_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    private String computerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.customer_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    private String customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.starting_date
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    private Date startingDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column record.starting_hour
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    private Date startingHour;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.computer_id
     *
     * @return the value of record.computer_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public String getComputerId() {
        return computerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.computer_id
     *
     * @param computerId the value for record.computer_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.customer_id
     *
     * @return the value of record.customer_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.customer_id
     *
     * @param customerId the value for record.customer_id
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.starting_date
     *
     * @return the value of record.starting_date
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public Date getStartingDate() {
        return startingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.starting_date
     *
     * @param startingDate the value for record.starting_date
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column record.starting_hour
     *
     * @return the value of record.starting_hour
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public Date getStartingHour() {
        return startingHour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column record.starting_hour
     *
     * @param startingHour the value for record.starting_hour
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void setStartingHour(Date startingHour) {
        this.startingHour = startingHour;
    }
}