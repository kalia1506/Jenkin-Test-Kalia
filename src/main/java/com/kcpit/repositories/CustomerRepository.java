package com.kcpit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kcpit.entities.CustomerDtlsEntity;

public interface CustomerRepository extends JpaRepository<CustomerDtlsEntity,Integer> {

}
