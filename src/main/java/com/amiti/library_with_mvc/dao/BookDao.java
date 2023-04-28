package com.amiti.library_with_mvc.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amiti.library_with_mvc.dto.Admin;
import com.amiti.library_with_mvc.dto.Book;
import com.amiti.library_with_mvc.dto.IssueBooks;
import com.amiti.library_with_mvc.dto.Request;
import com.amiti.library_with_mvc.dto.User;



@Repository
public class BookDao {
	
	SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Book.class).addAnnotatedClass(IssueBooks.class).addAnnotatedClass(User.class)
			.addAnnotatedClass(Request.class).addAnnotatedClass(Admin.class).buildSessionFactory();



	public Book saveBook(Book book) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(book);
		transaction.commit();
		session.close();
		return book;
	}
	
	public List<Book> getAllBooks(){
		Session session = factory.openSession();
		Query query = session.createQuery("from Book");
		List<Book> list = query.getResultList();
		return list;
	}
	
	public Book getBookById(int id) {
		Session session = factory.openSession();
		Book book = session.get(Book.class, id);
		return book;
	}
	
	public Book deleteBook(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Book book = session.get(Book.class, id);
		session.delete(book);
		transaction.commit();
		session.close();
		return book;
	}
}
