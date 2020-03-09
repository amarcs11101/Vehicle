/**
 * 
 */
package com.abhishek.amar.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.abhishek.amar.enums.VehicleType;

/**
 * @author Abhishek Amar
 *
 */
@Entity
@Table(name = "vehicle")
public class Vehicle implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "vehicle_number")
	private String vehicleNumber;
	@Column(name = "vehicle_type")
	private VehicleType vehicleType;
	@Column(name = "vehicle_id")
	private Integer vehicleId;
	@OneToMany
	@JoinColumn(name = "customer_id")
	@Cascade(CascadeType.ALL)
	private List<VehicleOwner> owner;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public List<VehicleOwner> getOwner() {
		return owner;
	}

	public void setOwner(List<VehicleOwner> owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType
				+ ", vehicleId=" + vehicleId + ", owner=" + owner + "]";
	}

}
