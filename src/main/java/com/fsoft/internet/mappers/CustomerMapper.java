package com.fsoft.internet.mappers;

import com.fsoft.internet.models.Customer;
import com.fsoft.internet.models.CustomerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper {

    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String customerId);

    void insertCustomer(Customer row);

    int insertSelective(Customer row);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(String customerId);

    int updateByExampleSelective(@Param("row") Customer row, @Param("example") CustomerExample example);

    int updateByExample(@Param("row") Customer row, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer row);

    int updateByPrimaryKey(Customer row);

    List<Customer> selectAll();
}