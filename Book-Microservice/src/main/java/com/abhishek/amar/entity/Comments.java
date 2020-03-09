/**
 * 
 */
package com.abhishek.amar.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.abhishek.amar.enums.Ratings;

/**
 * @author Abhishek Amar
 *
 */
@Entity
@Table(name = "comments")
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer fromCustomerId;
	private Integer toCustomerId;
	private String comments;
	private Date createdAt;
	private Date modifiedAt;
	private Ratings ratings;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFromCustomerId() {
		return fromCustomerId;
	}

	public void setFromCustomerId(Integer fromCustomerId) {
		this.fromCustomerId = fromCustomerId;
	}

	public Integer getToCustomerId() {
		return toCustomerId;
	}

	public void setToCustomerId(Integer toCustomerId) {
		this.toCustomerId = toCustomerId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Ratings getRatings() {
		return ratings;
	}

	public void setRatings(Ratings ratings) {
		this.ratings = ratings;
	}

}
