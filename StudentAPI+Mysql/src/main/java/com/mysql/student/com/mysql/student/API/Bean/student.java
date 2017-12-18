package com.mysql.student.com.mysql.student.API.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student 
{
	
	@Id
	@Column(name="ID")
	private int ID;
	@Column(name="NAME")
	private String NAME;
	@Column(name="BRANCH")
	private String BRANCH;
	@Column(name="MOBILENUMBER")
	private String MOBILENUMBER;
	@Column(name="EMAIL")
	private String EMAIL;
	public student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int iD, String nAME, String bRANCH, String mOBILENUMBER, String eMAIL) 
	{
		super();
		ID = iD;
		NAME = nAME;
		BRANCH = bRANCH;
		MOBILENUMBER = mOBILENUMBER;
		EMAIL = eMAIL;
	}
	
	public int getID() 
	{
		return ID;
	}
	public void setID(int iD) 
	{
		ID = iD;
	}
	public String getNAME() 
	{
		return NAME;
	}
	public void setNAME(String nAME) 
	{
		NAME = nAME;
	}
	public String getBRANCH() 
	{
		return BRANCH;
	}
	public void setBRANCH(String bRANCH) 
	{
		BRANCH = bRANCH;
	}
	public String getMOBILENUMBER() 
	{
		return MOBILENUMBER;
	}
	public void setMOBILENUMBER(String mOBILENUMBER) 
	{
		MOBILENUMBER = mOBILENUMBER;
	}
	public String getEMAIL() 
	{
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) 
	{
		EMAIL = eMAIL;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("student [ID=").append(ID).append(", NAME=").append(NAME).append(", BRANCH=").append(BRANCH)
				.append(", MOBILENUMBER=").append(MOBILENUMBER).append(", EMAIL=").append(EMAIL).append("]");
		return builder.toString();
	}
	
	
}
