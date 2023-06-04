package com.parking.service.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parking.service.entity.Slot;
import com.parking.service.entity.User;
import com.parking.service.model.SlotModel;
import com.parking.service.repo.SlotRepo;
import com.parking.service.repo.UserRepo;
import com.parking.service.service.Services;

@RestController
@RequestMapping("/parking/")
public class ParkingController {

	@Autowired
	private Services services;
	
	@Autowired
	private SlotRepo sloRepo;
	
	@Autowired
	private UserRepo userRepo;

	
	@PostMapping
	public String saveUser(@RequestBody User user) {
		
		userRepo.save(user);
		return "success";
	}
	
	@GetMapping("/slots")
	public List<Slot> getParkingSlotDaoFromEntity() {
		
		List<Slot> allSlot = sloRepo.findAll();
		System.out.println(allSlot);
		return allSlot;
	}
	
	@PostMapping("/park")
	public String parkVehicle(@RequestBody Slot parkingSlot) {
		parkingSlot.setEntryTime(LocalDateTime.now());
		Slot response = sloRepo.save(parkingSlot);
		System.out.println(response);
		return "success";
		
	}
	
	@PostMapping("/unpark/")
	public String unparkVehicle(@RequestBody Slot parkingSlot ){
		
		Optional<Slot> slot = sloRepo.findById(parkingSlot.getSlotId());
		long diffInHours;
		diffInHours = java.time.Duration.between(slot.get().getEntryTime(), LocalDateTime.now()).toHours();
		double fare = 5*diffInHours;
		System.out.println("fare--->" +fare);
		userRepo.updateFare(parkingSlot.getUserId(),fare);
		Slot response = sloRepo.save(parkingSlot);
		System.out.println(response);
		
		return "success";
			
		
//		long diffInHours;
////	String response = services.unparkVehicl(slotId);
//	Slot slotObj = sloRepo.getById(slotId);
//	LocalDateTime entryTime = slotObj.getEntryTime();
//	diffInHours = java.time.Duration.between(entryTime, LocalDateTime.now()).toHours();
//	System.out.println(diffInHours);
//	double fare = 5*diffInHours;
//	System.out.println(fare);
//	sloRepo.deleteById(slotId);
//	Slot
//	sloRepo.save(null)
//	return fare;
		
	}

	@GetMapping("/amount/{userId}")
	public double checkAmount(@PathVariable("userId") Long userId) {
		
		Optional<User> user = userRepo.findById(userId);
		
		double amount = user.get().getAmount();
		
		return amount;
		
	}
	
	
	
	
}
