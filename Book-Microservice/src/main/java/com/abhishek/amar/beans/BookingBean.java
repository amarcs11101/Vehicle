/**
 * 
 */
package com.abhishek.amar.beans;

import java.util.Date;

/**
 * @author Abhishek Amar
 *
 */
public class BookingBean {
	private Integer customerId;
	private Integer bikeBookingId; // its known as user id of bike owner
	private Date createdAt;
	private Date modifiedDate;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getBikeBookingId() {
		return bikeBookingId;
	}

	public void setBikeBookingId(Integer bikeBookingId) {
		this.bikeBookingId = bikeBookingId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
