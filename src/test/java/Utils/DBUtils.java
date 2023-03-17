package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {

	private Connection connection;
	
	public DBUtils() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicare", "root", "root");
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void closeConnection() throws SQLException {
		if (connection != null) {
			connection.close();
		}
	}
	
	public String getCategoryDescription(String catName) throws SQLException {
		String categoryDescription = "";
		Statement stm = connection.createStatement();
		
		ResultSet result = stm.executeQuery("select * from category where name = '" + catName + "';");
		
		while(result.next()) {
			if (result.getString("name").equals(catName)) {
				categoryDescription = result.getString("description");
				break;
			}
		}
		
		return categoryDescription;
	}
	
	public void removeCategory(String categoryName) throws SQLException {
		Statement stm = connection.createStatement();
		
		String query = "delete from category where name = '" + categoryName + "';";
		stm.executeUpdate(query);
	}
}
