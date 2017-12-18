package com.mysql.student.com.mysql.student.API.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mysql.student.com.mysql.student.API.Bean.student;
import com.mysql.student.com.mysql.student.API.Repository.StudentRepository;

import java.util.List;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository myRepository;

	public List<student> getAllData()
	{
		return (List<student>) myRepository.findAll();
	}
	public student getData(int id)
	{
		return myRepository.findOne(id);
	}
	public void insertStudent(student newStudent)
	{
		myRepository.save(newStudent);
	}
	public void deleteStudent(int ID)
	{
		myRepository.delete(ID);
	}
	public void updateStudent(student updatestudent,int ID)
	{
		myRepository.save(updatestudent);
	}
}
