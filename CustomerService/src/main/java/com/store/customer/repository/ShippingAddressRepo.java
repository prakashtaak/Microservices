package com.store.customer.repository;

import com.store.customer.entities.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="customer-service")
public interface ShippingAddressRepo extends JpaRepository<ShippingAddress,Long> {
}
