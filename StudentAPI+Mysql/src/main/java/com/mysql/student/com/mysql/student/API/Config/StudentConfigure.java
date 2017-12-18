package com.mysql.student.com.mysql.student.API.Config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.student.com.mysql.student.API.Bean.student;
import com.mysql.student.com.mysql.student.API.Services.StudentService;

@RestController
public class StudentConfigure 
{
	@Autowired StudentService myservice;
	
	@RequestMapping("/mysqlstudent")
	public List<student> selectAll()
	{
		return myservice.getAllData();
	}
	@RequestMapping("/mysqlstudent/{ID}")
	public student select(@PathVariable int ID)
	{
		return myservice.getData(ID);
	}
	@RequestMapping(method=RequestMethod.POST,value="/mysqlstudent")
	public void insert(@RequestBody student newStudent)
	{	
		myservice.insertStudent(newStudent);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/mysqlstudent/{ID}")
	public void delete(@PathVariable int ID)
	{
		myservice.deleteStudent(ID);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/mysqlstudent/{ID}")
	public void delete(@RequestBody student newStudent,@PathVariable int ID)
	{
		myservice.updateStudent(newStudent,ID);
	}
}
