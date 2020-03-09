/**
 * 
 */
package com.abhishek.amar.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.amar.entity.Vehicle;
import com.abhishek.amar.repository.VehicleRepository;
import com.abhishek.amar.service.VehicleService;

/**
 * @author Abhishek Amar
 *
 */
@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public Vehicle save(Vehicle vehicleBean) {
		return vehicleRepository.save(vehicleBean);
	}

	@Override
	public List<Vehicle> getAllVehicleDetails() {
		List<Vehicle> list = vehicleRepository.findAll();
		return list;
	}

	@Override
	public Optional<Vehicle> getVehicleById(Integer id) {
		Optional<Vehicle> vehicle = vehicleRepository.findById(id);
		return vehicle;
	}

	@Override
	public void deleteVehicleById(Integer id) {
		vehicleRepository.deleteById(id);
	}

	@Override
	public Vehicle update(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

}
