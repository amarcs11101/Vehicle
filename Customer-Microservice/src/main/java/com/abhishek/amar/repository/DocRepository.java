/**
 * 
 */
package com.abhishek.amar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.amar.entity.CustomerDocEntity;

/**
 * @author Abhishek Amar
 *
 */
@Repository
public interface DocRepository extends JpaRepository<CustomerDocEntity, Integer> {

}
