package com.example.myFirstProject;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name= "payment.provider", havingValue="Razorpay")
public class RayzorpayPAyment implements PaymentServices{

 public String pay(){
     String payment = "RazorPay PAyment";
     System.out.println("PAyment from"+payment);
     return  payment;
 }
}
