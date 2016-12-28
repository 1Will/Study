package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo2 {
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
			PreparedStatement st = conn.prepareStatement("delete from us where id=?");
			st.setInt(1, 6);
			int rs = st.executeUpdate();
			System.out.println("更新数目为"+rs);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
