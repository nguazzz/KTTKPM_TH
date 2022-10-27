package com.example.RegisterService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RegisterService.dao.RegisterRepository;
import com.example.RegisterService.entity.User;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private RegisterRepository registerRepository;
	
	@Transactional
	@Override
	public List<User> getRegister(){
		return registerRepository.findAll();
	}

	@Override
	public void addRegister(User register) {
		registerRepository.save(register);
		
	}
}
