import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Properties;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

public class AllQueries {
	private static String dbURL;
	private static String dbUsername = "root";
	private static String dbPassword = "iamGh0st!";		
	private static String URL = "127.0.0.1";
	private static String port = "3306";
	private static String dbName = "OnlineExams";
	private static Connection con;
	static ObservableList<Students> studentsOb = FXCollections.observableArrayList();

	public static void connectDB() throws ClassNotFoundException, SQLException {

		dbURL = "jdbc:mysql://" + URL + ":" + port + "/" + dbName + "?verifyServerCertificate=false";
		Properties p = new Properties();
		p.setProperty("user", dbUsername);
		p.setProperty("password", dbPassword);
		p.setProperty("useSSL", "false");
		p.setProperty("autoReconnect", "true");
		Class.forName("com.mysql.jdbc.Driver");

		con = DriverManager.getConnection(dbURL, p);

	}

	public static void ExecuteStatement(String SQL) throws SQLException {

		try {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(SQL);
			stmt.close();

		} catch (SQLException s) {
			AlertBox.display("SQL statement is not executed!");

		}

	}

	public static ObservableList<Students> getStudents() throws ClassNotFoundException, SQLException {
		
		String SQL;

		connectDB();

		SQL = "select ID,Password,Name,PhoneNumber,Email,budget from Students order by ID";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {

			int id = Integer.parseInt(rs.getString(1));
			int phoneNumber = Integer.parseInt(rs.getString(4));
			int budget=Integer.parseInt(rs.getString(6));

			Students student = new Students(id, rs.getString(2), rs.getString(3), phoneNumber, rs.getString(4),budget);

			studentsOb.add(student);

		}
		rs.close();
		stmt.close();

		con.close();
		return studentsOb;

	}

	public static ObservableList<Teachers> getTeachers() throws ClassNotFoundException, SQLException {
		ObservableList<Teachers> teachersOb = FXCollections.observableArrayList();
		String SQL;

		connectDB();

		SQL = "select ID,Name,Email,budget from teachers order by ID";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			
			int id = Integer.parseInt(rs.getString(1));
			int budget = Integer.parseInt(rs.getString(4));

			Teachers teacher = new Teachers(id, rs.getString(2), rs.getString(3),budget);

			teachersOb.add(teacher);

		}
		rs.close();
		stmt.close();

		con.close();
		return teachersOb;

	}
	
	public static ObservableList<Manager> getManager() throws ClassNotFoundException, SQLException{
		ObservableList<Manager> ManagerOb = FXCollections.observableArrayList();
		String SQL;
		connectDB();
		SQL="select SSN,PhoneNumber,Name,budget from Manager";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SQL);
		
		while(rs.next()) {
			int SSN = Integer.parseInt(rs.getString(1));
			int phoneNumber = Integer.parseInt(rs.getString(2));
			int budget = Integer.parseInt(rs.getString(4));
			
			Manager manager = new Manager(SSN,phoneNumber,rs.getString(3),budget);
			ManagerOb.add(manager);
		}
		rs.close();
		stmt.close();
		con.close();
		return ManagerOb;
		
	}
	
	public static void insertStudent(Students student) {
		try {
			connectDB();

			ExecuteStatement(
					"Insert into students (Password,Name,PhoneNumber,Email,budget) values('" + student.getPassword() + "','" + student.getName() + "',"+student.getPhoneNumber()+",'"+student.getEmail()+"',"+student.getBudget()+");");
					studentsOb.add(student);
					
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			AlertBox.display("SQL statement is not executed!");
		}
	}
	

}