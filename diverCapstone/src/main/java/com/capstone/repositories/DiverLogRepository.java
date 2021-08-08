package com.capstone.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.entity.DiverLog;
import com.capstone.entity.Users;

@Repository
public interface DiverLogRepository extends JpaRepository<DiverLog, Integer>{
	
	@Query("SELECT dl FROM DiverLog dl WHERE dl.diverName=?1 AND dl.userId=?2")
	List<Optional<DiverLog>> findLogByDiverName(String name, int user);
	
	@Query("SELECT dl FROM DiverLog dl WHERE dl.supervisorName=?1 AND dl.userId=?2")
	List<Optional<DiverLog>> findLogBySupervisor(String name, int user);
	
	@Query("SELECT dl FROM DiverLog dl WHERE dl.userId=?1")
	List<Optional<DiverLog>> findAllDiversLogs(int userId);
	
	@Query("SELECT dl FROM DiverLog dl")
	List<Optional<DiverLog>> findAllOfTheLogs();
	
	@Query("SELECT dl FROM DiverLog dl WHERE dl.diveLogId=?1")
	DiverLog viewSpecificLog(int diveLogId);

}
