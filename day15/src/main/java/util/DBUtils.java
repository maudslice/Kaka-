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
	//��̬�飬��Ҫ���ʾ�̬��������ȫ�ֱ���ʹ��
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	private static BasicDataSource dataSource;
	
	//���������̬��ִֻ��һ�Σ�����Ҫÿ�ζ���ȡ�����Ϣ
	static{
		//���������ļ�����
		Properties prop = new Properties();
		// ��ȡ�ļ���������  ��������������ļ����õ��ļ���
		InputStream ips = 
			DBUtils.class.getClassLoader()
			  .getResourceAsStream("jdbc.properties");
		// ���ļ����ص�prop������
		try {
			prop.load(ips);
			// ��ȡ�������ݿ����Ϣ
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			System.out.println(driver+":"+url+":"+username+":"+password);
			
			//���ӳ�Ҳ��ֻ����һ�Σ�����ÿ������ʱ������һ�����ӳ� ������Դ����
			dataSource = new BasicDataSource();
			//�������ݿ�������Ϣ
			dataSource.setDriverClassName(driver);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			// ���ò�����Ϣ
			dataSource.setInitialSize(3);
			dataSource.setMaxActive(5);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ��װ��ȡ���Ӷ���Ĵ���
	public static Connection getConn() throws Exception{
		Connection conn = dataSource.getConnection();
		return conn;
	}
	
	// �ر���Դ
	public static void close(
			ResultSet rs, Statement stat, Connection conn){
		try{
			//�����ָ���쳣
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
