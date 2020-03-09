/**
 * 
 */
package com.abhishek.amar.service;

import java.util.List;
import java.util.Optional;

import com.abhishek.amar.entity.Vehicle;

/**
 * @author Abhishek Amar
 *
 */

public interface VehicleService {
	public Vehicle save(Vehicle vehicleBean);

	public List<Vehicle> getAllVehicleDetails();

	public Optional<Vehicle> getVehicleById(Integer id);

	public void deleteVehicleById(Integer id);

	public Vehicle update(Vehicle vehicle);
}
