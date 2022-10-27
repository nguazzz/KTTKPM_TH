package com.example.springbootresttemplate.service;

import com.example.springbootresttemplate.model.User;

import java.util.List;

public interface LoginService {
	public void addUser(User user) ;
	List<User> getUsers();
}
