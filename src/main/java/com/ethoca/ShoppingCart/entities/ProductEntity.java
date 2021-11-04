package com.ethoca.ShoppingCart.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Table(name="Product")
@Data
@Entity(name = "ProductEntity")
public class ProductEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "ITEMNUMBER")
    private String itemNumber;

    @Column(name = "ITEMNAME")
    private String itemName;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "Description")
    private String description;

    @Column(name = "COST")
    private Double cost;

}
