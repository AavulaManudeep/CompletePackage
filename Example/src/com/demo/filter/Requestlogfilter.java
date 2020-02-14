package com.demo.filter;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xalan.internal.xsltc.dom.Filter;

/**
 * Servlet implementation class Requestlogfilter
 */
@WebServlet("/Requestlogfilter")
public class Requestlogfilter implements  javax.servlet.Filter{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	 private ServletContext context;
	 Connection con;

	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request2 = (HttpServletRequest) request;
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		 this.context.log("TimeStampe:"+timestamp +"  "+"Remote Client"+ request2.getRemoteAddr());
		try {
			
			PreparedStatement ps = con.prepareStatement("select*from Login");
			ResultSet rs = ps.executeQuery();
			HashMap map = new HashMap();
			while(rs.next())
			{
				map.put(rs.getString(1), rs.getString(2));
				System.out.println("Name:"+rs.getString(1)+""+"Password:"+rs.getString(2));
			}
			HttpSession session = request2.getSession(true);
    		if(session.getAttribute("currencyPairs") == null) {
    			session.setAttribute("currencyPairs", map);
    			this.context.log("Currency pairs CACHED!");
    		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 // pass the request along the filter chain
        chain.doFilter(request, response);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.context = filterConfig.getServletContext();
		this.context.log("Requestloginfilter");
		try{
    		Class.forName("com.mysql.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "manu", "nikonD3200");
    		
           } 
		catch(Exception e) 
		{
    		e.printStackTrace();
        }
		
	}

}
