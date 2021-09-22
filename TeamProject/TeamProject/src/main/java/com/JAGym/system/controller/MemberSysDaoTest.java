package com.JAGym.system.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.JAGym.system.dao.MemberSysDao;
import com.JAGym.system.dto.MemberSys;

public class MemberSysDaoTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
	MemberSysDao dao = new MemberSysDao ();
	
	ArrayList<MemberSys> list=  new <MemberSys> ArrayList(dao.printBase());
	
	System.out.println(list);
	
	}

}
