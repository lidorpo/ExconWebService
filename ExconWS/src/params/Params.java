package params;

public class Params {
	
	private static String DB_URL = "jdbc:mysql://sadna.c21qy2kvfxgh.us-west-2.rds.amazonaws.com/sadna";
	private static String DB_USER = "lior1122";
	private static String DB_PASS = "12457852aa";
	private static String DB_DRIVER = "com.mysql.jdbc.Driver";
	
	public static String getDB_DRIVER() {
		return DB_DRIVER;
	}

	public static String getDB_USER() {
		return DB_USER;
	}
	
	public static String getDB_URL() {
		return DB_URL;
	}

	public static String getDB_PASS() {
		return DB_PASS;
	}

	

}
