package com.eocean.ivr.controller;

import com.eocean.ivr.persistance.domain.Customer;
import com.eocean.ivr.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;


import java.util.List;

@RestController
@RequestMapping("/customer")

public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/add")
    public ResponseEntity addCustomer(Customer customer){

        customerRepository.save(customer);

        return null;
    }

    @GetMapping(value="/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayHello() {
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        byte myNum1 = 100;
        long myNum2 = 5000;
        double myNum3 = 5;
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        int myInt = (int) 9.78;
        int myInt1 = 9;
        double myDouble = myInt1;
        int x = 100 + 5;
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
//        char a = 65, b = 30, c = 40; Ask Question with Hassan

//        System.out.println("Letter " + myLetter);

        return ("Hello there! " + sum1);
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomer(){
        List<Customer> customers  = (List<Customer>) customerRepository.findAll();
        return customers;
    }


    }

//    @GetMapping(value = "/byid" , params = {"id"})
//    public String getAllCustomer(@Param("id") Long customerId){
//        try{
//            Optional<Customer> customers =  customerRepository.findById(customerId);
//            //if(custom == null)
//        }
//        catch (NullPointerException n){
//
//        }
//        catch (Exception e ){
//
//            return "No data found";
//        }
//        String customer;
//        return "customer";
//    }


//}
