package assignment6.session1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();  
        
	    String n=request.getParameter("name");  
	    String p=request.getParameter("pass");  
	          
	    if(n.equals("Name") && p.equals("password")){  
	        RequestDispatcher rd=request.getRequestDispatcher("welcome"); 
	        //forward will simply forward to a different page
	        rd.forward(request, response);  
	    }  
	    else{  
	        out.print("Sorry Username or Password does not match...");  
	        RequestDispatcher rd=request.getRequestDispatcher("/index.html");
	        //include method also includes updated request response with all content
	        rd.include(request, response);                     
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
