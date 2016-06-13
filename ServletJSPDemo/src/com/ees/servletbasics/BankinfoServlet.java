package com.ees.servletbasics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ees.bo.ValidationBO;
import com.ees.dao.FormDAO;
import com.ees.vo.GeneralVO;
//import com.ees.dbclass.BaseDAO;

/**
 * Servlet implementation class BankinfoServlet
 */
public class BankinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @throws IOException
	 * @throws ServletException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		ValidationBO validationbo = new ValidationBO();
		
		FormDAO formdao = new FormDAO();
		String bankname1 = request.getParameter("tbbankname");
		String accountNo1 = request.getParameter("tbaccountno");
		String ssn1 = request.getParameter("tbssn");

		
		GeneralVO gv = (GeneralVO) request.getSession().getAttribute("gv1");

		gv.setBankName(bankname1);
		gv.setAccountNo(accountNo1);
		gv.setSsn(ssn1);

		HttpSession ses = request.getSession();

		ses.setAttribute("gv1", gv);

		// step 2 : Validation

		String errors = "";

		errors = validationbo.validateBankName(bankname1, errors);

		errors = validationbo.validateAccountNo(accountNo1, errors);

		errors = validationbo.validateSSN(ssn1, errors);

		if (errors != null && errors.trim().length() != 0) {
			request.setAttribute("errormsg2", errors);

			RequestDispatcher rd = request
					.getRequestDispatcher("jsp/bankinfo.jsp");

			rd.forward(request, response);
		}

		else {
			
			
			
			System.out.println("HEllo-------");
			formdao.insert(gv);
			response.sendRedirect("jsp/successoutput.jsp");
		}
		
	}

	

}

