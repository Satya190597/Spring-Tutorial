package com.satya.springsecurity.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController 
{
	@RequestMapping(value = "/Guest/{name}")
	public String getPublicAccount(@PathVariable String name)
	{
		return "Welcome To GUEST MENU : "+name;
	}
	@RequestMapping(value = "/private/{name}")
	public String getPrivateAccount(@PathVariable String name)
	{
		return "Welcome To PRIVATE MENU : "+name;
	}
	@RequestMapping(value = "/admin/{name}")
	public String getPrivateAdminAccount(@PathVariable String name)
	{
		return "Welcome To ADMIN MENU : "+name;
	}
	@RequestMapping(value = "/logout")
	public String getLogout(HttpServletRequest req,HttpServletResponse res)
	{
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		    if (auth != null)
		    {    
		        new SecurityContextLogoutHandler().logout(req,res,auth);
		        return "Logout";
		    }
		    else
		    {
		    	return "Login First !";
		    }
	}
}
