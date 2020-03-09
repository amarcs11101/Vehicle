package com.abhishek.amar.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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

import com.abhishek.amar.entity.Vehicle;
import com.abhishek.amar.response.Response;
import com.abhishek.amar.service.VehicleService;

/**
 * @author Abhishek Amar
 *
 */
@RestController
@RequestMapping("vehicle")
public class VehicleController {

	@Value("${vehicle.save.success}")
	private String vehicleSuccessMessage;

	@Value("${vehicle.delete.message}")
	private String vehicleDeletedMessage;

	@Autowired
	private VehicleService vehicleService;

	/**
	 * 
	 * @param vehicle
	 * @return
	 */
	@PostMapping()
	public ResponseEntity<Object> saveVehicleDetails(@RequestBody Vehicle vehicle) {
		Response response = new Response(vehicleService.save(vehicle), HttpStatus.OK, new Date(),
				vehicleSuccessMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping()
	public ResponseEntity<Object> getVehicleDetails() {
		List<Vehicle> list = vehicleService.getAllVehicleDetails();
		Response response = new Response(list, HttpStatus.OK, new Date(), vehicleSuccessMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * @param vehicleId
	 * @return
	 */
	@GetMapping("/{vehicleId}")
	public ResponseEntity<Object> getVehicleDetailsById(@PathVariable("vehicleId") Integer vehicleId) {
		Optional<Vehicle> vehicleDetails = vehicleService.getVehicleById(vehicleId);
		Response response = new Response(vehicleDetails, HttpStatus.OK, new Date(), vehicleSuccessMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * @param vehicleId
	 * @return
	 */
	@DeleteMapping("/{vehicleId}")
	public ResponseEntity<Object> deleteVehicleDetailsById(@PathVariable("vehicleId") Integer vehicleId) {
		vehicleService.deleteVehicleById(vehicleId);
		Response response = new Response(null, HttpStatus.OK, new Date(), vehicleDeletedMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * @param vehicle
	 * @return
	 */
	@PutMapping()
	public ResponseEntity<Object> updateVehicleDetails(@RequestBody Vehicle vehicle) {
		Response response = new Response(vehicleService.update(vehicle), HttpStatus.OK, new Date(),
				vehicleSuccessMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
