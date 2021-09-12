package com.capstone.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.entity.ForumOP;

@Repository
public interface ForumOpRepository extends JpaRepository<ForumOP, Integer>{
	
	@Query("SELECT fop FROM ForumOP fop")
	List<Optional<ForumOP>> listAllPosts();


}
