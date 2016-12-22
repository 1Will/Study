package mysql;

import java.sql.*;
public class TestMysql {
  public static void main(String args[]) {
    try {
      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
      //Class.forName("org.gjt.mm.mysql.Driver");
     System.out.println("Success loading Mysql Driver!");
    }
    catch (Exception e) {
      System.out.print("Error loading Mysql Driver!");
      e.printStackTrace();
    }
    try {
      Connection connect = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/data1","root","root");
           //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

      System.out.println("Success connect Mysql server!");
      Statement stmt = connect.createStatement();
      ResultSet rs = stmt.executeQuery("select * from user");
                                                              //user 为你表的名称
      System.out.println("name"+"\t"+"|"+"\t"+"age"+"\t"+"|"+"\t"+"tel"+"\t"+"\t"+"|"+"\t"+"city"+"\t"+"|");
      System.out.println("_______________________________________________________________");
      while (rs.next()) {
	System.out.println(rs.getString("name")+"\t"+"|"+"\t"+rs.getString("age")+"\t"+"|"+"\t"+rs.getString("tel")+"\t"+"|"+"\t"+rs.getString("city")+"\t"+"|");
	System.out.println("---------------------------------------------------------------");
      }
    }
    catch (Exception e) {
      System.out.print("get data error!");
      e.printStackTrace();
    }
  }
}