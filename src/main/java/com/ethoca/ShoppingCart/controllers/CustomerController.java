package com.ethoca.ShoppingCart.controllers;

import com.ethoca.ShoppingCart.models.CustomerRs;
import com.ethoca.ShoppingCart.services.CustomerService;
import com.ethoca.ShoppingCart.util.Common;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;



@AllArgsConstructor
@RequestMapping("/customers")
@RestController
public class CustomerController {

    private final CustomerService customerService;

//    @GetMapping(value = "/customer", headers = {"Accept=application/x.ethoca.customerInfo.v1+json",
//            Common.SHAPE_WEB, Common.DETAILS_BASIC, Common.ACCEPT_LANGUAGE_EN, Common.ORIGIN})
    @GetMapping(value = "/customer", headers = {"Accept=application/x.ethoca.customerInfo.v1+json",
            Common.ACCEPT_LANGUAGE_EN})
    public ResponseEntity getCustomerTable() {
        Map<String, Object> bodyObject = new LinkedHashMap<>();
        try {
            CustomerRs customerRs = customerService.getCustomerInfo();
            bodyObject.put("customer", customerRs);
            return ResponseEntity.status(HttpStatus.OK).body(bodyObject);

        } catch (Exception exception) {
            bodyObject.put("status","fail");
            bodyObject.put("message",exception.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyObject);

        }
    }

}
