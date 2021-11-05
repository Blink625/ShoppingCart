package com.ethoca.ShoppingCart.services;

import com.ethoca.ShoppingCart.dto.ShoppingCartDTO;
import com.ethoca.ShoppingCart.entities.ShoppingCartEntity;
import com.ethoca.ShoppingCart.entities.ShoppingCartItemEntity;
import com.ethoca.ShoppingCart.models.ShoppingCartRs;
import com.ethoca.ShoppingCart.repositories.ShoppingCartItemRepository;
import com.ethoca.ShoppingCart.repositories.ShoppingCartRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@AllArgsConstructor
@Service
public class ShoppingCartServiceImp implements ShoppingCartService {

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private ShoppingCartItemRepository shoppingCartItemRepository;

    @Override
    public ShoppingCartRs createShoppingCart(ShoppingCartDTO shoppingCartDTO) {
        Timestamp purchaseTime = new Timestamp(System.currentTimeMillis());

        ShoppingCartEntity cartInfo = new ShoppingCartEntity();
        cartInfo.setCustomerId(1);
        cartInfo.setCreatedDate(purchaseTime);
        shoppingCartRepository.save(cartInfo);

        List<ShoppingCartItemEntity> shoppingCartItems = shoppingCartDTO.getShoppingCartEntities();
        for (ShoppingCartItemEntity item : shoppingCartItems)
        {
            item.setShoppingCartId(cartInfo.getID().toString());
            shoppingCartItemRepository.save(item);
        }

        ShoppingCartRs cartResponse = new ShoppingCartRs();
        cartResponse.setCartId(cartInfo.getID().toString());
        cartResponse.setPurchaseDate(purchaseTime);

        return cartResponse;
    }

}
