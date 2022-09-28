package com.example.spring_boot_th1.repository;

import com.example.spring_boot_th1.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer,Long> {
}
