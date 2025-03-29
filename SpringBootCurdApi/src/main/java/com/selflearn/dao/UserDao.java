package com.selflearn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.selflearn.dto.UserDto;

@Repository
public interface UserDao extends JpaRepository<UserDto, Long>{
	
	UserDto findByEmail(String email);

}