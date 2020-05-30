package com.dao;

import com.entity.UserIncomeTrack;
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
