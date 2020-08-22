/**
 * 
 */
package com.abhishek.amar.service;

import java.util.List;

import com.abhishek.amar.entity.Routine;
import com.abhishek.amar.entity.Vehicle;

/**
 * @author Abhishek Amar
 *
 */

public interface VehicleService {
	public Vehicle save(Vehicle vehicleBean);

	public List<Vehicle> getAllVehicleDetails();

	public Vehicle getVehicleById(Integer id);

	public void deleteVehicleById(Integer id);

	public Vehicle update(Vehicle vehicle);
	
	public List<Routine> vehicleCount();
}
