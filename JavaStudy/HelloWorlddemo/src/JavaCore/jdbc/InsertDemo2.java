package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo2 {
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
			PreparedStatement st = conn.prepareStatement("insert into us(name,age) values (?,?);");
			st.setString(1, "李四");
			st.setInt(2, 20);
			int rs = st.executeUpdate();
			System.out.println("更新数目为"+rs);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
