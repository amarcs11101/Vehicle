package com.abhishek.amar.repository;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.abhishek.amar.entity.Vehicle;
import com.abhishek.amar.enums.VehicleType;
import com.abhishek.amar.service.VehicleService;

@SpringBootTest
class VehicleRepositoryTest {
	@MockBean
	VehicleRepository vehicleRepository;
	@Autowired
	VehicleService vehicleService;

	@Test
	void saveVehicleTest() {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(1);
		vehicle.setVehicleNumber("1");
		vehicle.setVehicleType(VehicleType.BIKE);
		when(vehicleRepository.save(vehicle)).thenReturn(vehicle);
	}

	@Test
	void getAllVehicleDetailsTest() {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleId(1);
		vehicle.setVehicleNumber("1");
		vehicle.setVehicleType(VehicleType.BIKE);
		List<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(vehicle);
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleId(1);
		vehicle1.setVehicleNumber("1");
		vehicle1.setVehicleType(VehicleType.BIKE);
		vehicleList.add(vehicle1);
		when(vehicleRepository.findAll()).thenReturn(vehicleList);
	}

	/**
	 * check below Junit test as its not complete
	 */
	@Test
	void getVehicleByVehicleId() {
		Vehicle vehicle = new Vehicle();
		vehicle.setId(35);
		vehicle.setVehicleId(5);
		vehicle.setVehicleNumber("BR-888");
		vehicle.setVehicleType(VehicleType.BIKE);
		List<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(vehicle);
	}

	@Test
	void deleteVehicle() {
		Integer id = 35;
		vehicleService.deleteVehicleById(id);
		verify(vehicleRepository, times(1)).deleteById(id);
	}
}
