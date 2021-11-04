package com.ethoca.ShoppingCart.controllers;

import com.ethoca.ShoppingCart.models.CustomerRs;
import com.ethoca.ShoppingCart.models.ProductRs;
import com.ethoca.ShoppingCart.models.ShoppingCartRs;
import com.ethoca.ShoppingCart.services.CustomerService;
import com.ethoca.ShoppingCart.services.ProductService;
import com.ethoca.ShoppingCart.services.ShoppingCartService;
import com.ethoca.ShoppingCart.util.Common;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@AllArgsConstructor
@RequestMapping("/products")
@RestController
public class ProductController {

    private final ProductService productService;
    private final ShoppingCartService shoppingCartService;

    @GetMapping(value = "/product", headers = {"Accept=application/x.ethoca.customerInfo.v1+json",
            Common.ACCEPT_LANGUAGE_EN})
    public ResponseEntity getCustomerTable() {
        Map<String, Object> bodyObject = new LinkedHashMap<>();
        try {
            ProductRs productRs = productService.getProductInfo();
            bodyObject.put("product", productRs);
            return ResponseEntity.status(HttpStatus.OK).body(bodyObject);

        } catch (Exception exception) {
            bodyObject.put("status","fail");
            bodyObject.put("message",exception.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyObject);
        }
    }

    @PostMapping(value = "/cart", headers = {"Accept=application/x.ethoca.customerInfo.v1+json",
            Common.ACCEPT_LANGUAGE_EN})
    public ResponseEntity createShoppingCart(@RequestBody JsonNode jsonNode) {
        Map<String, Object> bodyObject = new LinkedHashMap<>();
        try {
            ShoppingCartRs shoppingCartRs = shoppingCartService.createShoppingCart();
            bodyObject.put("cart", shoppingCartRs);
            return ResponseEntity.status(HttpStatus.OK).body(bodyObject);

        } catch (Exception exception) {
            bodyObject.put("status","fail");
            bodyObject.put("message",exception.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyObject);
        }
    }
}
