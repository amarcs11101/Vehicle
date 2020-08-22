/**
 * 
 */
package com.abhishek.amar.controller;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.amar.entity.CustomerEntity;
import com.abhishek.amar.exception.CustomerExceptions;
import com.abhishek.amar.response.Response;
import com.abhishek.amar.service.CustomerService;

/**
 * @author Abhishek Amar
 *
 */
@RestController
@RequestMapping(value = "customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@Value("${customer.save.success}")
	private String successMessage;

	@Value("${custom.exception.message}")
	private String errorMessage;

	@Value("${customer.data.notfound}")
	private String dataNotFoundMessage;

	@Value("${customer.no.activedriver}")
	private String noActiveDriver;

	@Value("${customer.wrong.payload}")
	private String somethingWentWrong;
	private Logger logger = LogManager.getLogger();

	/**
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping("/save")
	public ResponseEntity<Object> saveCustomerDetails(@RequestBody CustomerEntity customer) {
		try {
			Response response = new Response(customerService.saveCustomerDetails(customer), HttpStatus.OK, new Date(),
					successMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(":: /save :: saveCustomerDetails ::", e);
			throw new CustomerExceptions(somethingWentWrong);
		}
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping("/find")
	public ResponseEntity<Object> fetchAllCustomerDetails() {
		try {
			Response response = new Response(customerService.fetchAllCustomerDetails(), HttpStatus.OK, new Date(),
					successMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(":: /{find} :: fetchAllCustomerDetails ::", e);
			throw new CustomerExceptions(dataNotFoundMessage);
		}
	}

	/**
	 * 
	 * @param customerId
	 * @return
	 */
	@GetMapping("/{customerId}")
	public ResponseEntity<Object> getCustomerById(@PathVariable("customerId") Integer customerId) {
		try {
			Response response = new Response(customerService.getCustomerDetailsById(customerId), HttpStatus.OK,
					new Date(), successMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(":: /{customerId} :: getCustomerById ::", e);
			throw new CustomerExceptions(dataNotFoundMessage);
		}
	}

	/**
	 * 
	 * @param customer
	 * @return
	 */
	@PutMapping("/update")
	public ResponseEntity<Object> updateCustomerDetails(@RequestBody CustomerEntity customer) {
		try {
			Response response = new Response(customerService.updateCustomerDetails(customer), HttpStatus.OK, new Date(),
					successMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(":: /customer/update :: updateCustomerDetails ::", e);
			throw new CustomerExceptions(somethingWentWrong);
		}
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{deleteId}")
	public ResponseEntity<Object> deleteCustomerDetails(@PathVariable("deleteId") Integer id) {
		Response response = null;
		try {
			customerService.delete(id);
			response = new Response(null, HttpStatus.OK, new Date(), successMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(":: /customer/{deleteId} deleteCustomerDetails ::", e);
			throw new CustomerExceptions(dataNotFoundMessage);
		}
	}

	@GetMapping("/active/driver")
	public ResponseEntity<Object> getActiveDriver() {
		try {
			Response response = new Response(customerService.getAllActiveDriver(), HttpStatus.OK, new Date(),
					successMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(":: /customer/active/driver getActiveDriver ::", e);
			throw new CustomerExceptions(noActiveDriver);
		}
	}

}
