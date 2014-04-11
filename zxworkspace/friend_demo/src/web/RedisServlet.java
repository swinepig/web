package web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Service;
import util.Factory;
import entity.User;
import exception.UserAlreadyExistException;
import exception.UserNotExistException;
import exception.YanZhenErroException;

/***
 * 
 * @author zhuxin
 *
 */
public class RedisServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5918571863860837537L;

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = request.getRequestURI();
		String path = url.substring(url.lastIndexOf("/"), url.lastIndexOf("."));
		System.out.println(path);
		int sex;

		/**
		 * 
		 * 处理登录请求http://localhost:8080/friend_demo/userDetail.jsp?id=1&username=
		 * rerer&phone=23232323
		 * */
		if (path.equals("/login")) {
			String username = request.getParameter("username");
			String pwd = request.getParameter("pwd");
			Service service = Factory.getRedisService();
			try {
				User user = service.HandleLogin(username, pwd);
				HttpSession session = request.getSession();
				session.setAttribute("currID", user.getId());
				response.sendRedirect("userList.jsp");
			} catch (Exception e) {
				if (e instanceof UserNotExistException) {
					request.setAttribute("login_err", "用户名或密码有误，请重新输入");
					request.getRequestDispatcher("login.jsp").forward(request,
							response);
				}
			}
		}
		/**
		 * 
		 * 处理注册请求
		 * */
		else if (path.equals("/regist")) {
			ServletContext sctx = getServletContext();
			String filepath = sctx.getRealPath("/upload");
			System.out.println("实例的物理路径:" + filepath);
			String username = request.getParameter("username");
			String name = request.getParameter("name");
			String pwd = request.getParameter("pwd");
			int age = Integer.parseInt(request.getParameter("age"));
			String sexxx = request.getParameter("sex");
			if (sexxx.equals("m")) {
				sex = 1;
			} else {
				sex = 0;
			}
			String phone = request.getParameter("phone");
			String number = request.getParameter("number");
			HttpSession session = request.getSession();
			String number2 = (String) session.getAttribute("number2");
			Service service = Factory.getRedisService();
			try {
				service.HandleRegist(username, name, pwd, age, sex, phone,
						number, number2, filepath);
				response.sendRedirect("login.jsp");
			} catch (Exception e) {
				if (e instanceof UserAlreadyExistException) {
					request.setAttribute("regist_err", "用户名已近存在");
				}
				if (e instanceof YanZhenErroException) {
					request.setAttribute("yanzhen_err", "验证码错误");
				}
				request.getRequestDispatcher("regist.jsp").forward(request,
						response);
			}
		}

	}

}
