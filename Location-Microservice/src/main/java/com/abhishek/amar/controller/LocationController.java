/**
 * 
 */
package com.abhishek.amar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Abhishek Amar
 *
 */
@RestController
@RequestMapping("location")
public class LocationController {

	@Value("${google.location.api}")
	private String locationApi;

	@Value("${api.key}")
	private String apiKey;

	@Value("${google.distance.api}")
	private String distanceApi;

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * 
	 * @param source
	 * @param destination
	 * @return
	 */
	@GetMapping("/{source}/{destination}")
	public ResponseEntity<String> getSourceAndDestinationMap(@PathVariable("source") String source,
			@PathVariable("destination") String destination) {
		String locationApi = "https://maps.googleapis.com/maps/api/directions/json?origin=" + source + "&destination="
				+ destination + "&key=" + apiKey;
		String result = restTemplate.getForObject(locationApi, String.class);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	/**
	 * 
	 * @return
	 */
	@GetMapping("/distance")
	public ResponseEntity<String> getDistanceBetweenAllLatitudeAndLongitude() {
		String result = restTemplate.getForObject(distanceApi, String.class);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
