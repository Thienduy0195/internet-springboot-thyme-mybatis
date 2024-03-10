package com.fsoft.internet.mappers;

import com.fsoft.internet.models.Record;
import com.fsoft.internet.models.RecordExample;
import com.fsoft.internet.models.RecordKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RecordMapper {

    long countByExample(RecordExample example);

    int deleteByExample(RecordExample example);

    int deleteByPrimaryKey(RecordKey key);

    int insert(Record row);

    int insertSelective(Record row);

    List<Record> selectByExample(RecordExample example);

    Record selectByPrimaryKey(RecordKey key);

    int updateByExampleSelective(@Param("row") Record row, @Param("example") RecordExample example);

    int updateByExample(@Param("row") Record row, @Param("example") RecordExample example);

    int updateByPrimaryKeySelective(Record row);

    int updateByPrimaryKey(Record row);
}