package com.ees.servletbasics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ees.vo.GeneralVO;

/**
 * Servlet implementation class PiServlet1
 */
public class PiServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PiServlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String firstName1 = request.getParameter("tbfname");
		String lastName1 = request.getParameter("tblname");
		String middleName1 = request.getParameter("tbmname");
		String gender1 = request.getParameter("rbgender");

		GeneralVO gv = new GeneralVO();

		gv.setFirstName(firstName1);
		gv.setLastName(lastName1);
		gv.setMiddleName(middleName1);
		gv.setGender(gender1);

		HttpSession ses = request.getSession();

		ses.setAttribute("gv1", gv);

		// step 2 : Validation

		String errors = "";

		errors = validateFirstName(firstName1, errors);

		errors = validateLastName(lastName1, errors);

		errors = validateMiddleName(middleName1, errors);

		errors = validateGender(gender1, errors);

		if (errors != null && errors.trim().length() != 0) {
			request.setAttribute("errormsg", errors);

			RequestDispatcher rd = request.getRequestDispatcher("jsp/pi1.jsp");

			rd.forward(request, response);
		}

		else {
			RequestDispatcher rd = request.getRequestDispatcher("jsp/o1.jsp");

			rd.forward(request, response);
		}

		// TODO Auto-generated method stub
	}

	private String validateGender(String gender1, String errors) {
		if (isFieldEmpty(gender1)) {
			errors += "Gender Can't be blank <br/>";
		}
		return errors;
	}

	private String validateMiddleName(String middleName1, String errors) {
		if (isFieldEmpty(middleName1)) {
			errors += "Middle Name Can't be blank <br/>";
		}
		return errors;
	}

	private String validateLastName(String lastName1, String errors) {
		if (isFieldEmpty(lastName1)) {
			errors += "Last Name Can't be blank <br/>";
		}
		return errors;
	}

	private String validateFirstName(String firstName1, String errors) {
		if (isFieldEmpty(firstName1)) {
			errors += "First Name Can't be blank <br/>";
		}
		return errors;
	}

	private boolean isFieldEmpty(String fieldValue) {
		return fieldValue == null || fieldValue.trim().length() == 0;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
