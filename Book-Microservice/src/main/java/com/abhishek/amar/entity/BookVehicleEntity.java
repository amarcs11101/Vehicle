/**
 * 
 */
package com.abhishek.amar.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.abhishek.amar.enums.VehicleBookType;

/**
 * @author Abhishek Amar
 *
 */
@Entity
@Table(name = "book_vehicle")
public class BookVehicleEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "vehicle_id")
	private Integer vehicleId;
	@Column(name = "customer_id")
	private Integer customerId;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destination;
	@Column(name = "booked_at")
	private Date bookedAt;
	@Column(name = "ended_at")
	private Date endedAt;
	@Column(name = "vehicle_booked_type")
	private VehicleBookType vehicleBookedType;

	public VehicleBookType getVehicleBookedType() {
		return vehicleBookedType;
	}

	public void setVehicleBookedType(VehicleBookType vehicleBookedType) {
		this.vehicleBookedType = vehicleBookedType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getBookedAt() {
		return bookedAt;
	}

	public void setBookedAt(Date bookedAt) {
		this.bookedAt = bookedAt;
	}

	public Date getEndedAt() {
		return endedAt;
	}

	public void setEndedAt(Date endedAt) {
		this.endedAt = endedAt;
	}

}
