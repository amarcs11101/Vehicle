package com.abhishek.amar.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;
import org.springframework.web.context.WebApplicationContext;

import com.abhishek.amar.entity.Vehicle;
import com.abhishek.amar.enums.VehicleType;
import com.abhishek.amar.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

class VehicleControllerTest {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;

	ObjectMapper objectMapper = new ObjectMapper();

	@Before(value = "VehicleControllerTest")
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	void testSaveVehicleDetails() throws Exception {
		/*
		 * Vehicle vehicle = new Vehicle(); vehicle.setVehicleId(1);
		 * vehicle.setVehicleNumber("1"); vehicle.setVehicleType(VehicleType.BIKE);
		 * String jsonRequest = objectMapper.writeValueAsString(vehicle); MvcResult
		 * result = (MvcResult) mockMvc
		 * .perform(post("/vehicle/save").content(jsonRequest).contentType(MediaType.
		 * APPLICATION_JSON)) .andExpect(status().isOk()); String resultContent =
		 * result.getResponse().getContentAsString(); ResponseEntity<Object> response =
		 * objectMapper.readValue(resultContent, ResponseEntity.class);
		 * assertEquals(response.getStatusCode(), HttpStatus.OK);
		 */
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
