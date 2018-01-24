package com.concretepage.service;

import java.util.List;

import com.concretepage.entity.XwsShip;

public interface IXwsShipService {
     List<XwsShip> getAllXwsShip();
     XwsShip getXwsShipById(int customerId);
//     boolean addCustomer(Customer customer);
//     void updateCustomer(Customer customer);
//     void deleteCustomer(int customerId);
}
