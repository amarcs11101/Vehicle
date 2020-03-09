/**
 * 
 */
package com.abhishek.amar.service;

import java.util.List;
import java.util.Optional;

import com.abhishek.amar.entity.CustomerEntity;

/**
 * @author Abhishek Amar
 *
 */
public interface CustomerService {
	public CustomerEntity saveCustomerDetails(CustomerEntity customer);

	public List<CustomerEntity> fetchAllCustomerDetails();

	public CustomerEntity updateCustomerDetails(CustomerEntity customer);

	public void delete(Integer id);

	public Optional<CustomerEntity> getCustomerDetailsById(Integer id);
}
