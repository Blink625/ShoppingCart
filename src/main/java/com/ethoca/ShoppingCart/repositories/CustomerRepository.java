package com.ethoca.ShoppingCart.repositories;

import com.ethoca.ShoppingCart.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {

    List<CustomerEntity> findAll();

}
