package com.ees.servletbasics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ServletDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter pw = response.getWriter();// get the stream to write the
												// data

		String firstName = request.getParameter("tbfname");

		System.out.println(firstName);
		// pw.println(firstName);
		// System.out.println(firstName);

		request.getSession().setAttribute("ofname", firstName);

		// writing html in the stream
		pw.println("<html><body>");
		pw.println("Welcome to servlet");
		pw.println("</body></html>");

		pw.close();// closing the stream

	}

}
