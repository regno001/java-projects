package com.example.myFirstProject;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RestController;

@Component
// @Service
//@Repository
//@RestController
//@Controller
@ConditionalOnProperty(name= "payment.provider", havingValue="stripe")
public class StripePAyementServices implements PaymentServices{
    @Override
    public String pay() {
        String payment = "Stripe Payment ";
        System.out.println("PAyment From..."+payment);
        return payment;
    }
}
