package com.capstone.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="dive_log")
public class DiverLog {
	
	@Id
	@Column(name="divelog_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int diveLogId;

	@Column(name="user_id")
	private int userId;
	
	@Column(name="diver_name")
	private String diverName;
	
	@Column(name="dive_date")
	private String date;
	
	@Column(name="bottom_condition")
	private String bottomCondition;
	
	@Column(name="sea_state")
	private String seaState;
	
	@Column(name="bottom_temperature")
	private String temperature;
	
	@Column(name="bottom_visibility")
	private String visibility;
	
	@Column(name="bottom_current")
	private String current;
	
	@Column(name="geographic_location")
	private String location;
	
	@Column(name="vessel_or_platform")
	private String vessel;
	
	@Column(name="dive_one_beginning_repet")
	private String diveOneBeginningRepet;
	
	@Column(name="dive_one_beginning_RNT")
	private String diveOneBeginningRNT;
	
	@Column(name="dive_one_max_depth")
	private String diveOneMaxDepth;
	
	@Column(name="dive_one_left_surface")
	private String diveOneLeftSurface;
	
	@Column(name="dive_one_bottom_time")
	private String diveOneBottomTime;
	
	@Column(name="dive_one_total_bottom_time")
	private String diveOneTBT;
	
	@Column(name="dive_one_reached_surface")
	private String diveOneReachSurface;
	
	@Column(name="dive_one_to_chamber_surface_interval")
	private String diveOneChamberSurfaceInterval;
	
	@Column(name="dive_one_time_in_chamber")
	private String diveOneChamberTime;
	
	@Column(name="dive_one_table_used")
	private String diveOneTable;
	
	@Column(name="dive_one_repet_group_after_dive")
	private String diveOneRepetGroup;
	
	@Column(name="dive_two_beginning_repet")
	private String diveTwoBeginningRepet;
	
	@Column(name="dive_two_beginning_RNT")
	private String diveTwoBeginningRNT;
	
	@Column(name="dive_two_max_depth")
	private String diveTwoMaxDepth;
	
	@Column(name="dive_two_left_surface")
	private String diveTwoLeftSurface;
	
	@Column(name="dive_two_bottom_time")
	private String diveTwoBottomTime;
	
	@Column(name="dive_two_total_bottom_time")
	private String diveTwoTBT;
	
	@Column(name="dive_two_reached_surface")
	private String diveTwoReachSurface;
	
	@Column(name="dive_two_to_chamber_surface_interval")
	private String diveTwoChamberSurfaceInterval;
	
	@Column(name="dive_two_time_in_chamber")
	private String diveTwoChamberTime;
	
	@Column(name="dive_two_table_used")
	private String diveTwoTableUsed;
	
	@Column(name="dive_two_repet_group_after_dive")
	private String diveTwoRepetAfterDive;

	@Column(name="dive_three_beginning_repet")
	private String diveThreeBeginningRepet;
	
	@Column(name="dive_three_beginning_RNT")
	private String diveThreeBeginningRNT;
	
	@Column(name="dive_three_max_depth")
	private String diveThreeMaxDepth;
	
	@Column(name="dive_three_left_surface")
	private String diveThreeLeftSurface;
	
	@Column(name="dive_three_bottom_time")
	private String diveThreeBottomTime;
	
	@Column(name="dive_three_total_bottom_time")
	private String diveThreeTBT;
	
	@Column(name="dive_three_reached_surface")
	private String diveThreeReachSurface;
	
	@Column(name="dive_three_to_chamber_surface_interval")
	private String diveThreeChamberSurfaceInterval;
	
	@Column(name="dive_three_time_in_chamber")
	private String diveThreeChamberTime;
	
	@Column(name="dive_three_table_used")
	private String diveThreeTableUsed;
	
	@Column(name="dive_three_repet_group_after_dive")
	private String diveThreeRepetAfterDive;

	@Column(name="dive_four_beginning_repet")
	private String diveFourBeginningRepet;
	
	@Column(name="dive_four_beginning_RNT")
	private String diveFourRNT;
	
	@Column(name="dive_four_max_depth")
	private String diveFourMaxDepth;
	
	@Column(name="dive_four_left_surface")
	private String diveFourLeftSurface;
	
	@Column(name="dive_four_bottom_time")
	private String diveFourBottomTime;
	
	@Column(name="dive_four_total_bottom_time")
	private String diveFourTBT;
	
	@Column(name="dive_four_reached_surface")
	private String diveFourReachSurface;
	
	@Column(name="dive_four_to_chamber_surface_interval")
	private String diveFourChamberSurfaceInterval;
	
	@Column(name="dive_four_time_in_chamber")
	private String diveFourChamberTime;
	
	@Column(name="dive_four_table_used")
	private String diveFourTableUsed;
	
	@Column(name="dive_four_repet_group_after_dive")
	private String diveFourRepetAfterDive;
	
	@Column(name="sat_dive_one_storage_depth")
	private String satDiveOneStorageDepth;
	
	@Column(name="sat_dive_one_max_depth")
	private String satDiveOneMaxDepth;
	
	@Column(name="sat_dive_one_time_reach_storage_time")
	private String satDiveOneReachStorageTime;
	
	@Column(name="sat_dive_one_time_left_storage_time")
	private String satDiveOneLeftStorageTime;
		
	@Column(name="sat_dive_one_bottom_time")
	private String satDiveOneBottomTime;
	
	@Column(name="sat_dive_two_storage_depth")
	private String satDiveTwoStorageDepth;
	
	@Column(name="sat_dive_two_max_depth")
	private String satDiveTwoMaxDepth;
	
	@Column(name="sat_dive_two_time_reach_storage_time")
	private String satDiveTwoReachStorageTime;
	
	@Column(name="sat_dive_two_time_left_storage_time")
	private String satDiveTwoLeftStorageTime;
	
	@Column(name="sat_dive_two_bottom_time")
	private String satDiveTwoBottomTime;
	
	@Column(name="decompression_stop_one_depth")
	private String decompStopOneDepth;
	
	@Column(name="decompression_stop_one_length")
	private String decompStopOneLength;
	
	@Column(name="decompression_stop_one_time_reached")
	private String decompStopOneTimeReached;
	
	@Column(name="decompression_stop_one_time_left")
	private String decompStopOneTimeLeft;
	
	@Column(name="decompression_stop_one_gas")
	private String decompStopOneGas;
	
	@Column(name="decompression_stop_two_depth")
	private String decompStopTwoDepth;
	
	@Column(name="decompression_stop_two_length")
	private String decompStopTwoLength;
	
	@Column(name="decompression_stop_two_time_reached")
	private String decompStopTwoTimeReached;
	
	@Column(name="decompression_stop_two_time_left")
	private String decompStopTwoTimeLeft;
	
	@Column(name="decompression_stop_two_gas")
	private String decompStopTwoGas;
	
	@Column(name="decompression_stop_3_depth")
	private String decompStopThreeDepth;
	
	@Column(name="decompression_stop_3_length")
	private String decompStopThreeLength;
	
	@Column(name="decompression_stop_3_time_reached")
	private String decompStopThreeTimeReached;
	
	@Column(name="decompression_stop_3_time_left")
	private String decompStopThreeTimeLeft;
	
	@Column(name="decompression_stop_3_gas")
	private String decompStopThreeGas;
	
	@Column(name="decompression_stop_4_depth")
	private String decompStopFourDepth;
	
	@Column(name="decompression_stop_4_length")
	private String decompStopFourLength;
	
	@Column(name="decompression_stop_4_time_reached")
	private String decompStopFourTimeReached;
	
	@Column(name="decompression_stop_4_time_left")
	private String decompStopFourTimeLeft;
	
	@Column(name="decompression_stop_4_gas")
	private String decompStopFourGas;
	
	@Column(name="decompression_stop_5_depth")
	private String decompStopFiveDepth;
	
	@Column(name="decompression_stop_5_length")
	private String decompStopFiveLength;
	
	@Column(name="decompression_stop_5_time_reached")
	private String decompStopFiveTimeReached;
	
	@Column(name="decompression_stop_5_time_left")
	private String decompStopFiveTimeLeft;
	
	@Column(name="decompression_stop_5_gas")
	private String decompStopFiveGas;
	
	@Column(name="decompression_stop_6_depth")
	private String decompStopSixDepth;
	
	@Column(name="decompression_stop_6_length")
	private String decompStopSixLength;
	
	@Column(name="decompression_stop_6_time_reached")
	private String decompStopSixTimeReached;
	
	@Column(name="decompression_stop_6_time_left")
	private String decompStopSixTimeLeft;
	
	@Column(name="decompression_stop_6_gas")
	private String decompStopSixGas;
	
	@Column(name="decompression_stop_7_depth")
	private String decompStopSevenDepth;
	
	@Column(name="decompression_stop_7_length")
	private String decompStopSevenLength;
	
	@Column(name="decompression_stop_7_time_reached")
	private String decompStopSevenTimeReached;
	
	@Column(name="decompression_stop_7_time_left")
	private String decompStopSevenTimeLeft;
	
	@Column(name="decompression_stop_7_gas")
	private String decompStopSevenGas;
	
	@Column(name="decompression_stop_8_depth")
	private String decompStopEightDepth;
	
	@Column(name="decompression_stop_8_length")
	private String decompStopEightLength;
	
	@Column(name="decompression_stop_8_time_reached")
	private String decompStopEightTimeReached;
	
	@Column(name="decompression_stop_8_time_left")
	private String decompStopEightTimeLeft;
	
	@Column(name="decompression_stop_8_gas")
	private String decompStopEightGas;
	
	@Column(name="decompression_stop_9_depth")
	private String decompStopNineDepth;
	
	@Column(name="decompression_stop_9_length")
	private String decompStopNineLength;
	
	@Column(name="decompression_stop_9_time_reached")
	private String decompStopNineTimeReached;
	
	@Column(name="decompression_stop_9_time_left")
	private String decompStopNineTimeLeft;
	
	@Column(name="decompression_stop_9_gas")
	private String decompStopNineGas;
	
	@Column(name="breathing_apparatus")
	private String breathingApparatus;
	
	@Column(name="diver_dress")
	private String diverDress;
	
	@Column(name="breathing_mixture")
	private String breathingMixture;
	
	@Column(name="work_description")
	private String workDescription;
	
	@Column(name="record_of_maintenance")
	private String recordMaintenance;
	
	@Column(name="final_decompression_schedule_used")
	private String decompScheduleUsed;
	
	@Column(name="note_of_illness_or_injury")
	private String noteOfInjury;
	
	@Column(name="penetration_dive")
	private String penetration;
	
	@Column(name="length_of_penetration")
	private String penetrationLength;
	
	@Column(name="describe_structure")
	private String describeStructure;
	
	@Column(name="type_of_dive")
	private String typeOfDive;
	
	@Column(name="name_of_contractor")
	private String contractorName;
	
	@Column(name="address_of_contractor")
	private String contractorAddress;
	
	@Column(name="name_of_supervisor")
	private String supervisorName;
	
	@Column(name="name_of_standby_diver")
	private String StandbyName;
	
	@Column(name="name_of_tender")
	private String TenderName;
	
	
	
	

	public int getDiveLogId() {
		return diveLogId;
	}

	public void setDiveLogId(int diveLogId) {
		this.diveLogId = diveLogId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDiverName() {
		return diverName;
	}

	public void setDiverName(String diverName) {
		this.diverName = diverName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBottomCondition() {
		return bottomCondition;
	}

	public void setBottomCondition(String bottomCondition) {
		this.bottomCondition = bottomCondition;
	}

	public String getSeaState() {
		return seaState;
	}

	public void setSeaState(String seaState) {
		this.seaState = seaState;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVessel() {
		return vessel;
	}

	public void setVessel(String vessel) {
		this.vessel = vessel;
	}

	public String getDiveOneBeginningRepet() {
		return diveOneBeginningRepet;
	}

	public void setDiveOneBeginningRepet(String diveOneBeginningRepet) {
		this.diveOneBeginningRepet = diveOneBeginningRepet;
	}

	public String getDiveOneBeginningRNT() {
		return diveOneBeginningRNT;
	}

	public void setDiveOneBeginningRNT(String diveOneBeginningRNT) {
		this.diveOneBeginningRNT = diveOneBeginningRNT;
	}

	public String getDiveOneMaxDepth() {
		return diveOneMaxDepth;
	}

	public void setDiveOneMaxDepth(String diveOneMaxDepth) {
		this.diveOneMaxDepth = diveOneMaxDepth;
	}

	public String getDiveOneLeftSurface() {
		return diveOneLeftSurface;
	}

	public void setDiveOneLeftSurface(String diveOneLeftSurface) {
		this.diveOneLeftSurface = diveOneLeftSurface;
	}

	public String getDiveOneBottomTime() {
		return diveOneBottomTime;
	}

	public void setDiveOneBottomTime(String diveOneBottomTime) {
		this.diveOneBottomTime = diveOneBottomTime;
	}

	public String getDiveOneTBT() {
		return diveOneTBT;
	}

	public void setDiveOneTBT(String diveOneTBT) {
		this.diveOneTBT = diveOneTBT;
	}

	public String getDiveOneReachSurface() {
		return diveOneReachSurface;
	}

	public void setDiveOneReachSurface(String diveOneReachSurface) {
		this.diveOneReachSurface = diveOneReachSurface;
	}

	public String getDiveOneChamberSurfaceInterval() {
		return diveOneChamberSurfaceInterval;
	}

	public void setDiveOneChamberSurfaceInterval(String diveOneChamberSurfaceInterval) {
		this.diveOneChamberSurfaceInterval = diveOneChamberSurfaceInterval;
	}

	public String getDiveOneChamberTime() {
		return diveOneChamberTime;
	}

	public void setDiveOneChamberTime(String diveOneChamberTime) {
		this.diveOneChamberTime = diveOneChamberTime;
	}

	public String getDiveOneTable() {
		return diveOneTable;
	}

	public void setDiveOneTable(String diveOneTable) {
		this.diveOneTable = diveOneTable;
	}

	public String getDiveOneRepetGroup() {
		return diveOneRepetGroup;
	}

	public void setDiveOneRepetGroup(String diveOneRepetGroup) {
		this.diveOneRepetGroup = diveOneRepetGroup;
	}

	public String getDiveTwoBeginningRepet() {
		return diveTwoBeginningRepet;
	}

	public void setDiveTwoBeginningRepet(String diveTwoBeginningRepet) {
		this.diveTwoBeginningRepet = diveTwoBeginningRepet;
	}

	public String getDiveTwoBeginningRNT() {
		return diveTwoBeginningRNT;
	}

	public void setDiveTwoBeginningRNT(String diveTwoBeginningRNT) {
		this.diveTwoBeginningRNT = diveTwoBeginningRNT;
	}

	public String getDiveTwoMaxDepth() {
		return diveTwoMaxDepth;
	}

	public void setDiveTwoMaxDepth(String diveTwoMaxDepth) {
		this.diveTwoMaxDepth = diveTwoMaxDepth;
	}

	public String getDiveTwoLeftSurface() {
		return diveTwoLeftSurface;
	}

	public void setDiveTwoLeftSurface(String diveTwoLeftSurface) {
		this.diveTwoLeftSurface = diveTwoLeftSurface;
	}

	public String getDiveTwoBottomTime() {
		return diveTwoBottomTime;
	}

	public void setDiveTwoBottomTime(String diveTwoBottomTime) {
		this.diveTwoBottomTime = diveTwoBottomTime;
	}

	public String getDiveTwoTBT() {
		return diveTwoTBT;
	}

	public void setDiveTwoTBT(String diveTwoTBT) {
		this.diveTwoTBT = diveTwoTBT;
	}

	public String getDiveTwoReachSurface() {
		return diveTwoReachSurface;
	}

	public void setDiveTwoReachSurface(String diveTwoReachSurface) {
		this.diveTwoReachSurface = diveTwoReachSurface;
	}

	public String getDiveTwoChamberSurfaceInterval() {
		return diveTwoChamberSurfaceInterval;
	}

	public void setDiveTwoChamberSurfaceInterval(String diveTwoChamberSurfaceInterval) {
		this.diveTwoChamberSurfaceInterval = diveTwoChamberSurfaceInterval;
	}

	public String getDiveTwoChamberTime() {
		return diveTwoChamberTime;
	}

	public void setDiveTwoChamberTime(String diveTwoChamberTime) {
		this.diveTwoChamberTime = diveTwoChamberTime;
	}

	public String getDiveTwoTableUsed() {
		return diveTwoTableUsed;
	}

	public void setDiveTwoTableUsed(String diveTwoTableUsed) {
		this.diveTwoTableUsed = diveTwoTableUsed;
	}

	public String getDiveTwoRepetAfterDive() {
		return diveTwoRepetAfterDive;
	}

	public void setDiveTwoRepetAfterDive(String diveTwoRepetAfterDive) {
		this.diveTwoRepetAfterDive = diveTwoRepetAfterDive;
	}

	public String getDiveThreeBeginningRepet() {
		return diveThreeBeginningRepet;
	}

	public void setDiveThreeBeginningRepet(String diveThreeBeginningRepet) {
		this.diveThreeBeginningRepet = diveThreeBeginningRepet;
	}

	public String getDiveThreeBeginningRNT() {
		return diveThreeBeginningRNT;
	}

	public void setDiveThreeBeginningRNT(String diveThreeBeginningRNT) {
		this.diveThreeBeginningRNT = diveThreeBeginningRNT;
	}

	public String getDiveThreeMaxDepth() {
		return diveThreeMaxDepth;
	}

	public void setDiveThreeMaxDepth(String diveThreeMaxDepth) {
		this.diveThreeMaxDepth = diveThreeMaxDepth;
	}

	public String getDiveThreeLeftSurface() {
		return diveThreeLeftSurface;
	}

	public void setDiveThreeLeftSurface(String diveThreeLeftSurface) {
		this.diveThreeLeftSurface = diveThreeLeftSurface;
	}

	public String getDiveThreeBottomTime() {
		return diveThreeBottomTime;
	}

	public void setDiveThreeBottomTime(String diveThreeBottomTime) {
		this.diveThreeBottomTime = diveThreeBottomTime;
	}

	public String getDiveThreeTBT() {
		return diveThreeTBT;
	}

	public void setDiveThreeTBT(String diveThreeTBT) {
		this.diveThreeTBT = diveThreeTBT;
	}

	public String getDiveThreeReachSurface() {
		return diveThreeReachSurface;
	}

	public void setDiveThreeReachSurface(String diveThreeReachSurface) {
		this.diveThreeReachSurface = diveThreeReachSurface;
	}

	public String getDiveThreeChamberSurfaceInterval() {
		return diveThreeChamberSurfaceInterval;
	}

	public void setDiveThreeChamberSurfaceInterval(String diveThreeChamberSurfaceInterval) {
		this.diveThreeChamberSurfaceInterval = diveThreeChamberSurfaceInterval;
	}

	public String getDiveThreeChamberTime() {
		return diveThreeChamberTime;
	}

	public void setDiveThreeChamberTime(String diveThreeChamberTime) {
		this.diveThreeChamberTime = diveThreeChamberTime;
	}

	public String getDiveThreeTableUsed() {
		return diveThreeTableUsed;
	}

	public void setDiveThreeTableUsed(String diveThreeTableUsed) {
		this.diveThreeTableUsed = diveThreeTableUsed;
	}

	public String getDiveThreeRepetAfterDive() {
		return diveThreeRepetAfterDive;
	}

	public void setDiveThreeRepetAfterDive(String diveThreeRepetAfterDive) {
		this.diveThreeRepetAfterDive = diveThreeRepetAfterDive;
	}

	public String getDiveFourBeginningRepet() {
		return diveFourBeginningRepet;
	}

	public void setDiveFourBeginningRepet(String diveFourBeginningRepet) {
		this.diveFourBeginningRepet = diveFourBeginningRepet;
	}

	public String getDiveFourRNT() {
		return diveFourRNT;
	}

	public void setDiveFourRNT(String diveFourRNT) {
		this.diveFourRNT = diveFourRNT;
	}

	public String getDiveFourMaxDepth() {
		return diveFourMaxDepth;
	}

	public void setDiveFourMaxDepth(String diveFourMaxDepth) {
		this.diveFourMaxDepth = diveFourMaxDepth;
	}

	public String getDiveFourLeftSurface() {
		return diveFourLeftSurface;
	}

	public void setDiveFourLeftSurface(String diveFourLeftSurface) {
		this.diveFourLeftSurface = diveFourLeftSurface;
	}

	public String getDiveFourBottomTime() {
		return diveFourBottomTime;
	}

	public void setDiveFourBottomTime(String diveFourBottomTime) {
		this.diveFourBottomTime = diveFourBottomTime;
	}

	public String getDiveFourTBT() {
		return diveFourTBT;
	}

	public void setDiveFourTBT(String diveFourTBT) {
		this.diveFourTBT = diveFourTBT;
	}

	public String getDiveFourReachSurface() {
		return diveFourReachSurface;
	}

	public void setDiveFourReachSurface(String diveFourReachSurface) {
		this.diveFourReachSurface = diveFourReachSurface;
	}

	public String getDiveFourChamberSurfaceInterval() {
		return diveFourChamberSurfaceInterval;
	}

	public void setDiveFourChamberSurfaceInterval(String diveFourChamberSurfaceInterval) {
		this.diveFourChamberSurfaceInterval = diveFourChamberSurfaceInterval;
	}

	public String getDiveFourChamberTime() {
		return diveFourChamberTime;
	}

	public void setDiveFourChamberTime(String diveFourChamberTime) {
		this.diveFourChamberTime = diveFourChamberTime;
	}

	public String getDiveFourTableUsed() {
		return diveFourTableUsed;
	}

	public void setDiveFourTableUsed(String diveFourTableUsed) {
		this.diveFourTableUsed = diveFourTableUsed;
	}

	public String getDiveFourRepetAfterDive() {
		return diveFourRepetAfterDive;
	}

	public void setDiveFourRepetAfterDive(String diveFourRepetAfterDive) {
		this.diveFourRepetAfterDive = diveFourRepetAfterDive;
	}

	public String getSatDiveOneStorageDepth() {
		return satDiveOneStorageDepth;
	}

	public void setSatDiveOneStorageDepth(String satDiveOneStorageDepth) {
		this.satDiveOneStorageDepth = satDiveOneStorageDepth;
	}

	public String getSatDiveOneMaxDepth() {
		return satDiveOneMaxDepth;
	}

	public void setSatDiveOneMaxDepth(String satDiveOneMaxDepth) {
		this.satDiveOneMaxDepth = satDiveOneMaxDepth;
	}

	public String getSatDiveOneReachStorageTime() {
		return satDiveOneReachStorageTime;
	}

	public void setSatDiveOneReachStorageTime(String satDiveOneReachStorageTime) {
		this.satDiveOneReachStorageTime = satDiveOneReachStorageTime;
	}

	public String getSatDiveOneLeftStorageTime() {
		return satDiveOneLeftStorageTime;
	}

	public void setSatDiveOneLeftStorageTime(String satDiveOneLeftStorageTime) {
		this.satDiveOneLeftStorageTime = satDiveOneLeftStorageTime;
	}

	public String getSatDiveOneBottomTime() {
		return satDiveOneBottomTime;
	}

	public void setSatDiveOneBottomTime(String satDiveOneBottomTime) {
		this.satDiveOneBottomTime = satDiveOneBottomTime;
	}

	public String getSatDiveTwoStorageDepth() {
		return satDiveTwoStorageDepth;
	}

	public void setSatDiveTwoStorageDepth(String satDiveTwoStorageDepth) {
		this.satDiveTwoStorageDepth = satDiveTwoStorageDepth;
	}

	public String getSatDiveTwoMaxDepth() {
		return satDiveTwoMaxDepth;
	}

	public void setSatDiveTwoMaxDepth(String satDiveTwoMaxDepth) {
		this.satDiveTwoMaxDepth = satDiveTwoMaxDepth;
	}

	public String getSatDiveTwoReachStorageTime() {
		return satDiveTwoReachStorageTime;
	}

	public void setSatDiveTwoReachStorageTime(String satDiveTwoReachStorageTime) {
		this.satDiveTwoReachStorageTime = satDiveTwoReachStorageTime;
	}

	public String getSatDiveTwoLeftStorageTime() {
		return satDiveTwoLeftStorageTime;
	}

	public void setSatDiveTwoLeftStorageTime(String satDiveTwoLeftStorageTime) {
		this.satDiveTwoLeftStorageTime = satDiveTwoLeftStorageTime;
	}

	public String getSatDiveTwoBottomTime() {
		return satDiveTwoBottomTime;
	}

	public void setSatDiveTwoBottomTime(String satDiveTwoBottomTime) {
		this.satDiveTwoBottomTime = satDiveTwoBottomTime;
	}

	public String getDecompStopOneDepth() {
		return decompStopOneDepth;
	}

	public void setDecompStopOneDepth(String decompStopOneDepth) {
		this.decompStopOneDepth = decompStopOneDepth;
	}

	public String getDecompStopOneLength() {
		return decompStopOneLength;
	}

	public void setDecompStopOneLength(String decompStopOneLength) {
		this.decompStopOneLength = decompStopOneLength;
	}

	public String getDecompStopOneTimeReached() {
		return decompStopOneTimeReached;
	}

	public void setDecompStopOneTimeReached(String decompStopOneTimeReached) {
		this.decompStopOneTimeReached = decompStopOneTimeReached;
	}

	public String getDecompStopOneTimeLeft() {
		return decompStopOneTimeLeft;
	}

	public void setDecompStopOneTimeLeft(String decompStopOneTimeLeft) {
		this.decompStopOneTimeLeft = decompStopOneTimeLeft;
	}

	public String getDecompStopOneGas() {
		return decompStopOneGas;
	}

	public void setDecompStopOneGas(String decompStopOneGas) {
		this.decompStopOneGas = decompStopOneGas;
	}

	public String getDecompStopTwoDepth() {
		return decompStopTwoDepth;
	}

	public void setDecompStopTwoDepth(String decompStopTwoDepth) {
		this.decompStopTwoDepth = decompStopTwoDepth;
	}

	public String getDecompStopTwoLength() {
		return decompStopTwoLength;
	}

	public void setDecompStopTwoLength(String decompStopTwoLength) {
		this.decompStopTwoLength = decompStopTwoLength;
	}

	public String getDecompStopTwoTimeReached() {
		return decompStopTwoTimeReached;
	}

	public void setDecompStopTwoTimeReached(String decompStopTwoTimeReached) {
		this.decompStopTwoTimeReached = decompStopTwoTimeReached;
	}

	public String getDecompStopTwoTimeLeft() {
		return decompStopTwoTimeLeft;
	}

	public void setDecompStopTwoTimeLeft(String decompStopTwoTimeLeft) {
		this.decompStopTwoTimeLeft = decompStopTwoTimeLeft;
	}

	public String getDecompStopTwoGas() {
		return decompStopTwoGas;
	}

	public void setDecompStopTwoGas(String decompStopTwoGas) {
		this.decompStopTwoGas = decompStopTwoGas;
	}

	public String getDecompStopThreeDepth() {
		return decompStopThreeDepth;
	}

	public void setDecompStopThreeDepth(String decompStopThreeDepth) {
		this.decompStopThreeDepth = decompStopThreeDepth;
	}

	public String getDecompStopThreeLength() {
		return decompStopThreeLength;
	}

	public void setDecompStopThreeLength(String decompStopThreeLength) {
		this.decompStopThreeLength = decompStopThreeLength;
	}

	public String getDecompStopThreeTimeReached() {
		return decompStopThreeTimeReached;
	}

	public void setDecompStopThreeTimeReached(String decompStopThreeTimeReached) {
		this.decompStopThreeTimeReached = decompStopThreeTimeReached;
	}

	public String getDecompStopThreeTimeLeft() {
		return decompStopThreeTimeLeft;
	}

	public void setDecompStopThreeTimeLeft(String decompStopThreeTimeLeft) {
		this.decompStopThreeTimeLeft = decompStopThreeTimeLeft;
	}

	public String getDecompStopThreeGas() {
		return decompStopThreeGas;
	}

	public void setDecompStopThreeGas(String decompStopThreeGas) {
		this.decompStopThreeGas = decompStopThreeGas;
	}

	public String getDecompStopFourDepth() {
		return decompStopFourDepth;
	}

	public void setDecompStopFourDepth(String decompStopFourDepth) {
		this.decompStopFourDepth = decompStopFourDepth;
	}

	public String getDecompStopFourLength() {
		return decompStopFourLength;
	}

	public void setDecompStopFourLength(String decompStopFourLength) {
		this.decompStopFourLength = decompStopFourLength;
	}

	public String getDecompStopFourTimeReached() {
		return decompStopFourTimeReached;
	}

	public void setDecompStopFourTimeReached(String decompStopFourTimeReached) {
		this.decompStopFourTimeReached = decompStopFourTimeReached;
	}

	public String getDecompStopFourTimeLeft() {
		return decompStopFourTimeLeft;
	}

	public void setDecompStopFourTimeLeft(String decompStopFourTimeLeft) {
		this.decompStopFourTimeLeft = decompStopFourTimeLeft;
	}

	public String getDecompStopFourGas() {
		return decompStopFourGas;
	}

	public void setDecompStopFourGas(String decompStopFourGas) {
		this.decompStopFourGas = decompStopFourGas;
	}

	public String getDecompStopFiveDepth() {
		return decompStopFiveDepth;
	}

	public void setDecompStopFiveDepth(String decompStopFiveDepth) {
		this.decompStopFiveDepth = decompStopFiveDepth;
	}

	public String getDecompStopFiveLength() {
		return decompStopFiveLength;
	}

	public void setDecompStopFiveLength(String decompStopFiveLength) {
		this.decompStopFiveLength = decompStopFiveLength;
	}

	public String getDecompStopFiveTimeReached() {
		return decompStopFiveTimeReached;
	}

	public void setDecompStopFiveTimeReached(String decompStopFiveTimeReached) {
		this.decompStopFiveTimeReached = decompStopFiveTimeReached;
	}

	public String getDecompStopFiveTimeLeft() {
		return decompStopFiveTimeLeft;
	}

	public void setDecompStopFiveTimeLeft(String decompStopFiveTimeLeft) {
		this.decompStopFiveTimeLeft = decompStopFiveTimeLeft;
	}

	public String getDecompStopFiveGas() {
		return decompStopFiveGas;
	}

	public void setDecompStopFiveGas(String decompStopFiveGas) {
		this.decompStopFiveGas = decompStopFiveGas;
	}

	public String getDecompStopSixDepth() {
		return decompStopSixDepth;
	}

	public void setDecompStopSixDepth(String decompStopSixDepth) {
		this.decompStopSixDepth = decompStopSixDepth;
	}

	public String getDecompStopSixLength() {
		return decompStopSixLength;
	}

	public void setDecompStopSixLength(String decompStopSixLength) {
		this.decompStopSixLength = decompStopSixLength;
	}

	public String getDecompStopSixTimeReached() {
		return decompStopSixTimeReached;
	}

	public void setDecompStopSixTimeReached(String decompStopSixTimeReached) {
		this.decompStopSixTimeReached = decompStopSixTimeReached;
	}

	public String getDecompStopSixTimeLeft() {
		return decompStopSixTimeLeft;
	}

	public void setDecompStopSixTimeLeft(String decompStopSixTimeLeft) {
		this.decompStopSixTimeLeft = decompStopSixTimeLeft;
	}

	public String getDecompStopSixGas() {
		return decompStopSixGas;
	}

	public void setDecompStopSixGas(String decompStopSixGas) {
		this.decompStopSixGas = decompStopSixGas;
	}

	public String getDecompStopSevenDepth() {
		return decompStopSevenDepth;
	}

	public void setDecompStopSevenDepth(String decompStopSevenDepth) {
		this.decompStopSevenDepth = decompStopSevenDepth;
	}

	public String getDecompStopSevenLength() {
		return decompStopSevenLength;
	}

	public void setDecompStopSevenLength(String decompStopSevenLength) {
		this.decompStopSevenLength = decompStopSevenLength;
	}

	public String getDecompStopSevenTimeReached() {
		return decompStopSevenTimeReached;
	}

	public void setDecompStopSevenTimeReached(String decompStopSevenTimeReached) {
		this.decompStopSevenTimeReached = decompStopSevenTimeReached;
	}

	public String getDecompStopSevenTimeLeft() {
		return decompStopSevenTimeLeft;
	}

	public void setDecompStopSevenTimeLeft(String decompStopSevenTimeLeft) {
		this.decompStopSevenTimeLeft = decompStopSevenTimeLeft;
	}

	public String getDecompStopSevenGas() {
		return decompStopSevenGas;
	}

	public void setDecompStopSevenGas(String decompStopSevenGas) {
		this.decompStopSevenGas = decompStopSevenGas;
	}

	public String getDecompStopEightDepth() {
		return decompStopEightDepth;
	}

	public void setDecompStopEightDepth(String decompStopEightDepth) {
		this.decompStopEightDepth = decompStopEightDepth;
	}

	public String getDecompStopEightLength() {
		return decompStopEightLength;
	}

	public void setDecompStopEightLength(String decompStopEightLength) {
		this.decompStopEightLength = decompStopEightLength;
	}

	public String getDecompStopEightTimeReached() {
		return decompStopEightTimeReached;
	}

	public void setDecompStopEightTimeReached(String decompStopEightTimeReached) {
		this.decompStopEightTimeReached = decompStopEightTimeReached;
	}

	public String getDecompStopEightTimeLeft() {
		return decompStopEightTimeLeft;
	}

	public void setDecompStopEightTimeLeft(String decompStopEightTimeLeft) {
		this.decompStopEightTimeLeft = decompStopEightTimeLeft;
	}

	public String getDecompStopEightGas() {
		return decompStopEightGas;
	}

	public void setDecompStopEightGas(String decompStopEightGas) {
		this.decompStopEightGas = decompStopEightGas;
	}

	public String getDecompStopNineDepth() {
		return decompStopNineDepth;
	}

	public void setDecompStopNineDepth(String decompStopNineDepth) {
		this.decompStopNineDepth = decompStopNineDepth;
	}

	public String getDecompStopNineLength() {
		return decompStopNineLength;
	}

	public void setDecompStopNineLength(String decompStopNineLength) {
		this.decompStopNineLength = decompStopNineLength;
	}

	public String getDecompStopNineTimeReached() {
		return decompStopNineTimeReached;
	}

	public void setDecompStopNineTimeReached(String decompStopNineTimeReached) {
		this.decompStopNineTimeReached = decompStopNineTimeReached;
	}

	public String getDecompStopNineTimeLeft() {
		return decompStopNineTimeLeft;
	}

	public void setDecompStopNineTimeLeft(String decompStopNineTimeLeft) {
		this.decompStopNineTimeLeft = decompStopNineTimeLeft;
	}

	public String getDecompStopNineGas() {
		return decompStopNineGas;
	}

	public void setDecompStopNineGas(String decompStopNineGas) {
		this.decompStopNineGas = decompStopNineGas;
	}

	public String getBreathingApparatus() {
		return breathingApparatus;
	}

	public void setBreathingApparatus(String breathingApparatus) {
		this.breathingApparatus = breathingApparatus;
	}

	public String getDiverDress() {
		return diverDress;
	}

	public void setDiverDress(String diverDress) {
		this.diverDress = diverDress;
	}

	public String getBreathingMixture() {
		return breathingMixture;
	}

	public void setBreathingMixture(String breathingMixture) {
		this.breathingMixture = breathingMixture;
	}

	public String getWorkDescription() {
		return workDescription;
	}

	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}

	public String getRecordMaintenance() {
		return recordMaintenance;
	}

	public void setRecordMaintenance(String recordMaintenance) {
		this.recordMaintenance = recordMaintenance;
	}

	public String getDecompScheduleUsed() {
		return decompScheduleUsed;
	}

	public void setDecompScheduleUsed(String decompScheduleUsed) {
		this.decompScheduleUsed = decompScheduleUsed;
	}

	public String getNoteOfInjury() {
		return noteOfInjury;
	}

	public void setNoteOfInjury(String noteOfInjury) {
		this.noteOfInjury = noteOfInjury;
	}

	public String getPenetration() {
		return penetration;
	}

	public void setPenetration(String penetration) {
		this.penetration = penetration;
	}

	public String getPenetrationLength() {
		return penetrationLength;
	}

	public void setPenetrationLength(String penetrationLength) {
		this.penetrationLength = penetrationLength;
	}

	public String getDescribeStructure() {
		return describeStructure;
	}

	public void setDescribeStructure(String describeStructure) {
		this.describeStructure = describeStructure;
	}

	public String getTypeOfDive() {
		return typeOfDive;
	}

	public void setTypeOfDive(String typeOfDive) {
		this.typeOfDive = typeOfDive;
	}

	public String getContractorName() {
		return contractorName;
	}

	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}

	public String getContractorAddress() {
		return contractorAddress;
	}

	public void setContractorAddress(String contractorAddress) {
		this.contractorAddress = contractorAddress;
	}

	public String getSupervisorName() {
		return supervisorName;
	}

	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}

	public String getStandbyName() {
		return StandbyName;
	}

	public void setStandbyName(String standbyName) {
		StandbyName = standbyName;
	}

	public String getTenderName() {
		return TenderName;
	}

	public void setTenderName(String tenderName) {
		TenderName = tenderName;
	}

}
