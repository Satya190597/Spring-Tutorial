/**
 * Author    : Satya Prakash Nandy
 * Date      : 13/12/2017
 * Objective : Controller Class for ( student API ).
 */
package com.cutm.student.API.Student.API.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cutm.student.API.Student.API.Bean.Bean;
import com.cutm.student.API.Student.API.Services.StudentService;


@RestController
public class Configure 
{
	//--- The @Autowired annotation tells Spring where an injection needs to occur. ---
	@Autowired
	private StudentService myservice;
	
	/*
	 * Method name : selectAll()
	 * Url         : /students
	 * Method      : get
	 * Use         : To get all students detail.
	 */
	@RequestMapping("/students")
	public List<Bean> selectAll()
	{
		return myservice.getAllStudent();
	}
	/*
	 * Method name : select()
	 * Url         : /students
	 * Method Type : get
	 * Input 	   : Path variable (regno)
	 * Use         : To get a particular student detail.
	 */
	@RequestMapping("/students/{regno}")
	public ResponseEntity<Bean> select(@PathVariable String regno)
	{
		if(myservice.getStudent(regno)!=null)
		{
			return new ResponseEntity<Bean>(myservice.getStudent(regno),HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Bean>(HttpStatus.NOT_FOUND);
		}
	}
	/*
	 * Method name : delete()
	 * Url         : /students
	 * Method Type : delete
	 * Input 	   : Path variable (regno)
	 * Use         : To delete a particular student detail.
	 */
	@RequestMapping(method=RequestMethod.DELETE,value="/students/{regno}")
	public ResponseEntity<Bean> delete(@PathVariable String regno)
	{
		if(myservice.deleteStudent(regno))
		{
			return new ResponseEntity<Bean>(HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Bean>(HttpStatus.NOT_FOUND);
		}
	}
	/*
	 * Method name : delete()
	 * Url         : /students
	 * Method Type : post
	 * Input 	   : Request Body (bean)
	 * Use         : To add a new student detail.
	 */
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public void insert(@RequestBody Bean bean)
	{
		myservice.addStudent(bean);
	}
	/*
	 * Method name : delete()
	 * Url         : /students
	 * Method Type : put
	 * Input 	   : Request Body (bean) And Path variable (regno)
	 * Use         : To add a new student detail.
	 */
	@RequestMapping(method=RequestMethod.PUT,value="/students/{regno}")
	public ResponseEntity<Bean> update(@RequestBody Bean bean,@PathVariable String regno)
	{
		if(myservice.updateStudent(bean, regno))
		{
			return new ResponseEntity<Bean>(HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Bean>(HttpStatus.NOT_FOUND);
		}
	}
}
