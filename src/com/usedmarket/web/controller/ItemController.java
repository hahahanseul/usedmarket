package com.usedmarket.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

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
		switch(cmd) {
		case "move":
			request.getRequestDispatcher("/WEB-INF/view/" +dir +"/" + page +".jsp").forward(request,response);
			break;
		case "register":
			ItemBean item = new ItemBean();
			String[] category = request.getParameterValues("category");
 			item.setTitle(request.getParameter("title"));
			item.setWriter(request.getParameter("writer"));
			item.setContent(request.getParameter("content"));
			Map<String, String[]> map = request.getParameterMap();
			Map<String, String> result=new HashMap<>();
			Set<Entry<String, String[]>> set=map.entrySet();
			Iterator<Map.Entry<String, String[]>> it = set.iterator();
			String params[]=new String[set.size()];
			int i=0;
			while(it.hasNext()){
			    Map.Entry<String, String[]> e = it.next();
			    params[i]=e.getKey();
			    i++;
			}
			for(i=0;i<params.length;i++){
				if(map.get(params[i]).length==1){
					result.put(params[i], map.get(params[i])[0]);
				}else{
					String temp="";
					for(int j=0;j<map.get(params[i]).length;j++){
						temp+=map.get(params[i])[j]+",";
					}
					result.put(params[i], temp);
				}
			}
			response.sendRedirect(request.getContextPath()+"/item.action?cmd=move&dir=common&page=list");
			break;
		case "list":
			int pageSize = 5;
			int blockSize = 5;
			String theNumberOfRows = service.countItems();
			String pageNumber = request.getParameter("pageNumber");
			String startRow = String.valueOf(1 + (Integer.parseInt(pageNumber)-1)*pageSize);
			String endRow =(Integer.parseInt(theNumberOfRows)<Integer.parseInt(pageNumber)*pageSize) ? theNumberOfRows:String.valueOf(Integer.parseInt(pageNumber)*pageSize);
			int theNumberOfPages=(Integer.parseInt(theNumberOfRows)%blockSize==0) ? Integer.parseInt(theNumberOfRows)/blockSize:Integer.parseInt(theNumberOfRows)/blockSize+1;
			int startPage= Integer.parseInt(pageNumber)-(Integer.parseInt(pageNumber)-1)%blockSize;
			int blockNumber =startPage/pageSize +1 ;
			int endPage= (startPage+blockSize-1 <= theNumberOfPages)? startPage + blockSize -1 :theNumberOfPages;
			int prevBlock =startPage-theNumberOfPages/blockSize;
			int nextBlock= startPage+theNumberOfPages/blockSize;
			String[] rows = new String[2];
			rows[0]=startRow;
			rows[1]=endRow;
			request.setAttribute("list", service.getList(rows));
			request.setAttribute("startPage", startPage);
			request.setAttribute("endPage", endPage);
			request.setAttribute("prevBlock", prevBlock);
			request.setAttribute("nextBlock", nextBlock);
			request.setAttribute("theNumberOfPages", theNumberOfPages);
			request.getRequestDispatcher("/WEB-INF/view/" +dir +"/" + page +".jsp").forward(request,response);
			System.out.println("startRow::::" + startRow);
			System.out.println("endRow:::::" + endRow);
			System.out.println("startPage::::"+startPage);
			System.out.println("endPage::::"+endPage);
			System.out.println("blockNumber:::" + blockNumber);
			System.out.println("blockNumber:::" + blockNumber);
			System.out.println("=====================================");
			break;
		case "delete":
			request.getRequestDispatcher("/WEB-INF/view/" +dir +"/" + page +".jsp").forward(request,response);
			break;	
		}
	}
}
