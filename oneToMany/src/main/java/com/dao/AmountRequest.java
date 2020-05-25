package com.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.User;
import com.entity.UserIncomeTrack;
import com.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AmountRequest {

//	@Autowired
//	private User user;
//	
//	@Autowired
//	private UserRepository userRepository;
	
	private UserIncomeTrack userIncomeTrack;
	
	
}
