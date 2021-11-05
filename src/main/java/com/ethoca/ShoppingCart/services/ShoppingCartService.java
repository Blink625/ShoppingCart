package com.ethoca.ShoppingCart.services;

import com.ethoca.ShoppingCart.dto.ShoppingCartDTO;
import com.ethoca.ShoppingCart.entities.ShoppingCartItemEntity;
import com.ethoca.ShoppingCart.models.ShoppingCartRs;

import java.util.List;


public interface ShoppingCartService {
    ShoppingCartRs createShoppingCart(ShoppingCartDTO shoppingCartItems);
}
