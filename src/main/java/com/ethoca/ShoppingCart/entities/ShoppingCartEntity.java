package com.ethoca.ShoppingCart.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.type.descriptor.java.JdbcTimestampTypeDescriptor;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Table(name="SHOPPINGCART")
@Data
@Entity(name = "ShoppingCartEntity")
public class ShoppingCartEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "CUSTOMERID")
    private Integer customerId;

    @Column(name = "CREATEDDATE")
    private Timestamp createdDate;

}
