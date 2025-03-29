package com.selflearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selflearn.dto.UserDto;
import com.selflearn.service.UserService;

@RestController
@RequestMapping(value = "user")
public class UserCtl {

	@Autowired
	UserService userservice;

	@PostMapping("/add")
	public UserDto save(@RequestBody UserDto dto) {

		return userservice.save(dto);

	}

	@PostMapping("/delete/{id}")
	public long delete(@PathVariable Long id) {
		userservice.delete(id);
		return id;

	}

	@GetMapping("/search/{email}")
	public UserDto findByEmail(@PathVariable String email) {
		return userservice.findByEmail(email);

	}

	@GetMapping("/search")
	public List<UserDto> findAll() {
		return userservice.SearchAll();

	}

}
