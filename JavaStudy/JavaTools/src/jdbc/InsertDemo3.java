package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo3 {
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
			conn.setAutoCommit(false);
			Statement st = conn.createStatement();
			String insert="insert into us(name,age) values ";
			
			st.executeUpdate(insert+"('张三1',21);");
			st.executeUpdate(insert+"('张三2',22);");
			st.executeUpdate(insert+"('张三3',23);");
			st.executeUpdate(insert+"('张三4' 25);");
			st.executeUpdate(insert+"('张三5',28);");
			conn.commit();
			System.out.println("更新数目为");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
