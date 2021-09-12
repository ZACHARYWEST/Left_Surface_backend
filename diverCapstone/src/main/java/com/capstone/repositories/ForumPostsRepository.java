package com.capstone.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.entity.ForumPosts;

@Repository
public interface ForumPostsRepository extends JpaRepository<ForumPosts, Integer>{
	
	@Query("SELECT fp FROM ForumPosts fp WHERE fp.forumId=?1")
	List<Optional<ForumPosts>> findPostsByForumId(int forumId);

}
