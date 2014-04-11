package util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class CookieUtil {

	private static int default_MaxAge = 31536000;
	private static String default_Path = "/shoppingcart2";

	public static void saveCookie(String name, String value,
			HttpServletResponse response, int maxAge) throws Exception {
		default_MaxAge = maxAge;
		saveCookie(name, value, response);

	}

	public static void saveCookie(String name, String value,
			HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		String value2 = URLEncoder.encode(value, "utf-8");
		Cookie cookie = new Cookie(name, value2);
		cookie.setMaxAge(6000);
		System.out.println("保存Cookie");
		cookie.setPath(default_Path);
		response.addCookie(cookie);
	}

	public static String getCookie(String name, HttpServletRequest request)
			throws UnsupportedEncodingException {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals(name)) {
					String value = cookies[i].getValue();
					String value2 = URLDecoder.decode(value, "utf-8");
					return value2;
				}
			}
		}
		return null;
	}

	public static void deleteCookie(String name, HttpServletResponse response) {
		Cookie cookie = new Cookie(name, "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}
}
