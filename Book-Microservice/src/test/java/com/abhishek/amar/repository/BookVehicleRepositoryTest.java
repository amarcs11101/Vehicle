/**
 * 
 */
package com.abhishek.amar.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.abhishek.amar.entity.BookVehicleEntity;
import com.abhishek.amar.enums.VehicleBookType;
import com.abhishek.amar.service.BookVehicleService;

/**
 * @author Abhishek Amar
 *
 */
@SpringBootTest
class BookVehicleRepositoryTest {
	@MockBean
	BookVehicleRepository bookVehicleRepository;
	@Autowired
	BookVehicleService bookVehicleService;

	@Test
	void bookVehicle() {
		BookVehicleEntity bookVehicle = new BookVehicleEntity();
		bookVehicle.setCustomerId(5);
		bookVehicle.setDestination("9990");
		bookVehicle.setSource("78900");
		bookVehicle.setVehicleBookedType(VehicleBookType.VEHICLE_FREE);
		bookVehicle.setVehicleId(5);
		when(bookVehicleRepository.save(bookVehicle)).thenReturn(bookVehicle);
	}
	
	@Test
	void updateVehicle() {
		BookVehicleEntity bookVehicle = new BookVehicleEntity();
		bookVehicle.setCustomerId(5);
		bookVehicle.setDestination("9990");
		bookVehicle.setSource("78900");
		bookVehicle.setVehicleBookedType(VehicleBookType.VEHICLE_FREE);
		bookVehicle.setVehicleId(5);
		bookVehicle.setId(20);
		when(bookVehicleRepository.save(bookVehicle)).thenReturn(bookVehicle);
		assertEquals(bookVehicleRepository.save(bookVehicle).getId(), bookVehicle.getId());
	}
	
	/*@Test
	void findById() {
		BookVehicleEntity bookVehicle= new BookVehicleEntity();
		bookVehicle.setCustomerId(5);
		bookVehicle.setDestination("9990");
		bookVehicle.setSource("78900");
		bookVehicle.setVehicleBookedType(VehicleBookType.VEHICLE_FREE);
		bookVehicle.setVehicleId(5);
		bookVehicle.setId(20);
		when(bookVehicleRepository.findById(20).get().getId()).thenReturn(20);
	}*/
	
	@Test
	void deleteVehicle() {
		Integer id=20;  
		bookVehicleRepository.deleteById(id);
		verify(bookVehicleRepository,times(1)).deleteById(id);
	}
}
