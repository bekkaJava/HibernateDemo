package com.hibernate.hibernatedemo.dao;
import com.hibernate.hibernatedemo.entity.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> findAll();

    public Product findById(Integer theId);

    public void deleteById(Integer theId);

    public void save(Product p);

    public void update(Product p);
}
