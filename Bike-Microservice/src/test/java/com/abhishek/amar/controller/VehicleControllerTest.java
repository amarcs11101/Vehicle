package com.abhishek.amar.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.hibernate.query.criteria.internal.expression.SearchedCaseExpression.WhenClause;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.abhishek.amar.entity.Vehicle;
import com.abhishek.amar.entity.VehicleOwner;
import com.abhishek.amar.enums.VehicleType;
import com.abhishek.amar.repository.VehicleRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

class VehicleControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;

	ObjectMapper objectMapper = new ObjectMapper();

	Vehicle vehicle;

	VehicleOwner vehicleOwner;

	@MockBean
	private VehicleRepository vehicleRepository;

	@Before(value = "VehicleControllerTest")
	public void setUp() throws Exception {
	/*	mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		vehicle = new Vehicle();
		vehicle.setVehicleId(1);
		vehicle.setVehicleNumber("1234");
		vehicle.setVehicleType(VehicleType.BIKE);
		vehicleOwner = new VehicleOwner();
		vehicleOwner.setVehicleId(1);
		vehicleOwner.setCreatedAt(new Date());
		vehicleOwner.setCustomerId(1);
		List<VehicleOwner> list = new ArrayList<>();
		list.add(vehicleOwner);
		vehicle.setOwner(list); */
	}

	@Test
	void testSaveVehicleDetails() throws Exception { 
		//Mockito.when(vehicleRepository.save(vehicle)).thenReturn(vehicle);
	}

	@Test
	void testGetVehicleDetails() {
	}

	@Test
	void testGetVehicleDetailsById() {
	}

	@Test
	void testDeleteVehicleDetailsById() {
	}

	@Test
	void testUpdateVehicleDetails() {
	}

}
