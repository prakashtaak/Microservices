package com.store.customer.repository;

import com.store.customer.entitties.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(collectionResourceRel ="customer",path = "customer")
public interface CustomerRepo extends JpaRepository<Customer,Long> {

   @RestResource(path = "by-id")
   public Customer getCustomerById(@Param("customerId") Long id);


}
