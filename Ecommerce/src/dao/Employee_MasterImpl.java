package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.mysql.jdbc.Driver;

import model.BankDetails;
import model.Company_Master;
import model.Employee_Master;

public class Employee_MasterImpl implements Employee_Masterdao{
	private final String url = "jdbc:mysql://localhost:3306/Ecommerce";
	private final String username = "root";
	private final String password = "123";
	final JPanel panel = new JPanel();
	public Connection getConnection() 
	{
		Connection con = null;
		try 
		{
			Driver driver = new Driver();
			con = DriverManager.getConnection(url, username, password);

		}
		catch (Exception e)
		{
			System.out.println("Error while creating connection() -> " + e);
		}

		return con;
	}
	@Override
	public void addEmployeemaster(Employee_Master employeeMaster,BankDetails bankdetails) throws SQLException {
		// TODO Auto-generated method stub
		try
		{
			Connection con = getConnection();
			String sqltran = "START TRANSACTION";
			PreparedStatement ps = con.prepareStatement(sqltran);
			ps.executeUpdate();
			
			String sql1 = "insert into Employee_Master values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps3 = con.prepareStatement(sql1);
			ps3.setInt(1, employeeMaster.getEmployee_ID());
			ps3.setString(2, employeeMaster.getF_Name());
			ps3.setString(3, employeeMaster.getLast_Name());
			ps3.setString(4, employeeMaster.getEmailId());
			ps3.setString(5,employeeMaster.getPassWord());
			ps3.setString(6, employeeMaster.getContact_Number());
			ps3.setString(7, employeeMaster.getAddress_Line1());
			ps3.setString(8, employeeMaster.getAddress_Line2());
			ps3.setString(9, employeeMaster.getCity());
			ps3.setString(10, employeeMaster.getCountry());
			ps3.setString(11, employeeMaster.getPostal_Code());
			ps3.setDate(12, (Date) employeeMaster.getCreated_Date());
			ps3.setInt(13, employeeMaster.getDesignation_ID());
			ps3.setDate(14, (Date) employeeMaster.getDate_Of_Joining());
			ps3.setByte(15, employeeMaster.getStatus());
			ps3.executeUpdate();
			String sql2 = "insert into BankDetails values (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps4 = con.prepareStatement(sql2);
			ps4.setInt(1, bankdetails.getBank_Details_ID());
			ps4.setString(2, bankdetails.getUser_Type());
			ps4.setInt(3, bankdetails.getUser_ID());
			ps4.setInt(4, bankdetails.getBranch_Code());
			ps4.setString(5,bankdetails.getBank_Name());
			ps4.setString(6, bankdetails.getAccount_Number());
			ps4.setString(7, bankdetails.getIFSC_Code());
			ps4.setString(8, bankdetails.getS_Bank_Name());
			ps4.setString(9, bankdetails.getS_Account_Number());
			ps4.setString(10, bankdetails.getS_IFSC_Code());
			ps4.executeUpdate();
			con.close();
			JOptionPane.showMessageDialog(panel, "Add Employee Master Successfully", "Success",
			        JOptionPane.INFORMATION_MESSAGE);
			String commit = "COMMIT";
			PreparedStatement ps5 = con.prepareStatement(commit);
			ps5.executeUpdate();
			System.out.println("Employee Master added successfully");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(panel, "Error in Add Company Mastere", "Error",
			        JOptionPane.ERROR_MESSAGE);
			Connection con = getConnection();
			String roll = "ROLLBACK";
			PreparedStatement ps6 = con.prepareStatement(roll);
			ps6.executeUpdate();
			con.close();
			System.out.println("Error in add  Company Master() -> " + e);
		}
		
	}

	@Override
	public List<Employee_Master> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee_Master>employee_list=new ArrayList<Employee_Master>();
		try {
			Connection con = getConnection();
			String sql = "select * from Employee_Master";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee_Master employee = new Employee_Master(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getDate(12),rs.getInt(13),rs.getDate(14),rs.getByte(15));
				employee_list.add(employee);
			}
			con.close();

		} catch (Exception e) {
			System.out.println("Error in getAllEmployee() -> " + e);
		}
		
		return  employee_list;
	}

	@Override
	public Employee_Master getCoustomerById(int employeeId) {
		// TODO Auto-generated method stub
		Employee_Master employee_list=new Employee_Master();
		try {
			Connection con = getConnection();
			String sql = "select * from Employee_Master";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee_Master employee = new Employee_Master(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getDate(12),rs.getInt(13),rs.getDate(14),rs.getByte(15));
				
			}
			con.close();

		} catch (Exception e) {
			System.out.println("Error in getCoustomerById() -> " + e);
		}
		
		return  employee_list;
	}

	@Override
	public void editemployee(Employee_Master employeeMaster,BankDetails bankdetails)throws SQLException {
		// TODO Auto-generated method stub
		try
		{
			Connection con = getConnection();
			String sqltran = "START TRANSACTION";
			PreparedStatement ps = con.prepareStatement(sqltran);
			ps.executeUpdate();
			String sql1 = "update Employee_Master set F_Name=? ,Last_Name=? ,EmailId=? ,PassWord=? ,Contact_Number=?,Address_Line1=?,Address_Line2=?,City=?,AddressLine1=? ,AddressLine2=? ,City=?,Country=?,Postal_Code=?,Created_Date=?,Designation_ID=?,Date_Of_Joining=?,Status=?  where Employee_ID=?";
			PreparedStatement ps3 = con.prepareStatement(sql1);
			ps3.setString(1, employeeMaster.getF_Name());
			ps3.setString(2, employeeMaster.getLast_Name());
			ps3.setString(3, employeeMaster.getEmailId());
			ps3.setString(4,employeeMaster.getPassWord());
			ps3.setString(5, employeeMaster.getContact_Number());
			ps3.setString(6, employeeMaster.getAddress_Line1());
			ps3.setString(7, employeeMaster.getAddress_Line2());
			ps3.setString(8, employeeMaster.getCity());
			ps3.setString(9, employeeMaster.getCountry());
			ps3.setString(10, employeeMaster.getPostal_Code());
			ps3.setDate(11, (Date) employeeMaster.getCreated_Date());
			ps3.setInt(12, employeeMaster.getDesignation_ID());
			ps3.setDate(13, (Date) employeeMaster.getDate_Of_Joining());
			ps3.setByte(14, employeeMaster.getStatus());
			ps3.setInt(15, employeeMaster.getEmployee_ID());
			ps3.executeUpdate();
			String sql2 = "Upate BankDetails set User_Type=?,User_ID=?,Branch_Code=?,Bank_Name=?,Account_Number=?,S_Bank_Name=?,S_Account_Number=?,S_IFSC_Code=? where Bank_Details_ID=?";
			PreparedStatement ps4 = con.prepareStatement(sql2);
			ps4.setString(1, bankdetails.getUser_Type());
			ps4.setInt(2, bankdetails.getUser_ID());
			ps4.setInt(3, bankdetails.getBranch_Code());
			ps4.setString(4,bankdetails.getBank_Name());
			ps4.setString(5, bankdetails.getAccount_Number());
			ps4.setString(6, bankdetails.getIFSC_Code());
			ps4.setString(7, bankdetails.getS_Bank_Name());
			ps4.setString(8, bankdetails.getS_Account_Number());
			ps4.setString(9, bankdetails.getS_IFSC_Code());
			ps4.setInt(10, bankdetails.getBank_Details_ID());
			ps4.executeUpdate();
			con.close();
			JOptionPane.showMessageDialog(panel, "edit Employee Master Successfully", "Success",
			        JOptionPane.INFORMATION_MESSAGE);
			String commit = "COMMIT";
			PreparedStatement ps5 = con.prepareStatement(commit);
			ps5.executeUpdate();
			System.out.println("Employee Master Edit successfully");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(panel, "Error in edit Company Mastere", "Error",
			        JOptionPane.ERROR_MESSAGE);
			Connection con = getConnection();
			String roll = "ROLLBACK";
			PreparedStatement ps6 = con.prepareStatement(roll);
			ps6.executeUpdate();
			con.close();
			System.out.println("Error in Edit  Employee Master() -> " + e);
		}
		
	}

	@Override
	public void deleteemployee(int employeeid) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public int getListemployeeId() {
		// TODO Auto-generated method stub
		 int last=0;
		 try {
		  Connection con = getConnection();
			String sql = "select * from Employee_Master";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				last=rs.getInt(1);
			}
			con.close();

		} catch (Exception e) {
			System.out.println("Error in getListemployeeId() -> " + e);
		}
		
		
		 return last;
	}

}
