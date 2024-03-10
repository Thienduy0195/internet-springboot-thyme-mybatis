package com.fsoft.internet.services.product;

import com.fsoft.internet.mappers.ProductMapper;
import com.fsoft.internet.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    private ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public void createOrUpdate(Product product) {
        productMapper.insert(product);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Integer getLastId() {
        return 0;
    }

    @Override
    public int getNoOfRecords() {
        return 0;
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
        return null;
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
