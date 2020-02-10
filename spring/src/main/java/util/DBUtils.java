package util;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils {
	//静态块，需要访问静态变量，当全局变量使用
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private static BasicDataSource dataSource;
	
	//搬出来，静态块只执行一次，不需要每次都读取这个信息
	static{
		//创建配置文件对象
		Properties prop = new Properties();
		// 获取文件的输入流  用类加载器查找文件，得到文件流
		InputStream ips = 
			DBUtils.class.getClassLoader()
			  .getResourceAsStream("jdbc.properties");
		// 把文件加载到prop对象中
		try {
			prop.load(ips);
			// 读取连接数据库的信息
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			System.out.println(driver+":"+url+":"+username+":"+password);
			
			//连接池也是只创建一次，不用每次连接时都创建一个连接池 （数据源对象）
			dataSource = new BasicDataSource();
			//设置数据库连接信息
			dataSource.setDriverClassName(driver);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			// 设置策略信息
			dataSource.setInitialSize(3);
			dataSource.setMaxActive(5);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 封装获取连接对象的代码
	public static Connection getConn() throws Exception{
		Connection conn = dataSource.getConnection();
		return conn;
	}
	
	// 关闭资源
	public static void close(
			ResultSet rs, Statement stat, Connection conn){
		try{
			//避免空指针异常
			if(rs!=null){ 
				rs.close();
			}
			if(stat!=null){ 
				stat.close();
			}
			if(conn!=null){ 
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
