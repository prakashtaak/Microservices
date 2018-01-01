package com.store.customer.repository;

import com.store.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(collectionResourceRel ="customer",path = "customer-service")
public interface CustomerRepo extends JpaRepository<Customer,Long> {




}
