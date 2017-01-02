package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDemo {
	/*定义连接常量*/
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/data2";
	public static final String USER="root";
	public static final String PSW="root";
	public static void main(String[] args) {
		try {
			//Class.forName(DRIVER);
			/*开始连接*/
			Connection conn = DriverManager.getConnection(DBURL,USER,PSW);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from us;");
			
			while (rs.next()) {
				System.out.print("name="+rs.getString("name")+"-->");
				System.out.print("age="+rs.getInt("age"));
				System.out.println();
				System.out.println("--------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
