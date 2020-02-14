package com.Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname1 = request.getParameter("uname");
		String pass1 = request.getParameter("pass");
		
		/*
		 * try{ Class.forName("com.mysql.jdbc.Driver"); Connection
		 * con=DriverManager.getConnection(
		 * "jdbc:mysql://localhost:3306/testdb","manu","nikonD3200"); //here sonoo is
		 * database //name, root is username and password java.sql.Statement
		 * stmt=con.createStatement(); ResultSet
		 * rs=stmt.executeQuery("select * from Login"); while(rs.next())
		 * System.out.println(rs.getString(1)+"  "+rs.getString(2)); con.close();
		 * }catch(Exception e){ System.out.println(e);}
		 */
try {
				Class.forName("com.mysql.jdbc.Driver");  
			    Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","manu","nikonD3200");
			    //Statement myStatement = myConnection.createStatement();
			    String sql ="Select *from Login where uname=? and pass=?";
				//java.sql.Statement myStatement = myConnection.createStatement();
				java.sql.PreparedStatement statement = myConnection.prepareStatement(sql);
				statement.setString(1, uname1);
				statement.setString(2, pass1);
				PrintWriter out = response.getWriter();
				System.out.println("Before Query");
				
				
			  ResultSet myResultSet = statement.executeQuery();
			  PrintWriter Out = response.getWriter();
			  while(myResultSet.next())
			  {
			  System.out.println(myResultSet.getString("uname")+","+myResultSet.getString("pass"));
			 
			  if(myResultSet.getString("uname").equals(uname1) &&
						 myResultSet.getString("pass").equals(pass1))
			  {
				  HttpSession session = request.getSession();
				  session.setAttribute("UserName", uname1);
						 response.sendRedirect("Welcom.jsp"); 
						 } else {
							 response.sendRedirect("Login.jsp"); }
			  }		 
			 
			/*
			 * String sql="Select * from Login"; ResultSet myResultSet=
			 * myStatement.execute(sql);
			 * System.out.println(myResultSet.getString("uname")+","+myResultSet.getString(
			 * "pass")); if(myResultSet.getString("uname").equals(uname1) &&
			 * myResultSet.getString("pass").equals(pass1)) {
			 * response.sendRedirect("Welcom.jsp"); } else {
			 * out.println("You are Loggin Credentioals are not Valid"); }
			 */
				//System.out.println("Insertion Completed");
		     } catch (Exception e) {
			  // TODO: handle exception
			  System.out.println("Got an error in the database connection:" + e);
		    }
		  
		  
		  
		
		PrintWriter out = response.getWriter();
		out.println("Hello");

	        
	}

}
