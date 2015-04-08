package db;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import params.Params;



public class Conference {
	
	public static List<entities.Conference> GetUserConferences(String uid)
	{
		List<entities.Conference> conferences = new ArrayList<entities.Conference>();
		
		try {
			Class.forName(Params.getDB_DRIVER());
			java.sql.Connection con = DriverManager.getConnection (Params.getDB_URL(), Params.getDB_USER(), Params.getDB_PASS());
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from _conference where  id in"
					+ "(select id_conference from _user_conference where id_user = '"+uid + "')");
			
			while (rs.next()) {
				entities.Conference conf =  new entities.Conference();
				conf.setId(rs.getString("id"));
				conf.setId_manager(rs.getString("id_manager"));
				conf.setName(rs.getString("name"));
				conf.setCategory(rs.getString("category"));
				conf.setGeneral_details(rs.getString("general_details"));
				conf.setAddress(rs.getString("address"));
				conf.setImageLink(rs.getString("image_link"));
				conferences.add(conf);
				} //end while
				//con.close();
				return conferences;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}

}
