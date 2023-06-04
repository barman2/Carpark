package com.parking.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.service.entity.Slot;

@Repository
public interface SlotRepo extends JpaRepository<Slot, Long>{

	
	
}
