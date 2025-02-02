/**
 * 
 */
package com.abhishek.amar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.amar.entity.Comments;

/**
 * @author Abhishek Amar
 *
 */
@Repository
public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
