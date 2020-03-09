package com.abhishek.amar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.amar.entity.Vehicle;

/**
 * @author Abhishek Amar
 *
 */
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer>{

}
