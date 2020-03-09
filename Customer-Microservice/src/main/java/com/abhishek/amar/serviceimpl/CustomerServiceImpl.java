/**
 * 
 */
package com.abhishek.amar.serviceimpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.amar.entity.CustomerEntity;
import com.abhishek.amar.repository.AddressRepository;
import com.abhishek.amar.repository.CustomerRepository;
import com.abhishek.amar.repository.DocRepository;
import com.abhishek.amar.service.CustomerService;

/**
 * @author Abhishek Amar
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	private AddressRepository addressRepo;

	@Autowired
	private DocRepository docRepo;

	@Override
	public CustomerEntity saveCustomerDetails(CustomerEntity customer) {
		customer.setCreatedDate(new Date());
		return customerRepo.save(customer);

	}

	@Override
	public List<CustomerEntity> fetchAllCustomerDetails() {
		return customerRepo.findAll();
	}

	@Override
	public CustomerEntity updateCustomerDetails(CustomerEntity customer) {
		customer.setModifiedDate(new Date());
		return customerRepo.save(customer);
	}

	@Override
	public void delete(Integer id) {
		customerRepo.deleteById(id);
	}

	@Override
	public Optional<CustomerEntity> getCustomerDetailsById(Integer id) { 
		return customerRepo.findById(id);
	}

}
