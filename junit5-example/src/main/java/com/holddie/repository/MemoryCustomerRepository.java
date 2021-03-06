package com.holddie.repository;

import java.util.Arrays;
import java.util.List;

import com.holddie.model.Customer;

public class MemoryCustomerRepository implements CustomerRespository {

    private static List<Customer> DATA =
            Arrays.asList(new Customer(1L, "mkyong", 38), new Customer(2L, "jack", 40));

    @Override
    public List<Customer> findAll() {
        return DATA;
    }

    @Override
    public Customer findOne(Long id) {
        return DATA.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public boolean isDataFromMemory() {
        return true;
    }
}
