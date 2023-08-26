package com.hibernate.hibernatedemo.service;

import com.hibernate.hibernatedemo.dao.ProductDao;
import com.hibernate.hibernatedemo.entity.Product;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findById(Integer theId) {
        return productDao.findById(theId);
    }

    @Transactional
    @Override
    public void deleteById(Integer theId) {
        productDao.deleteById(theId);

    }

    @Transactional
    @Override
    public void save(Product p) {
        productDao.save(p);
    }

    @Transactional
    @Override
    public void update(Product p) {
        productDao.update(p);

    }
}
