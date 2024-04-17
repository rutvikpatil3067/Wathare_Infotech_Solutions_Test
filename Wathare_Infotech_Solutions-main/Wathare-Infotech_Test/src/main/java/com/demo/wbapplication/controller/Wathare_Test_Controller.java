package com.demo.wbapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.wbapplication.entity.WathareTest;
import com.demo.wbapplication.service.Wathare_Test_Service;


@CrossOrigin("*")
@RestController
@RequestMapping("wathare/test")
public class Wathare_Test_Controller {
	
	@Autowired
	Wathare_Test_Service wservice;
	
	@GetMapping("/sample")
	public ResponseEntity<List<WathareTest>> getmachinestatus()
	{
		{
			 List<WathareTest> content = wservice.findall();

		        if (content.isEmpty()) {
		            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		        } else {
		            return new ResponseEntity<>(content, HttpStatus.OK);
		        }
		}
		
	}
}
