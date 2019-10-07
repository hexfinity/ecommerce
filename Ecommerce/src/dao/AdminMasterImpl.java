package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;

import com.mysql.jdbc.Driver;

import model.AdminMaster;



public class AdminMasterImpl implements AdminMasterdao {
	private final String url = "jdbc:mysql://localhost:3306/Ecommerce";
	private final String username = "root";
	private final String password = "123";
	public Connection getConnection() {
		Connection con = null;
		try {
			Driver driver = new Driver();
			con = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			System.out.println("Error while creating connection() -> " + e);
		}

		return con;
	}
	public static void main(String args[]) {
		AdminMasterImpl aimp=new AdminMasterImpl();
		AdminMaster a=new AdminMaster();
		
		  a.setAdmin_ID(1); a.setF_Name("antony"); a.setLast_Name("raj");
		  a.setEmail_ID("antony@gmail.com"); a.setAdmin_PassWord("123456789");
		  a.setAddress_Line1("fuygu1"); a.setAddress_Line2("tuytuyi2");
		  a.setCity("city1"); a.setCountry("country2"); a.setPostal_Code("123456");
		  a.setStatus((byte)0); //aimp.addAdminMaster(a);
		 
		  //int a=aimp.getLastAdminId(); System.out.println(a);
		 
		//aimp.getAdminById(1);
		  aimp.EditAdmin(a);
	}
	
	@Override
	public void addAdminMaster(AdminMaster admin) {
		// TODO Auto-generated method stub
		try {
			Connection con = getConnection();
			String sql = "insert into Admin_Master (Admin_ID,FName,Last_Name,EmailId,Admin_PassWord,Address_Line1,Address_Line2,City,Country,Postal_Code,Created_Date,Status) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,admin.getAdmin_ID());
			ps.setString(2,admin.getF_Name());
			ps.setString(3, admin.getLast_Name());
			ps.setString(4, admin.getEmail_ID());
			ps.setString(5, admin.getAdmin_PassWord());
			ps.setString(6,admin.getAddress_Line1());
			ps.setString(7,admin.getAddress_Line2());
			ps.setString(8,admin.getCity());
			ps.setString(9, admin.getCountry());
			ps.setString(10, admin.getPostal_Code());
			ps.setDate(11, admin.getCreated_Date());
			ps.setByte(12,admin.getStatus());
			ps.executeUpdate();
			con.close();
			System.out.println("AdminMaster added successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error in addAdminMaster() -> " + e);
		}
		
	}
	@Override
	public List<AdminMaster> getAllAdminMaster() {
		// TODO Auto-generated method stub
		List<AdminMaster>admin=new ArrayList<AdminMaster>();
		try {
			Connection con =getConnection();
			String sql="select * from Admin_Master";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				AdminMaster adminmaster = new AdminMaster(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getDate(11),rs.getByte(12));
				admin.add(adminmaster);
			}
		}
			catch (Exception e) {
				System.out.println("Error in getAllAdminDtetails() -> " + e);
			}
		
		
			return admin;
	}
	@Override
	public AdminMaster getAdminById(int adminid) {
		// TODO Auto-generated method stub
		AdminMaster admin=new AdminMaster();
		try {
			Connection con =getConnection();
			String sql="select * from Admin_Master where Admin_ID=? ";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, adminid);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				 admin = new AdminMaster(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getDate(11),rs.getByte(12));
				
			}
		}
			catch (Exception e) {
				System.out.println("Error in getAgentById() -> " + e);
			}
		
		
			return admin;
	}
	@Override
	public void EditAdmin(AdminMaster admin) {
		// TODO Auto-generated method stub
		try {
			Connection con = getConnection();
			String sql = "Update Admin_Master set FName=?,Last_Name=?,EmailId=?,Admin_PassWord=?,Address_Line1=?,Address_Line2=?,City=?,Country=?,Postal_Code=?,Created_Date=?,Status=? where Admin_ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,admin.getF_Name());
			ps.setString(2, admin.getLast_Name());
			ps.setString(3, admin.getEmail_ID());
			ps.setString(4, admin.getAdmin_PassWord());
			ps.setString(5,admin.getAddress_Line1());
			ps.setString(6,admin.getAddress_Line2());
			ps.setString(7,admin.getCity());
			ps.setString(8, admin.getCountry());
			ps.setString(9, admin.getPostal_Code());
			ps.setDate(10, admin.getCreated_Date());
			ps.setByte(11,admin.getStatus());
			ps.setInt(12,admin.getAdmin_ID());
			ps.executeUpdate();
			con.close();
			System.out.println("AdminMaster Updated successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error in EditAdminMaster() -> " + e);
		}
		
	}
	@Override
	public int getLastAdminId() {
		// TODO Auto-generated method stub
		int last=0;
		try
		{
			Connection con =getConnection();
			String sql="select * from Admin_Master";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
			 last=rs.getInt(1);
				
			}
		   return last;
		}
		catch(Exception e){
			System.out.println("LastAdminId() -> "+e);
			
		}
		return last;
	}
	@Override
	public void daleteAdminMaster(int adminID) {
		// TODO Auto-generated method stub
		try {
			Connection con = getConnection();
			String sql = "Delete from Admin_Master where Admin_ID =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, adminID);
			ps.executeUpdate();
			con.close();

		} catch (Exception e) {
			System.out.println("Error DeleteAdmin-> :) "+e);
		}
		
	}

}
