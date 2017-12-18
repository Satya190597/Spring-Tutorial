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
	public List<Bean> getAllStudent()
	{
		return mylist;
	}
	
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
	
	public void addStudent(Bean bean)
	{
		mylist.add(bean);
	}
	
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
