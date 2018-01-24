package com.concretepage.dao;
import java.util.List;
import com.concretepage.entity.XwsShip;
public interface IXwsShipDAO {
    List<XwsShip> getAllXwsShip();
    XwsShip getXwsShipById(int idxwsShip);
//    void addCustomer(Customer customer);
//    void updateCustomer(Customer customer);
//    void deleteCustomer(int customerId);
//    boolean customerExists(String name, String surname);
}
 