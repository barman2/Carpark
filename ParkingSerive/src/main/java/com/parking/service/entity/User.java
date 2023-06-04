package com.parking.service.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserTable")
public class User {
		

	@Id
	@Column(name = "user_id")
	private long userId;
	
	@Column(name = "user_name")
	private long userName;
	
	@Column(name = "car_number")
	private String carNumber;
	
	@Column(name = "car_name")
	private String carName;
	
	@Column(name = "amount")
	private double amount;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getUserName() {
		return userName;
	}

	public void setUserName(long userName) {
		this.userName = userName;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User(long userId, long userName, String carNumber, String carName, double amount) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.carNumber = carNumber;
		this.carName = carName;
		this.amount = amount;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
