package com.concretepage.service;

import java.util.List;

import com.concretepage.entity.Customer;

public interface ICustomerService {
     List<Customer> getAllCustomers();
     Customer getCustomerById(int customerId);
     boolean addCustomer(Customer customer);
     void updateCustomer(Customer customer);
     void deleteCustomer(int customerId);
}
