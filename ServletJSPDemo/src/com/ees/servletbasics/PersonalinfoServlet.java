package com.ees.servletbasics;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ees.bo.ValidationBO;
import com.ees.vo.GeneralVO;
// import com.ees.vo.PersonalinfoVO;

/**
 * Servlet implementation class PersonalinfoServlet
 */
public class PersonalinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ValidationBO validationbo = new ValidationBO();
		String firstName1 = request.getParameter("tbfname");
		String lastName1 = request.getParameter("tblname");
		String middleName1 = request.getParameter("tbmname");
		String gender1 = request.getParameter("rbgender");

		
		GeneralVO gv = new GeneralVO();

		gv.setFirstName(firstName1);
		gv.setLastName(lastName1);
		gv.setMiddleName(middleName1);
		gv.setGender(gender1);
		
	HttpSession	ses = request.getSession();

		ses.setAttribute("gv1",gv );

		// step 2 : Validation

		String errors = "";

		errors = validationbo.validateFirstName(firstName1, errors);

		errors = validationbo.validateLastName(lastName1, errors);

		errors = validationbo.validateMiddleName(middleName1, errors);

		errors = validationbo.validateGender(gender1, errors);

		if (errors != null && errors.trim().length() != 0) {
			request.setAttribute("errormsg", errors);

			RequestDispatcher rd = request
					.getRequestDispatcher("jsp/personalinfo.jsp");

			rd.forward(request, response);
		}

		else {
			
			RequestDispatcher rd = request
					.getRequestDispatcher("jsp/contactinfo.jsp");

			rd.forward(request, response);
			
		}
	}
		
		
		
		

		
	

	
	
	
	
	
	 
	 
	
	
	
    
    
	

 
	
	
	
	
	
	
	
	
}
