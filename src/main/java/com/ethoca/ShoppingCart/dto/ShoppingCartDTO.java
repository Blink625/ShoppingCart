package com.ethoca.ShoppingCart.dto;

import com.ethoca.ShoppingCart.entities.ShoppingCartEntity;
import com.ethoca.ShoppingCart.entities.ShoppingCartItemEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShoppingCartDTO {

    @JsonProperty("CustomerId")
    private String customerId;

    @JsonProperty("ShoppingItems")
    private List<ShoppingCartItemEntity> shoppingCartEntities;

}