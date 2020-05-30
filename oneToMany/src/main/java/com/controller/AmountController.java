package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AmountRequest;
import com.entity.UserIncomeTrack;
import com.repository.UserIncomeTrackRepository;

@RestController
public class AmountController {

	@Autowired
	private UserIncomeTrackRepository userIncomeTrackRepository;
		
	
	@PostMapping(path = "/enterDetails",produces = MediaType.APPLICATION_JSON_VALUE)

	public UserIncomeTrack getDetails( @RequestBody AmountRequest request) {
		return userIncomeTrackRepository.save(request.getUserIncomeTrack());
		
	}
	
	@GetMapping(path = "/findAllDetails")
	public List<UserIncomeTrack> findAmount(){
		return userIncomeTrackRepository.findAll();
		
	}
	
	
	
}
