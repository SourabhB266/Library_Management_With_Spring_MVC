package com.amiti.library_with_mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amiti.library_with_mvc.dao.UserDao;
import com.amiti.library_with_mvc.dto.User;


@RestController
public class UserController {
	
	@Autowired
	private UserDao dao;
	
	@CrossOrigin
	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<User> saveUser(@RequestBody User user){
		dao.saveUser(user);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping(value = "/getall",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getAllUsers(){
		List<User> list = dao.getAllUsers();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping(value =  "/getById",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUserById(@RequestParam int id){
		User user =dao.getUserById(id);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
}
