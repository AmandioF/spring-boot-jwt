package com.example.d20.model;

public class Login {
	private String username;
	private String password;
	
	Login(){}
	Login(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String toString() {
		return "User: " + this.username + ", Password: " + this.password;
	}
}
