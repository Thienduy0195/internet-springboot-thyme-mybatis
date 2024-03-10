package com.fsoft.internet.mappers;

import com.fsoft.internet.models.Computer;
import com.fsoft.internet.models.ComputerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ComputerMapper {

    long countByExample(ComputerExample example);

    int deleteByExample(ComputerExample example);

    int deleteByPrimaryKey(String computerId);

    int insert(Computer row);

    int insertSelective(Computer row);

    List<Computer> selectByExample(ComputerExample example);

    Computer selectByPrimaryKey(String computerId);

    int updateByExampleSelective(@Param("row") Computer row, @Param("example") ComputerExample example);

    int updateByExample(@Param("row") Computer row, @Param("example") ComputerExample example);

    int updateByPrimaryKeySelective(Computer row);

    int updateByPrimaryKey(Computer row);
}