package com.spring.batching.customer;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerItemProcess implements ItemProcessor<Customers,Customers> {


    @Override
    public Customers process(Customers customers) throws Exception {
        return customers;
    }
}
