package util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
	public static void addCookie(String name, String value, int age, String path, HttpServletResponse response) throws UnsupportedEncodingException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
		
		cookie.setMaxAge(age);
		cookie.setPath(path);
		response.addCookie(cookie);
	}
	
	public static String findCookie(String name, HttpServletRequest request) throws UnsupportedEncodingException {
		String value = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for(Cookie cookie : cookies) {
				if (cookie.getName().equals(name)) {
					value = URLDecoder.decode(cookie.getValue(), "Utf-8");
				}
			}
		}
		return value;
		
	}

}
