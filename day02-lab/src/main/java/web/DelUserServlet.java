package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DelUserServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtils.getConn();
			String sql = "delete from t_user where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(id));
			ps.executeUpdate();
			
			response.sendRedirect("list");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			out.print("系统繁忙，请稍后再试");
		}finally {
			DBUtils.close(rs, ps, conn);
		}
	}
}
