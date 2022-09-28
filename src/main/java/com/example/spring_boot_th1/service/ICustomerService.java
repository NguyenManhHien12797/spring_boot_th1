package com.example.spring_boot_th1.service;

import com.example.spring_boot_th1.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGeneralService<Customer> {
Page<Customer> findAll(Pageable pageable);
Page<Customer>findAllByNameContaining(String name, Pageable pageable);
}
