package com.SessCook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServelet
 */
@WebServlet("/SecondServelet")
public class SecondServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int l=0;
		Cookie cookies[] = request.getCookies();
		for(Cookie c: cookies)
		{
			if (c.getName().equals("k")) {
				l= Integer.parseInt(c.getValue());
			}
		}
//		HttpSession session = request.getSession();
//		int k = (int)session.getAttribute("k");
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("In the Second "+k);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("In the Second "+l);
	}

}
