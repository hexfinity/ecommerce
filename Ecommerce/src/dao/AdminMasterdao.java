package dao;

import java.util.List;

import model.AdminMaster;

public interface AdminMasterdao {
	public void addAdminMaster(AdminMaster admin);
	public List<AdminMaster>getAllAdminMaster();
	public AdminMaster getAdminById(int adminid);
	public void EditAdmin(AdminMaster admin);
	public int getLastAdminId();
	public void daleteAdminMaster(int adminID);

}
