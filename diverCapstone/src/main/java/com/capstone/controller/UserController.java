package com.capstone.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.Users;
import com.capstone.repositories.UsersRepository;
import com.capstone.service.SendMail;

@CrossOrigin
@RestController
public class UserController {
	
	@Autowired
	UsersRepository userRepository;
	
	@Autowired
	SendMail sendMail;

	@RequestMapping(value="/saveUser", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	public void submitUserDetails(@RequestBody Users user) {
		userRepository.save(user);
		String message = "Thank you, "+ user.getfName() + " " + user.getlName() +", for creating your account at Left Surface!\n\n"
				+ "You can log in now using your email and your password:\n"
				+user.getPassword()+"\nHave a nice day!";
		String subject = "Welcome to Left Surface";
		sendMail.send(user.getEmail(), subject, message);
	}
	
	@RequestMapping(value="/editUser", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	public void editUserDetails(@RequestBody Users user) {
		userRepository.save(user);
	}
	
	@RequestMapping(value="/findUserById", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<Optional<Users>> findUserById(int id){
		Optional<Users> user = userRepository.findById(id);
		return new ResponseEntity<Optional<Users>>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value="/userLogin", consumes= MediaType.APPLICATION_JSON_VALUE  , produces= MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	@ResponseBody private ResponseEntity<Users> userLogin(@RequestBody Users user) {
		Users u = userRepository.loginUser(user.getEmail(), user.getPassword());
		if(u != null) {
			return new ResponseEntity<Users>(u, HttpStatus.OK);
		} else {
			return new ResponseEntity<Users>(HttpStatus.UNAUTHORIZED);
		}
	}
	
	@RequestMapping(value="/findAllUsers", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity <List<Optional<Users>>> findAllUsers(){
		List<Optional<Users>> allUsers = userRepository.findAllUsers();
		return new ResponseEntity<List<Optional<Users>>>(allUsers, HttpStatus.OK);
	}
	
	
}
