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

/**
 * Servlet implementation class ContactinfoServlet
 */
public class ContactinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ValidationBO validationbo = new ValidationBO();
		String address1 = request.getParameter("tbaddress");
		String city1 = request.getParameter("tbcity");
		String state1 = request.getParameter("tbstate");
		String country1 = request.getParameter("tbcountry");
		String phone1 = request.getParameter("tbphone");

		// PersonalInfoVO personalInfoVo = (PersonalInfoVO)
		// request.getSession().getAttribute("pinfo");

		
		// GeneralVO gv=new GeneralVO();

		GeneralVO gv = (GeneralVO) request.getSession().getAttribute("gv1");
		// GeneralVO gv=new GeneralVO();

		gv.setAddress(address1);
		gv.setCity(city1);
		gv.setState(state1);
		gv.setCountry(country1);
		gv.setPhone(phone1);

		

		HttpSession ses = request.getSession();

		ses.setAttribute("gv1", gv);

		// step 2 : Validation

		String errors = "";

		errors = validationbo.validateAddress(address1, errors);

		errors = validationbo.validateCity(city1, errors);

		errors = validationbo.validateState(state1, errors);

		errors = validationbo.validateCountry(country1, errors);

		errors = validationbo.validatePhone(phone1, errors);

		if (errors != null && errors.trim().length() != 0) {
			request.setAttribute("errormsg1", errors);

			RequestDispatcher rd = request
					.getRequestDispatcher("jsp/contactinfo.jsp");

			rd.forward(request, response);
		}

		else {
			RequestDispatcher rd = request
					.getRequestDispatcher("jsp/bankinfo.jsp");

			rd.forward(request, response);
		}

		// ses.setAttribute("civ1", civ);

		// ses.setAttribute("ad", address);
		// ses.setAttribute("ci", city);
		// ses.setAttribute("st", state);
		// ses.setAttribute("co", country);
		// ses.setAttribute("ph", phone);

		// response.sendRedirect("html/bankinfo.html");

	}

	
}
