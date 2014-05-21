package com.zx.domain.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

public class UserAction implements SessionAware, ApplicationAware {

	private String UserName;

	private String Password;

	public UserAction() {
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@SuppressWarnings("unchecked")
	public String logOut() {

		Integer count = (Integer) application.get("count");
		if (count == null || count.intValue() <= 1) {
			count = 0;
		} else {
			count--;
		}
		
		
		//设置session失效
		if(session instanceof SessionMap){
			SessionMap sm=(SessionMap)session;
			sm.invalidate();
		}
		
		session.remove("UserName");
		session.remove("Password");
		application.put("count", count);

		return "logout-success";
	}

	/***
	 * 登录执行
	 * 
	 * @return
	 */
	public String execute() {

		// 把用户信息存入Session
		// 1.获取Sessin，通过SessionAware获得

		// 2.获取登录信息

		// 3.存入session中
		session.put("UserName", UserName);
		session.put("Password", Password);

		// 在线人数+1
		Integer count = (Integer) application.get("count");
		if (count == null) {
			count = 0;
		}
		count++;
		application.put("count", count);

		return "login-success";
	}

	@Override
	public String toString() {
		return "UserName:" + UserName + "  Password:" + Password;
	}

	private Map<String, Object> session;

	private Map<String, Object> application;

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

}
