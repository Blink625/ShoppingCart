package com.ethoca.ShoppingCart.repositories;

import com.ethoca.ShoppingCart.entities.CustomerEntity;
import com.ethoca.ShoppingCart.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, String>{
    List<ProductEntity> findAll();
}


