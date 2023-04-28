package com.amiti.library_with_mvc.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class IssueBooks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int issueId;
	private int bookId;
	private String bookTitle;
	private String issuedate;
	private String issuestatus;
	private int uid;
	private String uname;
	private String actualreturndate;
	
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
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
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getIssuestatus() {
		return issuestatus;
	}
	public void setIssuestatus(String issuestatus) {
		this.issuestatus = issuestatus;
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
	public String getActualreturndate() {
		return actualreturndate;
	}
	public void setActualreturndate(String actualreturndate) {
		this.actualreturndate = actualreturndate;
	}
	@Override
	public String toString() {
		return "IssueBooks [issueId=" + issueId + ", bookId=" + bookId + ", bookTitle=" + bookTitle + ", issuedate="
				+ issuedate + ", issuestatus=" + issuestatus + ", uid=" + uid + ", uname=" + uname
				+ ", actualreturndate=" + actualreturndate + "]";
	}
	
	
	
	
	
	
	
	
	
}
