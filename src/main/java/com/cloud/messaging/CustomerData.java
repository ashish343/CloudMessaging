package com.cloud.messaging;

public class CustomerData {
    private String phoneNumber;
    private String name;
    private String email;
    private String registerationID;
    
    public String getRegisterationID() {
		return registerationID;
	}
	public void setRegisterationID(String registerationID) {
		this.registerationID = registerationID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
