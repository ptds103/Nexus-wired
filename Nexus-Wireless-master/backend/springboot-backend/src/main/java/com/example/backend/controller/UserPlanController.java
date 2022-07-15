package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.UserPlan;
import com.example.backend.repository.UserPlanRepository;

@RestController
@RequestMapping("/api/v1/")
public class UserPlanController {
	
	@Autowired
	private UserPlanRepository userPlanRepository;
	
	@GetMapping("/user_plans")
	public List<UserPlan> getAllUser(){
		return userPlanRepository.findAll();
	}
}
