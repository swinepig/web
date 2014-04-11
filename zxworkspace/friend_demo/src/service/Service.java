package service;

import entity.User;

public interface Service {
		
	public User HandleLogin(String username,String pwd) throws Exception;
	public void HandleRegist(String username,String name,String pwd,int
			age,int sex,String phone,String number,String number2,String filepath)throws Exception;
}
