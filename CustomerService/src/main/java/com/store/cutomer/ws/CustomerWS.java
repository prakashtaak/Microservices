package com.store.cutomer.ws;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
import com.store.customer.entities.Customer;
import com.store.customer.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RefreshScope
@RestController
@RequestMapping("/customer-service")
public class CustomerWS {

    private CustomerRepo customerRepo;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/applications")
    public Applications getApplications() {
        return eurekaClient.getApplications();
    }

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
