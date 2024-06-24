package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstProgram implements Servlet{
	
	ServletConfig con;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method call");
		con=config;
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method call");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Welcome to Servlet");
		out.println("Todays's date : " + new Date().toString());
		System.out.println(getServletInfo());
		System.out.println(getServletConfig());
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method call");
	}

	@Override
	public String getServletInfo() {
		return "My first servlet program";
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return con;
	}

}
