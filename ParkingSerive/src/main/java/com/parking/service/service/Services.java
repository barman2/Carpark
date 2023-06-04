package com.parking.service.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.parking.service.entity.Slot;
import com.parking.service.entity.User;
import com.parking.service.model.SlotModel;
import com.parking.service.repo.SlotRepo;
import com.parking.service.repo.UserRepo;

@org.springframework.stereotype.Service
public class Services {

	
	@Autowired
	private SlotRepo slotRepo;
	
	@Autowired
	private UserRepo userRepo;
	
//	@Autowired
//	private Slot slot;

//	public String unparkVehicl(Long slotId) {
//		
//		Slot slotObj = slotRepo.getById(slotId);
////		Slot slot = null;
////		slot = slotRepo.getById(slotId);
//		LocalDateTime response = slotObj.getEntryTime();
//		System.out.println(response);
//		return null;
//		
//	}
//	
////	public SlotModel parkVehicle(SlotModel parkingSlot) {
////		Slot slot = new Gson().fromJson(new Gson().toJson(parkingSlot), Slot.class);
////
////		Slot data = null;
////		System.out.println(slot);
////		if(slot.getEntryTime() == null)
////			slot.setEntryTime(LocalDateTime.now());
////		slot = slotRepo.save(slot);
//////		parkingSlotDao.setSlotId(entityObj.getSlotId());
//////		parkingSlotDao.setEntryTime(entityObj.getEntryTime());
//////		return parkingSlotDao;
////		
//////		data = slotRepo.save(slot);
////		
////		return null;
////	}

	
//	public String findUser(Long userId) {
//		
//		Optional<User> user = userRepo.findById(userId);
//		
//		user.get().
//		
//	}
//	
	
	
	
}
