package com.usedmarket.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usedmarket.web.domain.ItemBean;
import com.usedmarket.web.service.ItemService;
import com.usedmarket.web.service.ItemServiceImpl;

@WebServlet("/item.action")
public class ItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		String dir = request.getParameter("dir");
		String page = request.getParameter("page");
		ItemService service=ItemServiceImpl.getInstance();
		String count=service.countItems();
		request.setAttribute("count", count);
		System.out.println("컨트롤러진입");
		switch(cmd) {
		case "move":
			request.getRequestDispatcher("/WEB-INF/view/" +dir +"/" + page +".jsp").forward(request,response);
			break;
		case "register":
			ItemBean item = new ItemBean();
			item.setTitle(request.getParameter("title"));
			item.setWriter(request.getParameter("writer"));
			item.setContent(request.getParameter("content"));
			String result=service.addItem(item);
			System.out.println(result);
		//	request.getRequestDispatcher("/WEB-INF/view/" +dir +"/" + page +".jsp").forward(request,response);
			response.sendRedirect(request.getContextPath()+"/item.action?cmd=move&dir=common&page=list");
			break;
		case "delete":
			request.getRequestDispatcher("/WEB-INF/view/" +dir +"/" + page +".jsp").forward(request,response);
			break;	
		}
	}
}
