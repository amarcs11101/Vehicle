/**
 * 
 */
package com.abhishek.amar.serviceimpl;

import java.util.List;

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
		return vehicleRepository.findAll();
	}

	@Override
	public Vehicle getVehicleById(Integer id) {
		return vehicleRepository.findById(id).get();
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
