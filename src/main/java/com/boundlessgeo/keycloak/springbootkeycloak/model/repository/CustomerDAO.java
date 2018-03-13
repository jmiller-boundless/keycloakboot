package com.boundlessgeo.keycloak.springbootkeycloak.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.boundlessgeo.keycloak.springbootkeycloak.model.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
