package studentsAssignment;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;



public class SearchStudents extends HttpServlet {


	// Method to handle GET method request.
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException
	{
		// This section outputs HTML
		String htmlOut = "Hello World";
		// Set response content type		
		response.setContentType("text/html");
		
		// Get an "out" varible we can write to
		PrintWriter out = response.getWriter();
		
		out.print(htmlOut);
		
		

	}
	// Method to handle POST method request.
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}