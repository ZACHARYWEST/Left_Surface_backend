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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.ForumOP;
import com.capstone.entity.ForumPosts;
import com.capstone.repositories.ForumOpRepository;
import com.capstone.repositories.ForumPostsRepository;
import com.capstone.repositories.UsersRepository;

@CrossOrigin
@RestController
public class ForumController {

	@Autowired
	ForumOpRepository forumOpRep;
	
	@Autowired
	ForumPostsRepository forumPostRep;
	
	@Autowired
	UsersRepository userRep;
	
	@RequestMapping(value="/createThread", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	private void createThread(@RequestBody ForumOP thread) {
		thread.setDatePosted(java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
		thread.setOp(userRep.findById(thread.getOpId()).get().getfName() + " " + userRep.findById(thread.getOpId()).get().getlName());
		forumOpRep.save(thread);
	}
	
	@RequestMapping(value="/createPost", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	private void createPost(@RequestBody ForumPosts post) {
		post.setDatePosted(java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
		forumPostRep.save(post);
	}
	
	@RequestMapping(value="/listThreads", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<List<Optional<ForumOP>>> listAllThreads(){
		List<Optional<ForumOP>> forumThreads = forumOpRep.listAllPosts();
		Collections.sort(forumThreads, (x,y) -> x.get().getDatePosted().compareTo(y.get().getDatePosted()));
		Collections.reverse(forumThreads);
		return new ResponseEntity<List<Optional<ForumOP>>>(forumThreads, HttpStatus.OK);
	}
	
	@RequestMapping(value="/viewThread", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<List<Optional<ForumPosts>>> getPostsForThread(int forumId){
		List<Optional<ForumPosts>> threadPosts = forumPostRep.findPostsByForumId(forumId);
		Collections.sort(threadPosts, (x,y) -> x.get().getDatePosted().compareTo(y.get().getDatePosted()));
		return new ResponseEntity<List<Optional<ForumPosts>>>(threadPosts, HttpStatus.OK);
	}
	
	@RequestMapping(value="/viewOriginalPost", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<ForumOP> getFirstPostForThread(int id){
		ForumOP firstPost = forumOpRep.getById(id);
		return new ResponseEntity<ForumOP>(firstPost, HttpStatus.OK);
	}
	
	
	
	
}
