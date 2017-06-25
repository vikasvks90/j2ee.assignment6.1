package assignment6.session1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowHeaders
 */
@WebServlet("/ShowHeaders")
public class ShowHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowHeaders() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request,HttpServletResponse response)  throws IOException, ServletException {  
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		
		out.println("HTTP headers sent by your client:<br>");  
		
		Enumeration<String> headerInfo = request.getHeaderNames();  
		while (headerInfo.hasMoreElements()) {  
		String headerName = (String) headerInfo.nextElement();  
		String headerValue = request.getHeader(headerName);  
		out.print("<b>"+headerName + "</b>: ");  
		out.println(headerValue + "<br>");  
		}
	}  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
