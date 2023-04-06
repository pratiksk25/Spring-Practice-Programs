package com.seleniumexpress.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = "* User Name can't be blank!")
	@Size(min = 3,max =15, message = "* User Name should contain char between 3 to 15 char!")
	private String userName;
	
	@NotBlank(message = "* Crush Name can't be blank!")
	@Size(min = 3,max =15, message = "* Crush Name should contain char between 3 to 15 char!")
	private String crushName;
	
	@AssertTrue(message = "You have to agree to use!")
	private boolean termAndCondition;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	public UserInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfoDTO(String userName, String crushName) {
		super();
		this.userName = userName;
		this.crushName = crushName;
	}

}
