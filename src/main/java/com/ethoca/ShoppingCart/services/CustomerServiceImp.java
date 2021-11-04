package com.ethoca.ShoppingCart.services;

import com.ethoca.ShoppingCart.entities.CustomerEntity;
import com.ethoca.ShoppingCart.models.CustomerRs;
import com.ethoca.ShoppingCart.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CustomerServiceImp implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public CustomerRs getCustomerInfo() {
        List<CustomerEntity> customerList = customerRepository.findAll().stream().collect(Collectors.toList());
        Mic
        return customerRs;
    }


}
