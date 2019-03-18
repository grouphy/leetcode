package test_duy_Connection_jdbc.copy;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connections {
	public static Connection getConnection() throws Exception {
		//驱动程序名
	    String driver = "com.mysql.jdbc.Driver";
	    //URL指向要访问的数据库名mydata
	    String url = "jdbc:mysql://localhost:3306/mysql";
	    //MySQL配置时的用户名
	    String user = "root";
	    //MySQL配置时的密码
	    String password = "123456";
	    Class.forName(driver);
		return DriverManager.getConnection(url,user,password);
	}
}
