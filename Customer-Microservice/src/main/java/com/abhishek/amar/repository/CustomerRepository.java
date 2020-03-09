/**
 * 
 */
package com.abhishek.amar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.amar.entity.CustomerEntity;

/**
 * @author Abhishek Amar
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{

}
