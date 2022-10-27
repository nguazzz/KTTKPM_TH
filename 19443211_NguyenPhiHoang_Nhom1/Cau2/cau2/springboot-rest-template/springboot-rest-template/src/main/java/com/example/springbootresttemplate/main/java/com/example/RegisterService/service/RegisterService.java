package com.example.RegisterService.service;

import java.util.List;

import com.example.RegisterService.entity.User;

public interface RegisterService {
	public void addRegister(User register);
	public List<User> getRegister();
}
