package com.example.RegisterService.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RegisterService.entity.User;
import com.example.RegisterService.service.RegisterService;

@RestController
@RequestMapping("/api")
public class RegisterController {
	@Autowired
	private RegisterService service;
	
	@PostMapping("/registers")
	public User addRegister(@RequestBody User register) {
		service.addRegister(register);
		return register;
	}
	
	@GetMapping("/")
	public List<User> findAll(){
		return service.getRegister();
	}
}
