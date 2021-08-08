package com.capstone.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.entity.UserActivity;

@Repository
public interface UserActivityRepository extends JpaRepository<UserActivity, Integer>{
	
	@Query("SELECT act FROM UserActivity act WHERE act.userId=?1")
	List<Optional<UserActivity>> findUsersActivities(int userId);
	
}
