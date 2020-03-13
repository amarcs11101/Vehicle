/**
 * 
 */
package com.abhishek.amar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abhishek.amar.entity.CustomerEntity;

/**
 * @author Abhishek Amar
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
	@Query(value = "select c.* from customer c where is_active=true and customer_type=0;", nativeQuery = true)
	List<CustomerEntity> findByIsActiveTrueAndCustomerTypeDriver();
}
