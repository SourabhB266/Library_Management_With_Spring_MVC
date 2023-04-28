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
public class RequestDao {

	SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Book.class).addAnnotatedClass(IssueBooks.class).addAnnotatedClass(User.class)
			.addAnnotatedClass(Request.class).addAnnotatedClass(Admin.class).buildSessionFactory();


	public Request saveRequest(Request request) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(request);
		transaction.commit();
		session.close();
		return request;
	}

	public List<Request> getAllRequest() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Request");
		List<Request> list = query.getResultList();
		return list;
	}

	public Request deleteRequest(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Request request = session.get(Request.class, id);
		session.delete(request);
		transaction.commit();
		session.close();
		return request;
	}
}
