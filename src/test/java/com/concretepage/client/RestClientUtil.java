package com.concretepage.client;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.concretepage.entity.Customer;

public class RestClientUtil {
	public void getCustomerByIdDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/test/customer/{id}";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Customer> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Customer.class, 1);
		Customer customer = responseEntity.getBody();
		System.out.println("Id:" + customer.getCustomerId() + ", Name:" + customer.getName() + ", Surname:"
				+ customer.getSurname());
	}

	public void getAllCustomersDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/test/customers";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<Customer[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,
				Customer[].class);
		Customer[] customers = responseEntity.getBody();
		for (Customer customer : customers) {
			System.out.println("Id:" + customer.getCustomerId() + ", Name:" + customer.getName() + ", Surname: "
					+ customer.getSurname());
		}
	}

	public void addCustomerDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/test/customer";
		Customer objCustomer = new Customer();
		objCustomer.setName("Java");
		objCustomer.setSurname("Test");
		objCustomer.setEmail("java@test.test");
		HttpEntity<Customer> requestEntity = new HttpEntity<Customer>(objCustomer, headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.println(uri.getPath());
	}

	public void updateCustomerDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/test/customer";
		Customer objCustomer = new Customer();
		objCustomer.setCustomerId(1);
		objCustomer.setName("Test");
		objCustomer.setSurname("JS");
		HttpEntity<Customer> requestEntity = new HttpEntity<Customer>(objCustomer, headers);
		restTemplate.put(url, requestEntity);
	}

	public void deleteCustomerDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/test/customer/{id}";
		HttpEntity<Customer> requestEntity = new HttpEntity<Customer>(headers);
		restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, 4);
	}

	public static void main(String args[]) {
		RestClientUtil util = new RestClientUtil();
		// util.getArticleByIdDemo();
		util.getAllCustomersDemo();
		// util.addArticleDemo();
		// util.updateArticleDemo();
		// util.deleteArticleDemo();
	}
}
