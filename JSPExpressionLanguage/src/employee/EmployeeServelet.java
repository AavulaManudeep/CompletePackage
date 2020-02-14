package employee;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class EmployeeServelet
 */
@WebServlet("/EmployeeServelet")
public class EmployeeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServelet() {
       
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int EmployeeID= Integer.parseInt(request.getParameter("empId"));
		int HoursWorked= Integer.parseInt(request.getParameter("hoursworked"));
		double HourlyPay= Integer.parseInt(request.getParameter("hourlypay"));
		String Firstname = request.getParameter("fname");
		String Lastname = request.getParameter("lname");
		String EmailId = request.getParameter("email_id");
		
		
		HourlyRate employee = new HourlyRate(Firstname,  Lastname, EmployeeID,HourlyPay, HoursWorked, EmailId);
		Map<String, String> taxrates = new HashMap<String, String>();
		taxrates.put("Gorgia", "6.00");
		taxrates.put("Vermont", "8.90");
		taxrates.put("Arkansas", "4.00");
		taxrates.put("Tennessee", "0.00");
		
		HttpSession session = request.getSession();
		session.setAttribute("employee", employee);
		session.setAttribute("taxrates", taxrates);
		
		String url ="/ELDemo.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
