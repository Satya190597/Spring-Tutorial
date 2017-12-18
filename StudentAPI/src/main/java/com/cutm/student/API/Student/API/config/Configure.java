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
	@Autowired
	private StudentService myservice;
	
	@RequestMapping("/students")
	public List<Bean> selectAll()
	{
		return myservice.getAllStudent();
	}
	
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
	
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public void insert(@RequestBody Bean bean)
	{
		myservice.addStudent(bean);
	}
	
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
