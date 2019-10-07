package model;

import java.sql.Date;



public class AdminMaster {
	
	public int getAdmin_ID() {
		return admin_ID;
	}
	public String getF_Name() {
		return f_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public String getEmail_ID() {
		return email_ID;
	}
	public String getAdmin_PassWord() {
		return admin_PassWord;
	}
	public String getAddress_Line1() {
		return address_Line1;
	}
	public String getAddress_Line2() {
		return address_Line2;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return Country;
	}
	public String getPostal_Code() {
		return postal_Code;
	}
	public Date getCreated_Date() {
		return created_Date;
	}
	public byte getStatus() {
		return status;
	}
	public void setAdmin_ID(int admin_ID) {
		this.admin_ID = admin_ID;
	}
	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	public void setAdmin_PassWord(String admin_PassWord) {
		this.admin_PassWord = admin_PassWord;
	}
	public void setAddress_Line1(String address_Line1) {
		this.address_Line1 = address_Line1;
	}
	public void setAddress_Line2(String address_Line2) {
		this.address_Line2 = address_Line2;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public void setPostal_Code(String postal_Code) {
		this.postal_Code = postal_Code;
	}
	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	
	public AdminMaster(int admin_ID, String f_Name, String last_Name, String email_ID, String admin_PassWord,
			String address_Line1, String address_Line2, String city, String country, String postal_Code,
			Date created_Date, byte status) {
		super();
		this.admin_ID = admin_ID;
		this.f_Name = f_Name;
		this.last_Name = last_Name;
		this.email_ID = email_ID;
		this.admin_PassWord = admin_PassWord;
		this.address_Line1 = address_Line1;
		this.address_Line2 = address_Line2;
		this.city = city;
		Country = country;
		this.postal_Code = postal_Code;
		this.created_Date = created_Date;
		this.status = status;
	}
	public AdminMaster() {
		
	}
	private int admin_ID;
	private String f_Name;
	private String last_Name;
	private String email_ID;
	private String admin_PassWord;
	private String address_Line1;
	private String address_Line2;
	private String city;
	private String Country;
	private String postal_Code;
	private Date created_Date;
	private byte status;

}
