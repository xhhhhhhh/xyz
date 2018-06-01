package com.xyz.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xyz.entity.Admin;
import com.xyz.entity.Student;
import com.xyz.tools.ConnDB;


public class StudentSql {
	Connection conn;
    Statement  stmt;
    ResultSet  rs;
    PreparedStatement ps;
    
    public boolean save(Student student){
		boolean bln=false;
		
		Integer id=student.getId();
		String name=student.getName();
		String sex=student.getSex();
		String tel=student.getTel();
		String birth=student.getBirth();
		String home=student.getHome();
//		byte[] picture=student.getPicture();
		
		try{
			conn=ConnDB.getConnection();
			stmt=conn.createStatement();
			String str="insert into student values(";
		    str+="'"+id+"','"+name+"','"+sex+"','"+tel+"','"+birth+"','"+home+"')";
			stmt.executeUpdate(str);
			bln=true;
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
		return bln;
	}
    public boolean update(Student student){
		boolean bln=false;
		
		Integer id=student.getId();
		String name=student.getName();
		String sex=student.getSex();
		String tel=student.getTel();
		String birth=student.getBirth();
		String home=student.getHome();
//		byte[] picture=student.getPicture();
		
		try{
			conn=ConnDB.getConnection();
			String sql = "update tb_books set name=? sex=? tel=? birth=? home=? where id=?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			// 对SQL语句中的第二个参数赋值
			ps.setString(2, sex);
			ps.setString(3, tel);
			ps.setString(4, birth);
			ps.setString(5, home);
			ps.setInt(6, id);
			// 执行更新操作
			ps.executeUpdate();
			// 关闭PreparedStatement
			
			
			
			bln=true;
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				ps.close();
				conn.close();
				}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		return bln;
	}
    
    public List<Student> getStudentAll()
    {
    	 List<Student> list=new ArrayList<Student>();
    	 String str="select * from student order by id asc";
    	 try{
				conn=ConnDB.getConnection();
				stmt=conn.createStatement();
				
				rs=stmt.executeQuery(str);
				while (rs.next())
				{
					Student student= new Student();
					student.setId(rs.getInt("id"));
					student.setName(rs.getString("name"));
					student.setSex(rs.getString("sex"));
					student.setTel(rs.getString("tel"));
					student.setBirth(rs.getString("birth"));
					student.setHome(rs.getString("home"));
					list.add(student);
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
	  	
	    	return list;
    }
    
    public boolean CheckStudent(Student student){
    	
    	boolean blnResult=true;
    	    	
    	Integer id=student.getId();
    	
    	try{
			conn=ConnDB.getConnection();
			stmt=conn.createStatement();
			String str="select * from student where id='"+id+"'";
			rs=stmt.executeQuery(str);
			
			while (rs.next())
			{
				blnResult=false;
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
