package com.JAGym.system.dto;



public class CenterCount implements Center {
	
	private String cCount;
	private String cMonth;
	
	
	public CenterCount() {
		// TODO Auto-generated constructor stub
	}


	public CenterCount(String cCount, String cMonth) {
		super();
		this.cCount = cCount;
		this.cMonth = cMonth;
	}


	public String getcCount() {
		return cCount;
	}


	public void setcCount(String cCount) {
		this.cCount = cCount;
	}


	public String getcMonth() {
		return cMonth;
	}


	public void setcMonth(String cMonth) {
		this.cMonth = cMonth;
	}
	
	
	
}
