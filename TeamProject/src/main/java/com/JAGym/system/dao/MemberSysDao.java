package com.JAGym.system.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.JAGym.system.dto.MemberSys;

public class MemberSysDao {
	
	 
	//private  String url="jdbc:oracle:thin:@localhost:1521:xe";
	//private String user="dip";
	//private String pass ="2323";
	 private static Connection con;
	//private Statement stmt;
	//private ResultSet rs;
	
	
	public void connDB() {
		
		
		
		
		try {
			
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dip","2323");
			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<MemberSys> printBase(){
		
		ArrayList<MemberSys> list= new <MemberSys> ArrayList();
		
		try {
		connDB();
		String query="SELECT*FROM MEMBER";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String id=rs.getString(1);
				String pwd=rs.getString(2);
				String name=rs.getString(3);
				String phone=rs.getString(4);
				String email=rs.getString(5);
				String zipCode=rs.getString(6);
				String address=rs.getString(7);
				String regdate=rs.getString(8);
			
			
			MemberSys membersys = new MemberSys (id
									   ,pwd
									   ,name
									   ,phone
									   ,email
									   ,zipCode
									   ,address
									   ,regdate);
			
			
			
			list.add(membersys);
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		return list;
	}
}
