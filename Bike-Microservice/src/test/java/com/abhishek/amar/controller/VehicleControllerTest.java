package com.abhishek.amar.controller;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

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
