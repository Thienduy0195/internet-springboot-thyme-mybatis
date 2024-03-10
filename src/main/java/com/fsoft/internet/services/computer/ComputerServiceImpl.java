package com.fsoft.internet.services.computer;

import com.fsoft.internet.models.Computer;
import com.fsoft.internet.mappers.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputerServiceImpl implements IComputerService {

  private ComputerMapper computerMapper;

  @Autowired
  public ComputerServiceImpl(ComputerMapper computerMapper) {
    this.computerMapper = computerMapper;
  }

  @Override
  public void createOrUpdate(Computer computer) {
    computerMapper.insert(computer);
  }

  @Override
  public Page<Computer> findAll(Pageable pageable) {
    return null;
  }

  @Override
  public List<Computer> getRecordsForCurrentPage(int start,
      int recordsPerPage) {
    return null;
  }

  @Override
  public int getNoOfRecords() {
    return 0;
  }

  @Override
  public Optional<Computer> findById(String id) {
    return null;
  }

  @Override
  public List<Computer> getList() {
    return null;
  }

  @Override
  public List<Computer> search(String searchId, String searchLocation,
      String status, int start, int recordsPerPage) {
    return null;
  }

  @Override
  public boolean delete(String id) {
    return false;
  }

  @Override
  public List<Computer> search(String searchId, String searchLocation,
      String status) {
    return null;
  }

  @Override
  public List<Computer> getOfflineList() {
    return null;
  }

}
