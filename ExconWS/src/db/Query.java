package db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import params.Params;

public class Query {
	
	public static ResultSet RunQuery(String query)
	{
		ResultSet rs = null;
		java.sql.Connection con = null;
			try
			{
				Class.forName(Params.getDB_DRIVER());
				 con = DriverManager.getConnection (Params.getDB_URL(), Params.getDB_USER(), Params.getDB_PASS());
				Statement stmt = con.createStatement();
				rs = stmt.executeQuery(query);
				//con.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			return rs;
	}

}
