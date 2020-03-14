/**
 * 
 */
package com.abhishek.amar.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.amar.entity.BookVehicleEntity;
import com.abhishek.amar.repository.BookVehicleRepository;
import com.abhishek.amar.service.BookVehicleService;

/**
 * @author Abhishek Amar
 *
 *
 */
@Service
public class BookVehicleServiceImpl implements BookVehicleService {
	@Autowired
	BookVehicleRepository repository;

	@Override
	public BookVehicleEntity bookVehicle(BookVehicleEntity book) {
		return repository.save(book);
	}

	@Override
	public void delete(Integer vehicleId) {
		repository.deleteById(vehicleId);
	}

	@Override
	public List<BookVehicleEntity> findAllVehicle() {
		return repository.findAll();
	}

	@Override
	public BookVehicleEntity findByCustomerId(Integer id) {

		return repository.findByCustomerId(id);
	}

	@Override
	public BookVehicleEntity findById(Integer id) { 
		return repository.findById(id).get();
	}
}
