package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectSQL {
	public static Statement connect() {
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
			// Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/myweb", "root", "root");
			// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码
			stmt = connect.createStatement();
			System.out.println("Success connect Mysql server!");
		} catch (Exception e) {
			System.out.print("Error connecting Mysql!");
			e.printStackTrace();
		}
		return stmt;
	}

	public ResultSet getResult(String order) throws SQLException {
		Statement stmt = connect();
		ResultSet rs = stmt.getResultSet();
		rs = stmt.executeQuery(order);
		return rs;
	}
	
	public void execute(String order) throws SQLException {
		Statement stmt = connect();
		stmt.execute(order);
	}

}