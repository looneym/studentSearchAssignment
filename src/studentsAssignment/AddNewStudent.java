package studentsAssignment;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;



@SuppressWarnings("serial")
public class AddNewStudent extends HttpServlet {


	// Method to handle GET method request.
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException
	{
		// All of this code is for pulling the input from the HTML forms and putting it into variables
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		int age = Integer.parseInt(request.getParameter("age"));
		String age_str = request.getParameter("age");
		ArrayList<Boolean> subjects = new ArrayList<Boolean>();
		Boolean webFrameworks = false;
		Boolean businessIntelligence = false;
		Boolean mobileApplications = false;
		if (request.getParameter("webFrameworks") != null){
			webFrameworks = true;
		}
		if (request.getParameter("businessIntelligence") != null){
			businessIntelligence = true;
		}
		if (request.getParameter("mobileApplications") != null){
			mobileApplications = true;
		}
		subjects.add(webFrameworks);
		subjects.add(businessIntelligence);
		subjects.add(mobileApplications);
        
		// Finally creating the Student object
		Student studentToStore = new Student(name, address, age, subjects);

		// We need an ArrayList (here called store) in order to store Student objects. This ArrayList
		// can be shared amongst other Java servlets using the getServletContext and setServletContext
		//
		// We declare the store varibale and tell it to look inside the servlet context for an ArrayList
		// If the ArrayList is not found (store == null) we have to create one. 
		ArrayList<Student> store = (ArrayList<Student>) this.getServletContext().getAttribute("store");
		
		if (store == null){
			store = new ArrayList<Student>();
			this.getServletContext().setAttribute("store",store);

		} 

		store.add(studentToStore);

        // Debugging print statement
		System.out.println("Here's the ArrayList: " + store);	
		
		// This section outputs HTML
		String htmlOut = "Thanks for submitting your details, here's what you gave us: </br>";
		// String htmlOut = "<html><body><form action='ShowStudentDetails'><input type='submit' value='Submit' /></form></body></html>";
		
		// Set response content type		
		response.setContentType("text/html");
		
		// Get an "out" variable we can write to
		PrintWriter out = response.getWriter();
		
		out.print(htmlOut);
		
		String subj1;
		String sub2;
		String sub3;
		
		out.print(name + " " + address + " " + age_str + " ");
		
		
	

	}
	// Method to handle POST method request.
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}