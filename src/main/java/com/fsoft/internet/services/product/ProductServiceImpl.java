package com.fsoft.internet.services.product;

import com.fsoft.internet.entities.Product;
import com.fsoft.internet.repositories.product.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

  private IProductRepository productRepository;

  @Autowired
  public ProductServiceImpl(IProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public void createOrUpdate(Product product) {
    productRepository.save(product);
  }

  @Override
  public Page<Product> findAll(Pageable pageable) {
    return productRepository.findAll(pageable);
  }

  @Override
  public Integer getLastId() {
    Optional<Product> product = productRepository.findAll().stream()
        .reduce((first, second) -> second);
    if (product.isPresent()) {
      Integer lastId = Integer
          .parseInt((product.get().getProductId().substring(3)));
      return lastId;
    } else {
      return 0;
    }
  }

  @Override
  public int getNoOfRecords() {
    return productRepository.findAll().size();
  }

  @Override
  public List<Product> getRecordsForCurrentPage(int start, int recordsPerPage) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Product> findById(String id) {
    return null;
  }

  @Override
  public List<Product> getList() {
    return productRepository.findAll();
  }

  @Override
  public List<Product> searchByName(String searchName, int start,
      int recordsPerPage) {
    return null;
  }

  @Override
  public boolean delete(String productId) {
    return false;
  }

}
