package com.seleniumexpress.lc.api;

import javax.validation.constraints.NotEmpty;

import com.seleniumexpress.lc.validator.Age;

public class UserRegistrationDTO {

	@NotEmpty(message = "* cannot be empty!")
	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] hobby;
	private String gender;

	@Age(lower = 18, upper = 75, message = "The should be between 30 to 75")
	private Integer age;

	private CommunicationDTO communicationDTO;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}

	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
