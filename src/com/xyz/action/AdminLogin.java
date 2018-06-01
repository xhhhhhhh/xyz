package com.xyz.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xyz.entity.*;
import com.xyz.tools.ConnDB;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AdminLogin() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	/* check administrator's name and password */
	Admin admin=new Admin();
	
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	
	admin.setAdminId(id);
	admin.setAdminPwd(pwd);
	
	if (CheckAdmin(admin))
	{
		HttpSession session=request.getSession();         
		session.setAttribute("login", "ok");
		session.setMaxInactiveInterval(-1);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	else
	{
		request.getRequestDispatcher("LoginError.jsp").forward(request, response);
	}
	
}
	

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}
	
		
    public boolean CheckAdmin(Admin admin){
    	Connection conn = null;
        Statement  stmt = null;
        ResultSet  rs;
    	
    	boolean blnResult=false;
    	    	
    	String id=admin.getAdminId();
    	String pwd=admin.getAdminPwd();
    	
    	try{
			conn=ConnDB.getConnection();
			stmt=conn.createStatement();
			String str="select * from admin where id='"+id+"' and pwd='"+pwd+"'";
			rs=stmt.executeQuery(str);
			
			while (rs.next())
			{
				blnResult=true;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				stmt.close();
				conn.close();
				}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
  	
    	return blnResult;
    }
}
