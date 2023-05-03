package com.amiti.library_with_mvc.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

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
public class UserDao {

	SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Book.class).addAnnotatedClass(IssueBooks.class).addAnnotatedClass(User.class)
			.addAnnotatedClass(Request.class).addAnnotatedClass(Admin.class).buildSessionFactory();

	public User saveUser(User user) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		System.out.println("===========Saved Successfully=============");
		transaction.commit();
		session.close();
		return user;
	}

	public List<User> getAllUsers() {
		Session session = factory.openSession();
		Query query = session.createQuery("from User");
		List<User> list = query.getResultList();
		return list;
	}

	public User updateUser(User user) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(user);
		transaction.commit();
		session.close();
		return user;
	}
	
	public User deleteUser(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		User user = session.get(User.class, id);
		session.delete(user);
		transaction.commit();
		session.close();
		return user;
	}

	public User getUserById(int id) {
		Session session = factory.openSession();
		User user = session.get(User.class, id);
		return user;
	}

}
