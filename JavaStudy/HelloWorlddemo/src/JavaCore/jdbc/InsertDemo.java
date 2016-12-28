package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
	/*定义连接常量*/
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/data2";
	public static final String USER="root";
	public static final String PSW="root";
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			/*开始连接*/
			Connection conn = DriverManager.getConnection(DBURL,USER,PSW);
			Statement st = conn.createStatement();
			
			int rs = st.executeUpdate("insert into us(name,age) values ('张三',25);");
			System.out.println("更新数目为"+rs);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
