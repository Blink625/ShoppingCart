package com.ethoca.ShoppingCart.services;

import com.ethoca.ShoppingCart.entities.CustomerEntity;
import com.ethoca.ShoppingCart.entities.ProductEntity;
import com.ethoca.ShoppingCart.models.CustomerRs;
import com.ethoca.ShoppingCart.models.ProductRs;
import com.ethoca.ShoppingCart.repositories.CustomerRepository;
import com.ethoca.ShoppingCart.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductRs getProductInfo() {
        List<ProductEntity> productList = productRepository.findAll().stream().collect(Collectors.toList());
        ProductRs productRs = new ProductRs(productList);
        return productRs;
    }
}
