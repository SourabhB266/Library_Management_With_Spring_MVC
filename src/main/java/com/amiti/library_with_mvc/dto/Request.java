package com.amiti.library_with_mvc.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int bookId;
	private String bookTitle;
	private int uid;
	private String uname;
	private String td;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getTd() {
		return td;
	}

	public void setTd(String td) {
		this.td = td;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", bookId=" + bookId + ", bookTitle=" + bookTitle + ", uid=" + uid + ", uname="
				+ uname + ", td=" + td + "]";
	}
	
	

}
