package com.amiti.library_with_mvc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int uid;
	private String fname;
	private String lname;
	private long mobilenumber;
	private String email;
	private String dob;
	private String gender;
	private String password;
	private String con_password;
	private String no_of_books_taken;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCon_password() {
		return con_password;
	}

	public void setCon_password(String con_password) {
		this.con_password = con_password;
	}

	public String getNo_of_books_taken() {
		return no_of_books_taken;
	}

	public void setNo_of_books_taken(String no_of_books_taken) {
		this.no_of_books_taken = no_of_books_taken;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", mobilenumber=" + mobilenumber
				+ ", email=" + email + ", dob=" + dob + ", gender=" + gender + ", password=" + password
				+ ", con_password=" + con_password + ", no_of_books_taken=" + no_of_books_taken + "]";
	}
	
	
}
