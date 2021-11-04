package com.ethoca.ShoppingCart.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Table(name="SHOPPINGCARTITEM")
@Data
@Entity(name = "ShoppingCartItemEntity")
public class ShoppingCartItemEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "SHOPPINGCARTID")
    private String shoppingCartId;

    @Column(name = "PRODUCTID")
    private String productId;

}
