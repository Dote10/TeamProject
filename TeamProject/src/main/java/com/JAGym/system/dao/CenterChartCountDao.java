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

import com.JAGym.system.dto.CenterChartDto;


@Service
public class CenterChartCountDao {
	
	 
	//private  String url="jdbc:oracle:thin:@localhost:1521:xe";
	//private String user="dip";
	//private String pass ="2323";
	 private static Connection con;
	//private Statement stmt;
	//private ResultSet rs;
	
	 @Autowired
		 private DataSource dataSource;
		
	
	 
	 
	
	public List<CenterChartDto> getCenterCount(){
		
		List<CenterChartDto> cCountlist= new ArrayList <CenterChartDto>();
		
		try {
			con =dataSource.getConnection();
		String query="select count(center_code),"
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
				+ " FROM CENTER"
				+ " group by substr(TO_CHAR(regdate),4,2)"
				+ " order by substr(TO_CHAR(regdate),4,2)";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String cCount=rs.getString(1);
				String cMonth=rs.getString(2);
				
			
			
			CenterChartDto centercount = new CenterChartDto (cCount,cMonth);
			
			
			
			cCountlist.add(centercount);
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		return cCountlist;
	}
}
