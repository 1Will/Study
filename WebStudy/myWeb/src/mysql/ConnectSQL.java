package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectSQL {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/myweb";
	public static final String USER = "root";
	public static final String PSW = "root";
	private static Connection connect = null;
	private static Statement stmt = null;

	public ConnectSQL() {

		try {
			Class.forName(DRIVER); // 加载MYSQL JDBC驱动程序
			// Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			connect = DriverManager.getConnection(DBURL, USER, PSW);
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码
			stmt = connect.createStatement();
			System.out.println("Success connect Mysql server!");
		} catch (Exception e) {
			System.out.print("Error connecting Mysql!");
			e.printStackTrace();
		}
	}

	public ResultSet getResult(String order) throws SQLException {
		ResultSet rs = stmt.getResultSet();
		rs = stmt.executeQuery(order);
		return rs;
	}

	public void execute(String order) throws SQLException {
		stmt.executeUpdate(order);
	}

}