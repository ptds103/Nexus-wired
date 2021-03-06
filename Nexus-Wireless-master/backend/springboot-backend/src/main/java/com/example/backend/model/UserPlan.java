


package com.example.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device_model")
public class UserPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "id_user_plan")
	private String idUserPlan;
	
	@Column(name = "user_name_u")
	private String userNameU;
	
	@Column(name = "plan_name_u")
	private String planNameU;
	
	@Column(name = "num_of_lines")
	private String numOfLines;
	
	public UserPlan(){
		
	}
			
			
	public UserPlan(String idUserPlan, String userNameU, String planNameU, String numOfLines) {
		super();
		this.idUserPlan = idUserPlan;
		this.userNameU = userNameU;
		this.planNameU = planNameU;
		this.numOfLines = numOfLines;

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdUserPlan() {
		return idUserPlan;
	}
	public void setIdUserPlan(String idUserPlan) {
		this.idUserPlan = idUserPlan;
	}
	public String getUserNameU() {
		return userNameU;
	}
	public void setUserNameU(String userNameU) {
		this.userNameU = userNameU;
	}
	public String getPlanNameU() {
		return planNameU;
	}
	public void setPlanNameU(String planNameU) {
		this.planNameU = planNameU;
	}
	public String getNumOfLines() {
		return numOfLines;
	}
	public void setNumOfLines(String numOfLines) {
		this.numOfLines = numOfLines;
	}

	
}
