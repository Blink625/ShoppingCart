package com.ethoca.ShoppingCart.models;

import com.ethoca.ShoppingCart.entities.CustomerEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerRs {

    @JsonProperty("customers")
    private List<CustomerEntity> customerEntityList;
}
