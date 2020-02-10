/**
 * 
 */
package springAOP;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.hibernate.hql.ast.SqlASTFactory;



import test.Product;
import util.DBUtils;

/**
 * @author mauds
 *
 */
public class ProformanceService {
	
	public void doSomeService() {
		Product product = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtils.getConn();
			String sql = "select * from product_ where name=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "kaka4");
			rs = ps.executeQuery();
			
			if (rs.next()) {
				product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
			}
			System.out.println(product.getId());
			System.out.println(product.getName());
			for (float i = 0; i < 1000; i+= 1) {
				
			}
			System.out.println("kaka!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
