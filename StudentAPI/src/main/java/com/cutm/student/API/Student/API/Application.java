/**
 * Author    : Satya Prakash Nandy
 * Date      : 13/12/2017
 * Objective : Main Class for ( student API ) to make it a stand alone application
 */
package com.cutm.student.API.Student.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application 
{

	public static void main(String[] args) 
	{
		//It takes two arguments first is the + class name + and the second is the + command line arguments +.
		SpringApplication.run(Application.class, args);
	}
}
