/**
 * Author    : Satya Prakash Nandy
 * Date      : 13/12/2017
 * Objective : Service Class for ( student API ).
 */
package com.cutm.student.API.Student.API.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cutm.student.API.Student.API.Bean.Bean;

@Service
public class StudentService 
{
	List<Bean> mylist =  new ArrayList<Bean>(Arrays.asList(new Bean("150301120035","Satya Prakash Nandy","CSE","nandy@yahoo.in"),
			new Bean("150301120034","Simran Bidhar","EE","simran@yahoo.in")));
	//---------- Function to get all the student details. ---------
	public List<Bean> getAllStudent()
	{
		return mylist;
	}
	//---------- Function to get a particular student with respect to registration number. ---------
	public Bean getStudent(String regno)
	{
		for(Bean element:mylist)
		{
			if(element.getRegno().equals(regno))
			{
				return element;
			}
		}
		return null;
	}
	//---------- Function to delete a particular student with the help of registration number. ----------
	public boolean deleteStudent(String regno)
	{
		for(Bean element:mylist)
		{
			if(element.getRegno().equals(regno))
			{
				mylist.remove(element);
				return true;
			}
		}
		return false;
	}
	//---------- Function to insert a new student. ----------
	public void addStudent(Bean bean)
	{
		mylist.add(bean);
	}
	//---------- Function to edit a particular student detail. ----------
	public boolean updateStudent(Bean bean,String regno)
	{
		int i=0;
		for(Bean element:mylist)
		{
			if(element.getRegno().equals(regno))
			{
				mylist.set(i,bean);
				return true;
			}
			i++;
		}
		return false;
	}
}
