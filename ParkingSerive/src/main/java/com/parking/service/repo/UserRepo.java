package com.parking.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.parking.service.entity.User;

import jakarta.transaction.Transactional;

public interface UserRepo extends JpaRepository<User, Long>{

	@Transactional
	@Modifying
	@Query("update User set amount =:amount where userId = :userId")
	public int updateFare(@Param(value = "userId")Long userId,@Param(value = "amount")double amount);
//	@Param(value = "id") long id

	
}
