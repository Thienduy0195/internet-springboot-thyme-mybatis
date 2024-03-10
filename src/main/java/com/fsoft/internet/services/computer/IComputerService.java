package com.fsoft.internet.services.computer;

import com.fsoft.internet.models.Computer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IComputerService {

  void createOrUpdate(Computer computer);

  Page<Computer> findAll(Pageable pageable);

  List<Computer> getRecordsForCurrentPage(int start, int recordsPerPage);

  int getNoOfRecords();

  Optional<Computer> findById(String id);

  List<Computer> getList();

  List<Computer> search(String searchId, String searchLocation, String status,
      int i, int recordsPerPage);

  boolean delete(String id);

  List<Computer> search(String searchId, String searchLocation, String status);

  List<Computer> getOfflineList();

}
