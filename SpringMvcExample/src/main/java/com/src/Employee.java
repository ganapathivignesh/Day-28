package com.src;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Employee {
	@Size(min=1,max=10,message="should be within given range")
	private String name;
	@Size(min=1,message="required")
	//@Pattern(regexp="^[a-zA-Z0-9]{3}",message="invalid")
	private String pass;
	private String email;
	@Max(value=10,message="mobile no accepted only 10 digit")
	private long mblno;
	@NotNull(message="select one")
	private String gender;
	@NotNull(message="select atleast one")
	private String[] roles;
	private String location;
	@Pattern(regexp="^[a-zA-Z]{20}",message="invalid")
	private String designation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMblno() {
		return mblno;
	}
	public void setMblno(long mblno) {
		this.mblno = mblno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getRoles() {
		return roles;
	}
	public void setRoles(String[] roles) {
		this.roles = roles;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
}
