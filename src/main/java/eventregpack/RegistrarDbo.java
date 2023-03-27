package eventregpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class RegistrarDbo {

	private String dbUrl = "jdbc:mysql://localhost:3306/registration";
	private String dbUname = "root";
	private String dbPassword = "root";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";

	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
			println("connection ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	private void println(String string) {
		// TODO Auto-generated method stub

	}

	public String insert(Member member) {
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into registration.member values(?,?,?,?,?,?,?,?,?)";

		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getFullname());
			ps.setString(2, member.getHtnumber());
			ps.setString(3, member.getBranch());
			ps.setString(4, member.getSection());
			ps.setString(5, member.getEmail());
			ps.setString(6, member.getPassword());
			ps.setString(7, member.getPhone());
			ps.setString(8, member.getGender());
			ps.setString(9, member.getAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}

}
