package com.parking.service.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SlotDetails")
public class Slot {

	@Id
	@Column(name = "slot_id", nullable = false)
	private Long slotId;
	
	@Column(name = "user_id")
	private long userId;
	
	@Column(name = "entry_time")
	private LocalDateTime entryTime;
	
	@Column(name = "status")
	private String status;

	public Long getSlotId() {
		return slotId;
	}

	public void setSlotId(Long slotId) {
		this.slotId = slotId;
	}


	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}

	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	public Slot(Long slotId, long userId, LocalDateTime entryTime, String status) {
		super();
		this.slotId = slotId;
		this.userId = userId;
		this.entryTime = entryTime;
		this.status = status;
	}

	public Slot() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
