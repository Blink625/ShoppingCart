package com.ethoca.ShoppingCart.services;

import com.ethoca.ShoppingCart.entities.ShoppingCartEntity;
import com.ethoca.ShoppingCart.models.ShoppingCartRs;
import com.ethoca.ShoppingCart.repositories.ShoppingCartItemRepository;
import com.ethoca.ShoppingCart.repositories.ShoppingCartRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Convert;

@AllArgsConstructor
@Service
public class ShoppingCartServiceImp implements ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Override
    public ShoppingCartRs createShoppingCart() {

        ShoppingCartEntity i = new ShoppingCartEntity();
        i.setCustomerId(1);
        shoppingCartRepository.save(i);

        ShoppingCartRs cartResponse = new ShoppingCartRs();
        cartResponse.setCartId(i.getID().toString());

        return cartResponse;
    }
}
