package com.hibernate.hibernatedemo.dao;

import com.hibernate.hibernatedemo.entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {
    private final EntityManager entityManager;

    public ProductDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager.createQuery("FROM Product", Product.class);
        return query.getResultList();
    }

    @Override
    public Product findById(Integer theId) {
        return entityManager.find(Product.class, theId);
    }

    @Override
    public void deleteById(Integer theId) {
        Product tempProduct = entityManager.find(Product.class, theId);
        entityManager.remove(tempProduct);
    }

    @Override
    public void update(Product p) {
        entityManager.merge(p);
    }

    @Override
    public void save(Product p) {
        entityManager.persist(p);
    }
}
