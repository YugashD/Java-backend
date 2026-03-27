
package com.example.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paymentservice.consumer.CartRestConsumer;

@RestController
public class PaymentRestController {
    @Autowired
    private CartRestConsumer consumer;

    @GetMapping("/payment/data")
    public String getPaymentData() {

        return "FROM PAYMEN- SERVICE" + consumer.getCartData();
    }
}