package com.concretepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.concretepage.entity.XwsShip;
import com.concretepage.service.IXwsShipService;

@Controller
@RequestMapping("xwing")
public class XwsShipController {
	@Autowired
	private IXwsShipService xwsShipService;

	@GetMapping("ship/{id}")
	public ResponseEntity<XwsShip> getXwsShipById(@PathVariable("id") Integer id) {
		XwsShip ship = xwsShipService.getXwsShipById(id);
		return new ResponseEntity<XwsShip>(ship, HttpStatus.OK);
	}

	@GetMapping("ship")
	public ResponseEntity<List<XwsShip>> getAllXwsShip() {
		List<XwsShip> list = xwsShipService.getAllXwsShip();
		return new ResponseEntity<List<XwsShip>>(list, HttpStatus.OK);
	}

//	@PostMapping("customer")
//	public ResponseEntity<Void> addCustomer(@RequestBody Customer customer, UriComponentsBuilder builder) {
//		boolean flag = customerService.addCustomer(customer);
//		if (flag == false) {
//			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//		}
//		HttpHeaders headers = new HttpHeaders();
//		headers.setLocation(builder.path("/customer/{id}").buildAndExpand(customer.getCustomerId()).toUri());
//		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//	}
//
//	@PutMapping("customer")
//	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
//		customerService.updateCustomer(customer);
//		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
//	}
//
//	@DeleteMapping("customer/{id}")
//	public ResponseEntity<Void> deleteCustomer(@PathVariable("id") Integer id) {
//		customerService.deleteCustomer(id);
//		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//	}
}