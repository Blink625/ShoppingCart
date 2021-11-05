package com.ethoca.ShoppingCart.controllers;

import com.ethoca.ShoppingCart.dto.ShoppingCartDTO;
import com.ethoca.ShoppingCart.entities.ShoppingCartEntity;
import com.ethoca.ShoppingCart.entities.ShoppingCartItemEntity;
import com.ethoca.ShoppingCart.models.ShoppingCartRs;
import com.ethoca.ShoppingCart.services.ShoppingCartService;
import com.ethoca.ShoppingCart.util.Common;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RequestMapping("/shoppingCart")
@RestController
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    // Take a shopping cart item and add it to the database
    @PostMapping(value = "/cart", headers = {"Accept=application/x.ethoca.customerInfo.v1+json",
            Common.ACCEPT_LANGUAGE_EN})
    public ResponseEntity createShoppingCart(@RequestBody ShoppingCartDTO shoppingCartItems) {
        Map<String, Object> bodyObject = new LinkedHashMap<>();
        try {
            ShoppingCartRs shoppingCartRs = shoppingCartService.createShoppingCart(shoppingCartItems);
            bodyObject.put("cart", shoppingCartRs);
            return ResponseEntity.status(HttpStatus.OK).body(bodyObject);

        } catch (Exception exception) {
            bodyObject.put("status","fail");
            bodyObject.put("message",exception.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyObject);
        }
    }
}
