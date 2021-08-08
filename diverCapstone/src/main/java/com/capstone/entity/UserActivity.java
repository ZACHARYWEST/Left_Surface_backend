package com.capstone.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users_recent_activity")
public class UserActivity {
	
	@Id
	@Column(name="activity_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int activityId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="action_time_stamp")
	private Timestamp actionTimeStamp;
	
	@Column(name="action_description")
	private String actionDescription;

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Timestamp getActionTimeStamp() {
		return actionTimeStamp;
	}

	public void setActionTimeStamp(Timestamp actionTimeStamp) {
		this.actionTimeStamp = actionTimeStamp;
	}

	public String getActionDescription() {
		return actionDescription;
	}

	public void setActionDescription(String actionDescription) {
		this.actionDescription = actionDescription;
	}
	
	

}
