package com.concretepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.IXwsShipDAO;
import com.concretepage.entity.XwsShip;

@Service
public class XwsShipService implements IXwsShipService {
	@Autowired
	private IXwsShipDAO xwsShipDAO;

	@Override
	public XwsShip getXwsShipById(int idxwsShip) {
		XwsShip obj = xwsShipDAO.getXwsShipById(idxwsShip);
		return obj;
	}

	@Override
	public List<XwsShip> getAllXwsShip() {
		return xwsShipDAO.getAllXwsShip();
	}

//	@Override
//	public synchronized boolean addCustomer(Customer customer) {
//		if (customerDAO.customerExists(customer.getName(), customer.getSurname())) {
//			return false;
//		} else {
//			customerDAO.addCustomer(customer);
//			return true;
//		}
//	}
//
//	@Override
//	public void updateCustomer(Customer customer) {
//		customerDAO.updateCustomer(customer);
//	}
//
//	@Override
//	public void deleteCustomer(int customerId) {
//		customerDAO.deleteCustomer(customerId);
//	}
}
