/**
 * 
 */
package com.abhishek.amar.beans;

import java.io.Serializable;

import com.abhishek.amar.enums.VehicleType;

/**
 * @author Abhishek Amar
 *
 */
public class VehicleBean implements Serializable{
	private String vehicleNumber;
	private VehicleType vehicleType;
	private Integer vehicleId;

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

	@Override
	public String toString() {
		return "VehicleBean [vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + ", vehicleId="
				+ vehicleId + "]";
	}

}
