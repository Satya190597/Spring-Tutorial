/**
 * Author    : Satya Prakash Nandy
 * Date      : 13/12/2017
 * Objective : Bean Class or POJO Class for ( student API ).
 */
package com.cutm.student.API.Student.API.Bean;

public class Bean 
{
	private String regno,name,branch,email;

	//------------- Default constructor ------
	public Bean() 
	{
		super();
		
	}
	//------ Parameterized constructor ------
	public Bean(String regno, String name, String branch, String email) 
	{
		super();
		this.regno = regno;
		this.name = name;
		this.branch = branch;
		this.email = email;
	}
	//------ Getter And Setters ------
	public String getRegno() 
	{
		return regno;
	}
	public void setRegno(String regno) 
	{
		this.regno = regno;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getBranch() 
	{
		return branch;
	}
	public void setBranch(String branch) 
	{
		this.branch = branch;
	}

	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	//------ The toString() method returns the string representation of the object. ------
	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Bean [regno=").append(regno).append(", name=").append(name).append(", branch=").append(branch)
				.append(", email=").append(email).append("]");
		return builder.toString();
	}
}
