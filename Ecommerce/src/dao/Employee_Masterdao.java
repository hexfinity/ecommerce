package dao;

import java.sql.SQLException;
import java.util.List;

import model.BankDetails;
import model.Employee_Master;

public interface Employee_Masterdao {
	public void addEmployeemaster(Employee_Master employeeMaster,BankDetails bankdetails)throws SQLException;
	public List<Employee_Master> getAllEmployee();
	public Employee_Master getCoustomerById(int employeeId);
	public void editemployee(Employee_Master employeeMaster,BankDetails bankdetails)throws SQLException;
	public void deleteemployee(int employeeid);
	public int getListemployeeId();

}
