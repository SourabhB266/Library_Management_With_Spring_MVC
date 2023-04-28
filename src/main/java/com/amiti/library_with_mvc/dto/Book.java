package com.amiti.library_with_mvc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int bookId;
	private String bookTitle;
	private String author;
	private String catagory;
	private int edition;
	private int no_of_books;
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getNo_of_books() {
		return no_of_books;
	}
	public void setNo_of_books(int no_of_books) {
		this.no_of_books = no_of_books;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", catagory=" + catagory
				+ ", edition=" + edition + ", no_of_books=" + no_of_books + "]";
	}
	
	
	
}
