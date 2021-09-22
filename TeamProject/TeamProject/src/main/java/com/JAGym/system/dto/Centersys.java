package com.JAGym.system.dto;



public class Centersys implements Center {
	
	private String centerCode;
	private String centerName;
	private String sportsCode;
	private String phone;
	private String zipCode;
	private String address;
	private String ceoName;
	private String ceoEmail;
	private String CeoPhone;
	private String usageFeeMin;
	private String usageFeeMax;
	private String regFee;
	private String openDate;
	private String interestCnt;
	private String recommendCNT;
	private String regdate;
	
	
	//力寇等 加己 23-7=16
	//latitude,longitude,dayoff,operaring_time,thumbnail,image,detail
	
	public Centersys() {
		// TODO Auto-generated constructor stub
	}


	public Centersys(String centerCode, String centerName, String sportsCode, String phone, String zipCode,
			String address, String ceoName, String ceoEmail, String ceoPhone, String usageFeeMin, String usageFeeMax,
			String regFee, String openDate, String interestCnt, String recommendCNT, String regdate) {
		super();
		this.centerCode = centerCode;
		this.centerName = centerName;
		this.sportsCode = sportsCode;
		this.phone = phone;
		this.zipCode = zipCode;
		this.address = address;
		this.ceoName = ceoName;
		this.ceoEmail = ceoEmail;
		CeoPhone = ceoPhone;
		this.usageFeeMin = usageFeeMin;
		this.usageFeeMax = usageFeeMax;
		this.regFee = regFee;
		this.openDate = openDate;
		this.interestCnt = interestCnt;
		this.recommendCNT = recommendCNT;
		this.regdate = regdate;
	}


	public String getCenterCode() {
		return centerCode;
	}


	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}


	public String getCenterName() {
		return centerName;
	}


	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}


	public String getSportsCode() {
		return sportsCode;
	}


	public void setSportsCode(String sportsCode) {
		this.sportsCode = sportsCode;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCeoName() {
		return ceoName;
	}


	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}


	public String getCeoEmail() {
		return ceoEmail;
	}


	public void setCeoEmail(String ceoEmail) {
		this.ceoEmail = ceoEmail;
	}


	public String getCeoPhone() {
		return CeoPhone;
	}


	public void setCeoPhone(String ceoPhone) {
		CeoPhone = ceoPhone;
	}


	public String getUsageFeeMin() {
		return usageFeeMin;
	}


	public void setUsageFeeMin(String usageFeeMin) {
		this.usageFeeMin = usageFeeMin;
	}


	public String getUsageFeeMax() {
		return usageFeeMax;
	}


	public void setUsageFeeMax(String usageFeeMax) {
		this.usageFeeMax = usageFeeMax;
	}


	public String getRegFee() {
		return regFee;
	}


	public void setRegFee(String regFee) {
		this.regFee = regFee;
	}


	public String getOpenDate() {
		return openDate;
	}


	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}


	public String getInterestCnt() {
		return interestCnt;
	}


	public void setInterestCnt(String interestCnt) {
		this.interestCnt = interestCnt;
	}


	public String getRecommendCNT() {
		return recommendCNT;
	}


	public void setRecommendCNT(String recommendCNT) {
		this.recommendCNT = recommendCNT;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	

}
