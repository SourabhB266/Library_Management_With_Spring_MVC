package com.amiti.library_with_mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amiti.library_with_mvc.dao.RequestDao;
import com.amiti.library_with_mvc.dto.Request;



@RestController
public class RequestController {

	@Autowired
	private RequestDao dao;

	@CrossOrigin
	@PostMapping(value = "/saveRequest", consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Request> saveRequest(@RequestBody Request request) {
		dao.saveRequest(request);
		return new ResponseEntity<>(request, HttpStatus.OK);
	}
	
	@CrossOrigin
	@GetMapping(value = "/getAllRequest",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Request>> sgetAllRequest() {
		List<Request> list = dao.getAllRequest();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@CrossOrigin
	@DeleteMapping(value = "deleteRequest")
	public ResponseEntity<Request> deleteRequest(@RequestParam int id) {
		Request request=dao.deleteRequest(id);
		return new ResponseEntity<>(request, HttpStatus.OK);
	}
}
