package com.abhishek.amar.controller;

import java.util.Date;

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

import com.abhishek.amar.entity.BookVehicleEntity;
import com.abhishek.amar.response.Response;
import com.abhishek.amar.service.BookVehicleService;

@RestController
@RequestMapping("/book")
public class VehicleBookController {
	@Value("${vehicle.book.success}")
	private String successMessage;
	@Autowired
	BookVehicleService bookService;

	/**
	 * 
	 * @param bookVehicle
	 * @return
	 */
	@PostMapping()
	public ResponseEntity<Object> bookVehicle(@RequestBody BookVehicleEntity bookVehicle) {
		Response response = new Response(bookService.bookVehicle(bookVehicle), HttpStatus.OK, new Date(),
				successMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * @param bookVehicle
	 * @return
	 */
	@PutMapping()
	public ResponseEntity<Object> updateVehicle(@RequestBody BookVehicleEntity bookVehicle) {
		Response response = new Response(bookService.bookVehicle(bookVehicle), HttpStatus.OK, new Date(),
				successMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * @param deleteId
	 * @return
	 */
	@DeleteMapping("/{deleteId}")
	public ResponseEntity<Object> deleteVehicle(@PathVariable("deleteId") Integer deleteId) {
		bookService.delete(deleteId);
		Response response = new Response(null, HttpStatus.OK, new Date(), successMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping()
	public ResponseEntity<Object> getAllBookedVehicle() {
		Response response = new Response(bookService.findAllVehicle(), HttpStatus.OK, new Date(), successMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * @param customerId
	 * @return
	 */
	@GetMapping("/{customerId}")
	public ResponseEntity<Object> getBookedVehicleByCustomerId(@PathVariable("customerId") Integer customerId) {
		Response response = new Response(bookService.findByCustomerId(customerId), HttpStatus.OK, new Date(),
				successMessage);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
