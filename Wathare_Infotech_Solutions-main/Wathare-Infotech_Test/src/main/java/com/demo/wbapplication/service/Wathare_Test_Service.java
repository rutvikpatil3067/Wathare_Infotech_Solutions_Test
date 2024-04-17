package com.demo.wbapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.wbapplication.entity.WathareTest;
import com.demo.wbapplication.repository.Wathare_Test_Repo;

@Service
public class Wathare_Test_Service {

	@Autowired
	Wathare_Test_Repo wrepo;
	

	public List<WathareTest> findall() {
		// TODO Auto-generated method stub
		return wrepo.findAll();
	}

}
