package com.internousdev.login.utill;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/logindb";
	
	private static String user = "root";
	private static String password = "mysql";
	
	 public Connection getConnection(){
    Connection con = null;
    
    try{
    	Class.forName(driverName);
    	con = (Connection)DriverManager.getConnection(url,user,password);
    	
    }catch(ClassNotFoundException e){
    	e.printStackTrace();
    }catch(SQLException e){
    	e.printStackTrace();
    }
    
    return con;
	}

 }
