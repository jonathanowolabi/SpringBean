package com.pa.demo.rest;


import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pa.demo.domain.House;
import com.pa.demo.service.HouseService;

@RestController
@RequestMapping("/houses")
public class HouseController {
	
	private HouseService service;

	@Autowired
	public HouseController(HouseService service) {
		super();
		this.service = service;
	}
	
	
	
	// Test Method 
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String hello() {
		return "Hello, World!";
	}

	//CRUD Functionality
	
	// Create Method
	@PostMapping("/create")
	public House addHouse(@RequestBody House house) {
		return this.service.addHouse(house);
	}
	
	
	
	// Read Method
	@GetMapping("/")
	public List<House> getAllHouses() {
		return this.service.getAllHouses();
	}
	
	
	// Update Method
	@PutMapping("/update")
	public House updateHouse(@PathParam("id") int id, @RequestBody House house) {
		return this.service.updateHouse(id, house);
	}
	
	// Delete Method
	@DeleteMapping("/remove/{id}")
	public House removeHouse(@PathVariable int id) {
		return this.service.removeHouse(id);
	}


}

