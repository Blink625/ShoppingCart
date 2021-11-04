package com.ethoca.ShoppingCart.models;

import com.ethoca.ShoppingCart.entities.CustomerEntity;
import com.ethoca.ShoppingCart.entities.ProductEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductRs {
    @JsonProperty("products")
    private List<ProductEntity> productEntityList;
}