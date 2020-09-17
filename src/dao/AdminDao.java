package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.AdminBean;
import beans.UserBean;
import utility.JdbcUtility;


public class AdminDao {
	static java.sql.Connection connection;
	static PreparedStatement prepareStatement;

	//Logic for User Registration
		public static int registerAdmin(AdminBean aBean){
			int row=0;
			 try {
				connection=JdbcUtility.getConnection();
				System.out.println(connection);
			    prepareStatement=connection.prepareStatement("insert into adminreg(aname,aemail,amobile,aaddress,apass,arpass) values(?,?,?,?,?,?)");
		       
					prepareStatement.setString(1,aBean.getAname());
					prepareStatement.setString(2,aBean.getAemail());
					prepareStatement.setString(3,aBean.getAmobile());
					prepareStatement.setString(4,aBean.getAaddress());
					prepareStatement.setString(5,aBean.getApass());
					prepareStatement.setString(6,aBean.getArpass());
					row=prepareStatement.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return row;	
		}
		
		//logic to view all users
}
