package com.abhishek.amar.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.amar.entity.Vehicle;
import com.abhishek.amar.exception.BikeException;
import com.abhishek.amar.response.Response;
import com.abhishek.amar.service.VehicleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author Abhishek Amar
 *
 */
@RestController
@RequestMapping("vehicle") 
@Api(value = "vehicle")
public class VehicleController {

	@Value("${vehicle.save.success}")
	private String vehicleSuccessMessage;

	@Value("${vehicle.delete.message}")
	private String vehicleDeletedMessage;

	@Autowired
	private VehicleService vehicleService;

	@Value("${bike.data.notfound}")
	private String dataNotFoundMessage;

	@Value("${bike.no.activedriver}")
	private String noActiveBike;

	@Value("${bike.wrong.payload}")
	private String somethingWentWrong;

	/**
	 * 
	 * @param vehicle
	 * @return
	 */
	@PostMapping(value = "/save", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ApiOperation(value = "Save vehicle details", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully save vehicle details"),
			@ApiResponse(code = 401, message = "Unauthorised Access"), @ApiResponse(code = 403, message = "forbidden"),
			@ApiResponse(code = 404, message = "resource not found") })

	public ResponseEntity<Object> saveVehicleDetails(@RequestBody Vehicle vehicle) {
		try {
			Response response = new Response(vehicleService.save(vehicle), HttpStatus.OK, new Date(),
					vehicleSuccessMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			throw new BikeException(somethingWentWrong);
		}
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping(value = "/details", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ApiOperation(value = "Get vehicle details", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 401, message = "Unauthorised Access"), @ApiResponse(code = 403, message = "forbidden"),
			@ApiResponse(code = 404, message = "resource not found") })
	public ResponseEntity<Object> getVehicleDetails() {
		List<Vehicle> list = vehicleService.getAllVehicleDetails();
		if (!list.isEmpty()) {
			Response response = new Response(list, HttpStatus.OK, new Date(), vehicleSuccessMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			throw new BikeException(dataNotFoundMessage);
		}
	}

	/**
	 * 
	 * @param vehicleId
	 * @return
	 */
	@GetMapping(value = "/{vehicleId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	@ApiOperation(value = "Get vehicle details by id", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 401, message = "Unauthorised Access"), @ApiResponse(code = 403, message = "forbidden"),
			@ApiResponse(code = 404, message = "resource not found") })
	public ResponseEntity<Object> getVehicleDetailsById(@PathVariable("vehicleId") Integer vehicleId) {
		try {
			Response response = null;
			Vehicle vehicleDetails = vehicleService.getVehicleById(vehicleId);
			if (vehicleDetails != null) {
				response = new Response(vehicleDetails, HttpStatus.OK, new Date(), vehicleSuccessMessage);
				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
				throw new BikeException(dataNotFoundMessage);
			}
		} catch (Exception e) {
			throw new BikeException(dataNotFoundMessage);
		}
	}

	/**
	 * 
	 * @param vehicleId
	 * @return
	 */
	@ApiOperation(value = "Delete vehicle details", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Deleted Successfully"),
			@ApiResponse(code = 401, message = "Unauthorised Access"), @ApiResponse(code = 403, message = "forbidden"),
			@ApiResponse(code = 404, message = "resource not found") })
	@DeleteMapping(value = "/{vehicleId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Object> deleteVehicleDetailsById(@PathVariable("vehicleId") Integer vehicleId) {
		try {
			vehicleService.deleteVehicleById(vehicleId);
			Response response = new Response(null, HttpStatus.OK, new Date(), vehicleDeletedMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			throw new BikeException(dataNotFoundMessage);
		}
	}

	/**
	 * 
	 * @param vehicle
	 * @return
	 */
	@ApiOperation(value = "Update vehicle details", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Updated Successfully"),
			@ApiResponse(code = 401, message = "Unauthorised Access"), @ApiResponse(code = 403, message = "forbidden"),
			@ApiResponse(code = 404, message = "resource not found") })
	@PutMapping(value = "/update", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Object> updateVehicleDetails(@RequestBody Vehicle vehicle) {
		try {
			Response response = null;
			Vehicle vehicleDetails = vehicleService.getVehicleById(vehicle.getId());
			if (vehicleDetails != null) {
				response = new Response(vehicleService.update(vehicle), HttpStatus.OK, new Date(),
						vehicleSuccessMessage);
				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
				throw new BikeException(dataNotFoundMessage);
			}
		} catch (Exception e) {
			throw new BikeException(somethingWentWrong);
		}
	}

}
