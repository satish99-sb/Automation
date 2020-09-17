package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.ProductBean;
import utility.JdbcUtility;

public class ProductDao {

	static java.sql.Connection connection;
	static PreparedStatement prepareStatement;

	//Logic for Product in or insert or save product
		public static int productIn(ProductBean probean){
			int row=0;
			 try {
				connection=JdbcUtility.getConnection();
				System.out.println(connection);
			    prepareStatement=connection.prepareStatement("insert into products3(proname,prodesc,date,proqty,custname,proprice) values(?,?,?,?,?,?)");
		       
					
					
					prepareStatement.setString(1,probean.getProname());
					prepareStatement.setString(2,probean.getProdesc());
					prepareStatement.setString(3,probean.getDate());
					prepareStatement.setString(4,probean.getProqty());
					prepareStatement.setString(5,probean.getCustname());
					prepareStatement.setString(6,probean.getProprice());
					row=prepareStatement.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return row;	
		}


		//logic to retrieve particular product
		@SuppressWarnings("rawtypes")
		public static void retrievePro() {
			int row=0;
			connection=JdbcUtility.getConnection();
			System.out.println(connection);
			String date = null;
	        List<ProductBean> list=new ArrayList<ProductBean>();  
			try {
				prepareStatement=connection.prepareStatement("select * from products3 where date='?'");
				  ResultSet rs=prepareStatement.executeQuery();  
		            while(rs.next()){  
		                ProductBean probean=new ProductBean();  
		                probean.setDate(rs.getString(4)); 
		                list.add(probean);  

			} 
		            connection.close();  
			}  

		        catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
		
		//logic to retrieve all records from product
		 public static List<ProductBean> getAllProducts(){  
		        List<ProductBean> list=new ArrayList<ProductBean>();  
		          
		        try{  
		            connection=JdbcUtility.getConnection();  
				    prepareStatement=connection.prepareStatement("select * from products3");
		            ResultSet rs=prepareStatement.executeQuery();  
		            while(rs.next()){  
		                ProductBean probean=new ProductBean(); 
		                
		                probean.setId(rs.getInt(1));  
		                probean.setProname(rs.getString(2));  
		                probean.setProdesc(rs.getString(3));  
		                probean.setDate(rs.getString(4));  
		                probean.setProqty(rs.getString(5));
		                probean.setCustname(rs.getString(6));
		                probean.setProprice(rs.getString(7));
		                list.add(probean);  
		            }  
		            connection.close();  
		        }catch(Exception e){e.printStackTrace();}  
		          
		        return list;  
		    }  
}
