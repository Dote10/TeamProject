package com.JAGym.system.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.JAGym.system.dto.MemberChartDto;
import com.JAGym.system.dto.MemberSys;

@Service
public class MemberSysCountDao {
	
	 
	//private  String url="jdbc:oracle:thin:@localhost:1521:xe";
	//private String user="dip";
	//private String pass ="2323";
	 private static Connection con;
	//private Statement stmt;
	//private ResultSet rs;
	
	 @Autowired 
		private DataSource dataSource;
		
	
	 
	 
	
	public List<MemberChartDto> getMemberCount(){
		
		List<MemberChartDto> mCountlist= new ArrayList <MemberChartDto>();
		
		try {
			Connection con =dataSource.getConnection();
		String query="select count(id),"
				+ "        DECODE(substr(TO_CHAR(regdate),4,2),'01','1��',"
				+ "                                            '02','2��',"
				+ "                                            '03','3��',"
				+ "                                            '04','4��',"
				+ "                                            '05','5��',"
				+ "                                            '06','6��',"
				+ "                                            '07','7��',"
				+ "                                            '08','8��',"
				+ "                                            '09','9��',"
				+ "                                            '10','10��',"
				+ "                                            '11','11��',"
				+ "                                            '12','12��',"
				+ "                                            'DEFAULT') AS MONTN"
				+ " FROM MEMBER"
				+ " group by substr(TO_CHAR(regdate),4,2)"
				+ " order by substr(TO_CHAR(regdate),4,2)";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String mCount=rs.getString(1);
				String mMonth=rs.getString(2);
				
			
			
			MemberChartDto membercount = new MemberChartDto (mCount,mMonth);
			
			
			
			mCountlist.add(membercount);
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		return mCountlist;
	}
}
