package com.selflearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selflearn.dao.UserDao;
import com.selflearn.dto.UserDto;



@Service
public class UserService {

	@Autowired
	private UserDao userdao;

	public UserDto save(UserDto dto) {
		return userdao.save(dto);
	}

	public Long delete(Long id) {
		userdao.deleteById(id);

		return id;
	}

	public UserDto findByEmail(String email) {
		return userdao.findByEmail(email);

	}

	public List<UserDto> SearchAll() {
		return userdao.findAll();

	}
}
