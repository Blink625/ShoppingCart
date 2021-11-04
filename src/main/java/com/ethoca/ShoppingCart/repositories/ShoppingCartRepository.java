package com.ethoca.ShoppingCart.repositories;

import com.ethoca.ShoppingCart.entities.ProductEntity;
import com.ethoca.ShoppingCart.entities.ShoppingCartEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository  extends CrudRepository<ShoppingCartEntity, String> {

}
