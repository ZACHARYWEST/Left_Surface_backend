package com.capstone.repositories;

import org.springframework.stereotype.Repository;

import com.capstone.entity.Users;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{

	@Query("FROM Users u WHERE u.email=?1")
	Optional<Users> searchByEmail(String email);
	
	@Query("SELECT u FROM Users u")
	List<Optional<Users>> findAllUsers();
	
	@Query("SELECT u FROM Users u WHERE u.email=?1 AND u.password=?2")
	Users loginUser(String email, String password);
}
