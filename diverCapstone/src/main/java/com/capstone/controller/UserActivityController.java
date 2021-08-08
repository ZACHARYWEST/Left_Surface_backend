package com.capstone.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.UserActivity;
import com.capstone.repositories.UserActivityRepository;

@CrossOrigin
@RestController
public class UserActivityController {
	
	@Autowired
	UserActivityRepository UARepository;
	
	@RequestMapping(value="/findUsersActivities", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<List<Optional<UserActivity>>> findUsersActivities(@RequestParam String id){
		System.out.println(id);
		int userId = Integer.parseInt(id);
		List<Optional<UserActivity>> activities = UARepository.findUsersActivities(userId);
		Collections.sort(activities, (x,y) -> x.get().getActionTimeStamp().compareTo(y.get().getActionTimeStamp()));
		Collections.reverse(activities);
		return new ResponseEntity<List<Optional<UserActivity>>>(activities, HttpStatus.OK);
	}

	@RequestMapping(value="/saveActivity", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	private void saveRecentActivity(@RequestBody UserActivity action) {
		action.setActionTimeStamp(java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
		UARepository.save(action);
	}
}
