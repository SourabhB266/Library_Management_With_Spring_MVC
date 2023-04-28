package com.amiti.library_with_mvc.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.amiti.library_with_mvc.dto.Admin;
import com.amiti.library_with_mvc.dto.Book;
import com.amiti.library_with_mvc.dto.IssueBooks;
import com.amiti.library_with_mvc.dto.Request;
import com.amiti.library_with_mvc.dto.User;


@Repository
public class AdminDao {
	
	SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Book.class).addAnnotatedClass(IssueBooks.class).addAnnotatedClass(User.class)
			.addAnnotatedClass(Request.class).addAnnotatedClass(Admin.class).buildSessionFactory();

	
	public Admin getAdminByName(String name) {
		Session session = factory.openSession();
		Query query = session.createQuery("from Admin where username=:name");
		query.setParameter("name", name);
		Admin admin = (Admin) query.getSingleResult();
		return admin;
	}
}
