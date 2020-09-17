package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.UserBean;
import utility.JdbcUtility;

public class UserDao {
static java.sql.Connection connection;
static PreparedStatement prepareStatement;

//Logic for User Registration
	public static int registerUser(UserBean uBean){
		int row=0;
		 try {
			connection=JdbcUtility.getConnection();
			System.out.println(connection);
		    prepareStatement=connection.prepareStatement("insert into userreg(uname,uemail,umobile,uaddress,upass,urpass) values(?,?,?,?,?,?)");
	       
				prepareStatement.setString(1,uBean.getUname());
				prepareStatement.setString(2,uBean.getUemail());
				prepareStatement.setString(3,uBean.getUmobile());
				prepareStatement.setString(4,uBean.getUaddress());
				prepareStatement.setString(5,uBean.getUpass());
				prepareStatement.setString(6,uBean.getUrpass());
				row=prepareStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return row;	
	}
	
	//logic to view all users
	
}
