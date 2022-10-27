package com.example.RegisterService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RegisterService.entity.User;

@Repository
public interface RegisterRepository extends JpaRepository<User, Integer> {

}
