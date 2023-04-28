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
public class IssueBookDao {
	
	SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Book.class).addAnnotatedClass(IssueBooks.class).addAnnotatedClass(User.class)
			.addAnnotatedClass(Request.class).addAnnotatedClass(Admin.class).buildSessionFactory();


	public IssueBooks saveIssueBook(IssueBooks books) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(books);
		transaction.commit();
		session.close();
		return books;
	}

	public List<IssueBooks> getAllIssueBook() {
		Session session = factory.openSession();
		Query query = session.createQuery("from IssueBooks");
		List<IssueBooks> list = query.getResultList();
		return list;
	}

	public IssueBooks getIssueBookById(int id) {
		Session session = factory.openSession();
		IssueBooks books = session.get(IssueBooks.class, id);
		return books;
	}

	public IssueBooks deleteIssueBook(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		IssueBooks books = session.get(IssueBooks.class, id);
		session.delete(books);
		transaction.commit();
		session.close();
		return books;
	}
}
