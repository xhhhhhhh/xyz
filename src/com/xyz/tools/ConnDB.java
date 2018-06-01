package com.xyz.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnDB {
	public Connection conn = null;
	public Statement stmt = null; 
	public ResultSet rs = null; 
	private static String url = "jdbc:mysql://localhost:3306/myclass";// 数据库连接字符串
	private static String username = "root";// 数据库用户名
	private static String password = "";// 数据库密码
	
	public static Connection getConnection(){
		  Connection conn=null;
		  try{
		  Class.forName("com.mysql.jdbc.Driver").newInstance();
		  conn=DriverManager.getConnection(url, username, password);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
		  return conn;	  
	}

	
	
	
	
	
	
}
