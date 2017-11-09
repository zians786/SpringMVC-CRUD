package com.bridgeit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bridgeit.model.Student;

public class StudentDao {
	@Autowired
	Student student;
	
	JdbcTemplate jdbcTemplate;


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int create() {
		String query="insert into springdao values('"+student.getName()+"','"+student.getDept()+"','"+student.getId()+"','"+student.getNumber()+"')";
		return jdbcTemplate.update(query);
		
	}

	public int update() {
		 String query="update springdao set name='"+student.getName()+"',number='"+student.getNumber()+"' where id='"+student.getId()+"' ";  
		    return jdbcTemplate.update(query);
	}

	public int delete() {
	    String query="delete from springdao where id='"+student.getId()+"' ";  
	    return jdbcTemplate.update(query);  
		
	}

	

}
