package com.demo.wbapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.wbapplication.entity.WathareTest;

@Repository
public interface Wathare_Test_Repo extends JpaRepository<WathareTest, String>{

}
