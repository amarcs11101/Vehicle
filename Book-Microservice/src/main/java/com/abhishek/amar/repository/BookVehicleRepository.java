/**
 * 
 */
package com.abhishek.amar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.amar.entity.BookVehicleEntity;

/**
 * @author Abhishek Amar
 *
 */
@Repository
public interface BookVehicleRepository extends JpaRepository<BookVehicleEntity, Integer> {
	BookVehicleEntity findByCustomerId(Integer id);
}
