package com.example.spring_boot_th1.repository;

import com.example.spring_boot_th1.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {

    Page<Customer>findAllByNameContaining(String name, Pageable pageable);
}
