package com.JAGym.system.dto;



public class MemberChartDto implements ChartDto {
	
	private String mCount;
	private String mMonth;
	
	
	
	 public MemberChartDto() {
		// TODO Auto-generated constructor stub
	}



	public MemberChartDto(String mCount, String mMonth) {
	
		this.mCount = mCount;
		this.mMonth = mMonth;
	}



	public String getmCount() {
		return mCount;
	}



	public void setmCount(String mCount) {
		this.mCount = mCount;
	}



	public String getmMonth() {
		return mMonth;
	}



	public void setmMonth(String mMonth) {
		this.mMonth = mMonth;
	}
	 
	 
	
	
	

	
	
	
}
