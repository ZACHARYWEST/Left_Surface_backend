package com.capstone.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.DiverLog;
import com.capstone.entity.Users;
import com.capstone.repositories.DiverLogRepository;
import com.capstone.repositories.UsersRepository;
import com.capstone.service.SendMail;

@CrossOrigin
@RestController
public class DiverLogController {
	
	
	
	@Autowired
	DiverLogRepository diverLogRepository;
	
	@Autowired
	UsersRepository userRepository;
	
	@Autowired
	SendMail sendMail;
	
	
	
	@RequestMapping(value="/saveLog", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	private void submitDiverLogDetails(@RequestBody DiverLog divelog) {
		diverLogRepository.save(divelog);
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		String message = "A new dive log for Diver "+divelog.getDiverName()+" has been created for your Left Surface account on "+date+" at "+time+". You can now view it from your dashboard.";
		String subject = "Left Surface: dive log created.";
		sendMail.send(userRepository.findById(divelog.getUserId()).get().getEmail(), subject, message);
	}
	
	@RequestMapping(value="/findLogByDiverName", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<List<Optional<DiverLog>>> findLogByDiverName(@RequestParam String name, @RequestParam int userId){
		List<Optional<DiverLog>> logs = diverLogRepository.findLogByDiverName(name, userId);
		return new ResponseEntity<List<Optional<DiverLog>>>(logs, HttpStatus.OK);
	}
	
	@RequestMapping(value="/findLogBySupervisor", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<List<Optional<DiverLog>>> findLogBySupervisor(@RequestParam String name, @RequestParam int userId){
		List<Optional<DiverLog>> logs = diverLogRepository.findLogBySupervisor(name, userId);
		return new ResponseEntity<List<Optional<DiverLog>>>(logs, HttpStatus.OK);
	}
	
	@RequestMapping(value="/findAllDiversLogs", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<List<Optional<DiverLog>>> findAllDiversLogs(@RequestParam String id){
		System.out.println(id);
		int user = Integer.parseInt(id);
		List<Optional<DiverLog>> logs = diverLogRepository.findAllDiversLogs(user);
		return new ResponseEntity<List<Optional<DiverLog>>>(logs, HttpStatus.OK);
	}
	
	@RequestMapping(value="/findAllOfTheLogs", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<List<Optional<DiverLog>>> findAllOfTheLogs(){
		List<Optional<DiverLog>> logs = diverLogRepository.findAllOfTheLogs();
		return new ResponseEntity<List<Optional<DiverLog>>>(logs, HttpStatus.OK);
	}
	
	@RequestMapping(value="/viewSpecificDiverLog", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity <DiverLog> viewDiverLog(@RequestParam int diveLogId){
		DiverLog log = diverLogRepository.viewSpecificLog(diveLogId);
		return new ResponseEntity <DiverLog>(log, HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteDiverLog", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.DELETE)
	private void deleteDiverLog(@RequestParam int diveLogId){
		diverLogRepository.deleteById(diveLogId);
	}
	
	
}
