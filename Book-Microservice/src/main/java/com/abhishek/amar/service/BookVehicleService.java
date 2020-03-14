/**
 * 
 */
package com.abhishek.amar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.abhishek.amar.entity.BookVehicleEntity;
import com.abhishek.amar.repository.BookVehicleRepository;

/**
 * @author Abhishek Amar
 *
 */
public interface BookVehicleService {
	public BookVehicleEntity bookVehicle(BookVehicleEntity book);

	public void delete(Integer vehicleId);

	public List<BookVehicleEntity> findAllVehicle();

	public BookVehicleEntity findByCustomerId(Integer id);
	
	public BookVehicleEntity findById(Integer id);
}
