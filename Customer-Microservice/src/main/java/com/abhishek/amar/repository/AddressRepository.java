/**
 * 
 */
package com.abhishek.amar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.amar.entity.AddressEntity;

/**
 * @author Abhishek Amar
 *
 */
@Repository
public interface AddressRepository extends JpaRepository<AddressEntity,Integer>{

}
