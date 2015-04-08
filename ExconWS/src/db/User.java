package db;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import params.Params;

public class User {
	
	public static entities.User GetUserInfo(String email)
	{
		ResultSet rs2;
		ResultSet rs;
		List< entities.Conference> confList;
		
		try {

		 rs = Query.RunQuery("select * from _users where email ='" + email+ "'");
		entities.User user = null;

			user = new entities.User();
			if (rs.next())
			{
				user.setId(rs.getString("id"));
				user.setFirst( rs.getString("firstName"));
				user.setLast(rs.getString("lastName"));
				user.setGender(rs.getString("gender"));
				user.setAge(rs.getString("age"));
				user.setPassword(rs.getString("password"));	
				user.setEmail(rs.getString("email"));
				user.setType(rs.getString("type"));
				user.setPic(rs.getString("picLink"));
			}
		if (user.getId() == null)
			return null;
		
		 rs2 = Query.RunQuery("select * from _conference where  id in"
					+ "(select id_conference from _user_conference where id_user = '"+user.getId() + "')");
			confList = new ArrayList<entities.Conference>(); 
			while (rs2.next()) {
				entities.Conference conf =  new entities.Conference();
				conf.setId(rs2.getString("id"));
				conf.setId_manager(rs2.getString("id_manager"));
				conf.setName(rs2.getString("name"));
				conf.setCategory(rs2.getString("category"));
				conf.setGeneral_details(rs2.getString("general_details"));
				conf.setAddress(rs2.getString("address"));
				conf.setImageLink(rs2.getString("image_link"));
				confList.add(conf);
			} //end while	
			user.setConferences(confList);
			
			return user;
		} //end try

		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;		
	}

}
