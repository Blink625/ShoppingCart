package com.ethoca.ShoppingCart.repositories;

import com.ethoca.ShoppingCart.entities.ProductEntity;
import com.ethoca.ShoppingCart.entities.ShoppingCartItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartItemRepository extends CrudRepository<ShoppingCartItemEntity, String> {
    List<ShoppingCartItemEntity> findAll();
}
