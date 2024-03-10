package com.fsoft.internet.services.record;

import com.fsoft.internet.models.Record;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRecordService {

  void createOrUpdate(Record record);

  List<Record> getAllByCustomerId(String id);

  int getNoOfRecord();

  List<Record> getRecordForCurrentPage(int i, int RecordPerPage);

  List<Record> search(String customerId, String computerId, int i,
      int RecordPerPage);

  List<Record> search(String customerId, String computerId);

}
