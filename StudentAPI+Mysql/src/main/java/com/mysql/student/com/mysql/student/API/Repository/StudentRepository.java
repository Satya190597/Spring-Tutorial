package com.mysql.student.com.mysql.student.API.Repository;

import org.springframework.data.repository.CrudRepository;

import com.mysql.student.com.mysql.student.API.Bean.student;

public interface StudentRepository extends CrudRepository<student,Integer> 
{

}
