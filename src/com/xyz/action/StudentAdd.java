package com.xyz.action;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xyz.entity.Student;
import com.xyz.sql.StudentSql;


/**
 * Servlet implementation class StudentAdd
 */
@WebServlet("/StudentAdd")
public class StudentAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentAdd() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
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

        Student student=new Student();

		StudentSql handle=new StudentSql();
        
        Integer id=Integer.parseInt(request.getParameter("id"));
        student.setId(id);
        if(handle.CheckStudent(student)) {
        	String name=new String(request.getParameter("name").getBytes("iso-8859-1"),"UTF-8");  
            String sex=new String(request.getParameter("sex").getBytes("iso-8859-1"),"UTF-8");	
            String tel=new String(request.getParameter("tel").getBytes("iso-8859-1"),"UTF-8");      
            String birth=new String(request.getParameter("birth").getBytes("iso-8859-1"),"UTF-8"); 
    		String home=new String(request.getParameter("home").getBytes("iso-8859-1"),"UTF-8");
    		
    		student.setName(name);
    		student.setSex(sex);
    		student.setTel(tel);
    		student.setBirth(birth);
    		student.setHome(home);
    		
    		
    		if (handle.save(student))
    			response.sendRedirect("StudentQuery");
    		else
    			response.sendRedirect(request.getContextPath()+"/Login.jsp");
        }
        else {
        	request.getRequestDispatcher("/AddStudentError.jsp").forward(request, response);
        }
        
	}
	
	public void init() throws ServletException {
		// Put your code here
	}
	
	
}
