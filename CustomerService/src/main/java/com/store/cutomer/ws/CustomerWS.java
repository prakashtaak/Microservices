package com.store.cutomer.ws;

import com.store.customer.entitties.Customer;
import com.store.customer.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.Collection;

@RefreshScope
@RestController
@RequestMapping("/customer-service")
public class CustomerWS {

    private CustomerRepo customerRepo;

    @Autowired
    public CustomerWS(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Value("${dataPath:Hello default}")
    private String dataPath;



    @GetMapping("/getMessage")
    public String getMessage(){
        return dataPath;
    }

    @GetMapping("/customers")
    public Collection<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(@Validated @RequestBody Customer customer){

        Customer customer1= customerRepo.save(customer);
        customerRepo.flush();
        return customer1;
    }







}
