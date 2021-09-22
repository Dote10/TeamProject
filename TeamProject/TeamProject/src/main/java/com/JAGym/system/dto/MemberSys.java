package com.JAGym.system.dto;



public class MemberSys implements Member {
	
	private String id;
	private String pwd;
	private String name;
	private String phone;
	private String email;
	private String zipCode;
	private String address;
	private String regdate;
	
	
	
	public MemberSys() {
		
	}
	
	
	public MemberSys(String id, String pwd, String name, String phone, String email, String zipCode, String address,
			String regdate) {
		
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.zipCode = zipCode;
		this.address = address;
		this.regdate = regdate;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPone(String pone) {
		this.phone = pone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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


	public void setAdress(String address) {
		this.address = address;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return id +"/"+ pwd+"/"+ name+"/"+phone+"/"+email+"/"+zipCode
				+"/"+address+"/"+regdate;
	}


	
	
	
}
