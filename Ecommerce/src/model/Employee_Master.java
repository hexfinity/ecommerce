package model;

import java.util.Date;

public class Employee_Master {
	
	public String getF_Name() {
		return F_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public String getEmailId() {
		return EmailId;
	}
	public String getPassWord() {
		return PassWord;
	}
	public String getContact_Number() {
		return Contact_Number;
	}
	public String getAddress_Line1() {
		return Address_Line1;
	}
	public String getAddress_Line2() {
		return Address_Line2;
	}
	public String getCity() {
		return City;
	}
	public String getCountry() {
		return Country;
	}
	public String getPostal_Code() {
		return Postal_Code;
	}
	public Date getCreated_Date() {
		return Created_Date;
	}
	public int getDesignation_ID() {
		return Designation_ID;
	}
	public Date getDate_Of_Joining() {
		return Date_Of_Joining;
	}
	public byte getStatus() {
		return Status;
	}
	public void setF_Name(String f_Name) {
		F_Name = f_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public void setContact_Number(String contact_Number) {
		Contact_Number = contact_Number;
	}
	public void setAddress_Line1(String address_Line1) {
		Address_Line1 = address_Line1;
	}
	public void setAddress_Line2(String address_Line2) {
		Address_Line2 = address_Line2;
	}
	public void setCity(String city) {
		City = city;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public void setPostal_Code(String postal_Code) {
		Postal_Code = postal_Code;
	}
	public void setCreated_Date(Date created_Date) {
		Created_Date = created_Date;
	}
	public void setDesignation_ID(int designation_ID) {
		Designation_ID = designation_ID;
	}
	public void setDate_Of_Joining(Date date_Of_Joining) {
		Date_Of_Joining = date_Of_Joining;
	}
	public void setStatus(byte status) {
		Status = status;
	}
	public int getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}
	public Employee_Master(int employee_ID, String f_Name, String last_Name, String emailId, String passWord,
			String contact_Number, String address_Line1, String address_Line2, String city, String country,
			String postal_Code, Date created_Date, int designation_ID, Date date_Of_Joining, byte status) {
		super();
		Employee_ID = employee_ID;
		F_Name = f_Name;
		Last_Name = last_Name;
		EmailId = emailId;
		PassWord = passWord;
		Contact_Number = contact_Number;
		Address_Line1 = address_Line1;
		Address_Line2 = address_Line2;
		City = city;
		Country = country;
		Postal_Code = postal_Code;
		Created_Date = created_Date;
		Designation_ID = designation_ID;
		Date_Of_Joining = date_Of_Joining;
		Status = status;
	}
	public Employee_Master(){
		
	}
	private int Employee_ID;
	private String F_Name;
	private String Last_Name;
	private String EmailId;
	private String PassWord;
	private String Contact_Number;
	private String Address_Line1;
	private String Address_Line2;
	private String City;
	private String Country;
	private String Postal_Code;
	private Date Created_Date;
	private int Designation_ID;
	private Date Date_Of_Joining;
	private byte Status;

}
