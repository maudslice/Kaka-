package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HelloServlet {

	public DateServlet() {

	}

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		out.println(sdf.format(date));
		out.close();
	}

}
