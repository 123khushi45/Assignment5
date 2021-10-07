

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PortDemo
 */
public class PortDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PortDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
	       
	    PrintWriter out=response.getWriter();
	    
	    out.println("<p> client Browser"+request.getHeader("user-agent")+"</p>");
		
		out.println("<p> client Ip address ="+request.getRemoteAddr()+"</p>");
	
		
		out.println("<p> client port number ="+request.getRemotePort()+"</p>");
	
		out.println("<p> server port number ="+request.getServerPort()+"</p>");
		out.println("<p> server name ="+request.getServerName()+"</p>");
		out.println("<p> Local port number ="+request.getLocalPort()+"</p>");
		
		out.println("<p> method use by client ="+request.getMethod()+"</p>");
	
		out.println("<p> Query string name & value ="+request.getQueryString()+"</p>");
	    }
		
	
	}


