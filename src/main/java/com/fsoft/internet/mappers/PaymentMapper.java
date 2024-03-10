package com.fsoft.internet.mappers;

import com.fsoft.internet.models.Payment;
import com.fsoft.internet.models.PaymentExample;
import com.fsoft.internet.models.PaymentKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    long countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(PaymentKey key);

    int insert(Payment row);

    int insertSelective(Payment row);

    List<Payment> selectByExample(PaymentExample example);

    Payment selectByPrimaryKey(PaymentKey key);

    int updateByExampleSelective(@Param("row") Payment row, @Param("example") PaymentExample example);

    int updateByExample(@Param("row") Payment row, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(Payment row);

    int updateByPrimaryKey(Payment row);
}