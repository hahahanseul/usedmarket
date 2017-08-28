package com.usedmarket.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usedmarket.web.command.Command;
import com.usedmarket.web.command.ListCommand;
import com.usedmarket.web.proxy.Proxy;
import com.usedmarket.web.proxy.SendProxy;

@WebServlet("/common.action")
public class commonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("commonController진입");
		String url = request.getServletPath();
		Command lc = new ListCommand();
		lc.setDir(url.substring(1,url.indexOf(".")));
		lc.setPage(request.getParameter("page"));
		lc.setPage(request.getParameter("cmd"));
		RequestDispatcher dis = request.getRequestDispatcher(lc.getView());
		dis.forward(request, response);
		
		Proxy pxy = new SendProxy(request);
	
	}
}
