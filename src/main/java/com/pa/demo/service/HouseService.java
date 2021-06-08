package com.pa.demo.service;

import java.util.ArrayList;
import java.util.List;


import com.pa.demo.domain.House;


public class HouseService {
	private List<House> houses = new ArrayList<>();

	// Create Method
	public House addHouse(House house) {
		this.houses.add(house);
		return this.houses.get(this.houses.size()-1);
	}
	
	// Read Method
	public List<House> getAllHouses() {
		return this.houses;
	}
	
	// Update Method
	public House updateHouse(int id, House houses) {
		this.houses.remove(id);
		this.houses.add(id, houses);
		return this.houses.get(id);
	}
	
	// Delete Method
	public House removeHouse(int id) {
		return this.houses.remove(id);
	}

}
