package com.demo.filter;

import java.io.IOException;
import java.security.Timestamp;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestLoggingFilter
 */
@WebServlet("/RequestLoggingFilter")
public class RequestLoggingFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestLoggingFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		this.context = config.getServletContext();
		this.context.log("ReguestLogginFilter intililaized");
		
	}
	
	public void doFilter(ServletRequest request,ServletResponse response)
	{
		HttpServletRequest req = (HttpServletRequest) request;
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		this.context.log();
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
