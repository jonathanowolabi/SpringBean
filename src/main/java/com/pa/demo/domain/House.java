package com.pa.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class House {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto_increment
	private Integer id;
	
	@Column(nullable = false)
	private String houseType;
	
	@Column(nullable = false)
	private String ownership;
	
	@Column(nullable = false)
	private int noRooms;
	
	@Column(nullable = false)
	private int noBathrooms;
	
	@Column
	private boolean garden;
	
	public House() {
		// required 
	}

	public House(Integer id, String houseType, String ownership, int noRooms, int noBathrooms, boolean garden) {
		super();
		this.id = id;
		this.houseType = houseType;
		this.ownership = ownership;
		this.noRooms = noRooms;
		this.noBathrooms = noBathrooms;
		this.garden = garden;
	}
	
	public House(String houseType, String ownership, int noRooms, int noBathrooms, boolean garden) {
		super();
		this.houseType = houseType;
		this.ownership = ownership;
		this.noRooms = noRooms;
		this.noBathrooms = noBathrooms;
		this.garden = garden;
	}
	
	// Getters and Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	public String getOwnership() {
		return ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	public int getNoRooms() {
		return noRooms;
	}
	public void setNoRooms(int noRooms) {
		this.noRooms = noRooms;
	}
	public int getNoBathrooms() {
		return noBathrooms;
	}
	public void setNoBathrooms(int noBathrooms) {
		this.noBathrooms = noBathrooms;
	}
	public boolean isGarden() {
		return garden;
	}
	public void setGarden(boolean garden) {
		this.garden = garden;
	}
	
	@Override
	public String toString() {
		return "House [id=" + id + ", houseType=" + houseType + ", ownership=" + ownership + ", noRooms=" + noRooms
				+ ", noBathrooms=" + noBathrooms + ", garden=" + garden + "]";
	}
	
	
	

}
