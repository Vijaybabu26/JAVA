package web.project.problem;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Arth extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Arth() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println(request.getParameter("num1"));
		System.out.println(request.getParameter("num2"));
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		int res = Integer.parseInt(num1) + Integer.parseInt(num2);
//		System.out.println(res);
		
		response.getWriter().write("<html>\r\n"
				+ "    <body>\r\n"
				+ "        <h1>THE RESULT IS </h1>\r\n"+ res 
				+ "        <h2>" +num1+ "<h2> AND </h2> "+num2 +"</h2>\r\n"
				+ "    </bod>\r\n"
				+ "</html>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
