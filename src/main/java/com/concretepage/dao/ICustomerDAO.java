package com.concretepage.dao;
import java.util.List;
import com.concretepage.entity.Customer;
public interface ICustomerDAO {
    List<Customer> getAllCustomers();
    Customer getCustomerById(int customerId);
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int customerId);
    boolean customerExists(String name, String surname);
}
 