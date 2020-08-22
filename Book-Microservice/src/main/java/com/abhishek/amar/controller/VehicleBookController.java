package com.abhishek.amar.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
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

import com.abhishek.amar.beans.DemoBean;
import com.abhishek.amar.entity.BookVehicleEntity;
import com.abhishek.amar.entity.Routine;
import com.abhishek.amar.exception.BookingException;
import com.abhishek.amar.response.Response;
import com.abhishek.amar.service.BookVehicleService;

@RestController
@CrossOrigin("*")
@RequestMapping("book")  
public class VehicleBookController {

	@Value("${vehicle.book.success}")
	private String successMessage;

	@Autowired
	private BookVehicleService bookService;

	@Value("${book.data.notfound}")
	private String dataNotFoundMessage;

	@Value("${book.no.activedriver}")
	private String noActiveDriver;

	@Value("${book.wrong.payload}")
	private String somethingWentWrong;

	private Logger logger = LogManager.getLogger();

	/**
	 * 
	 * @param bookVehicle
	 * @return
	 */
	@PostMapping("/save")
	public ResponseEntity<Object> bookVehicle(@RequestBody BookVehicleEntity bookVehicle) {
		try {
			Response response = new Response(bookService.bookVehicle(bookVehicle), HttpStatus.OK, new Date(),
					successMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			throw new BookingException(somethingWentWrong);
		}
	}

	/**
	 * 
	 * @param bookVehicle
	 * @return
	 */
	@PutMapping("/update")
	public ResponseEntity<Object> updateVehicle(@RequestBody BookVehicleEntity bookVehicle) {
		try {
			if (bookService.findById(bookVehicle.getId()) != null) {
				Response response = new Response(bookService.bookVehicle(bookVehicle), HttpStatus.OK, new Date(),
						successMessage);
				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
				throw new BookingException(dataNotFoundMessage);
			}
		} catch (Exception e) {
			throw new BookingException(somethingWentWrong);
		}
	}

	/**
	 * 
	 * @param deleteId
	 * @return
	 */
	@DeleteMapping("/{deleteId}")
	public ResponseEntity<Object> deleteVehicle(@PathVariable("deleteId") Integer deleteId) {
		try {
			bookService.delete(deleteId);
			Response response = new Response(null, HttpStatus.OK, new Date(), successMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			throw new BookingException(dataNotFoundMessage);
		}
	}

	/**
	 * 
	 * @return
	 */
	@GetMapping("/all")
	public ResponseEntity<Object> getAllBookedVehicle() {
		try {
			Response response = new Response(bookService.findAllVehicle(), HttpStatus.OK, new Date(), successMessage);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {
			throw new BookingException(dataNotFoundMessage);
		}
	}

	/**
	 * 
	 * @param customerId
	 * @return
	 */
	@GetMapping("/{customerId}")
	public ResponseEntity<Object> getBookedVehicleByCustomerId(@PathVariable("customerId") Integer customerId) {
		try {
			BookVehicleEntity entity = bookService.findByCustomerId(customerId);
			if (entity != null) {
				Response response = new Response(entity, HttpStatus.OK, new Date(), successMessage);
				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
				throw new BookingException(dataNotFoundMessage);
			}
		} catch (Exception e) {
			throw new BookingException(dataNotFoundMessage);
		}
	}
	/**
	 * 
	 * @param customerId
	 * @return
	 */
	@GetMapping("/count")
	public ResponseEntity<Object> getBookedVehicleCount() { 
		try { 
			if (!bookService.vehicleCount().isEmpty()) {
				Response response = new Response(bookService.vehicleCount(), HttpStatus.OK, new Date(), successMessage);
				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
				throw new BookingException(dataNotFoundMessage);
			}
		} catch (Exception e) {
			throw new BookingException(dataNotFoundMessage);
		}
	}

}
