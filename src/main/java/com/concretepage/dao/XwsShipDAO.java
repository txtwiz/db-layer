package com.concretepage.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.entity.XwsShip;
@Transactional
@Repository
public class XwsShipDAO implements IXwsShipDAO {
	@PersistenceContext	
	private EntityManager entityManager;	
	@Override
	public XwsShip getXwsShipById(int idxwsShip) {
		return entityManager.find(XwsShip.class, idxwsShip);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<XwsShip> getAllXwsShip() {
		String hql = "FROM XwsShip";
		return (List<XwsShip>) entityManager.createQuery(hql).getResultList();
	}	
//	@Override
//	public void addCustomer(Customer customer) {
//		entityManager.persist(customer);
//	}
//	@Override
//	public void updateCustomer(Customer customer) {
//		Customer cst = getCustomerById(customer.getCustomerId());
//		cst.setName(customer.getName());
//		cst.setSurname(customer.getSurname());
//		cst.setEmail(customer.getEmail());
//		entityManager.flush();
//	}
//	@Override
//	public void deleteCustomer(int customerId) {
//		entityManager.remove(getCustomerById(customerId));
//	}
//	@Override
//	public boolean customerExists(String name, String surname) {
//		String hql = "FROM Customer as cst WHERE cst.name = ? and cst.surname = ?";
//		int count = entityManager.createQuery(hql).setParameter(1, name)
//		              .setParameter(2, surname).getResultList().size();
//		return count > 0 ? true : false;
//	}
}
