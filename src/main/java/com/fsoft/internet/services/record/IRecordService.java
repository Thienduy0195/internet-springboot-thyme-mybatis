package com.fsoft.internet.services.record;

import com.fsoft.internet.entities.Records;

import java.util.List;

public interface IRecordService {

  void createOrUpdate(Records record);

  List<Records> getAllByCustomerId(String id);

  int getNoOfRecords();

  List<Records> getRecordsForCurrentPage(int i, int recordsPerPage);

  List<Records> search(String customerId, String computerId, int i,
      int recordsPerPage);

  List<Records> search(String customerId, String computerId);

}
