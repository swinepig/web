package service.impl;


import service.Service;
import util.Factory;
import dao.UserDao;
import entity.User;
import exception.UserAlreadyExistException;
import exception.UserNotExistException;
import exception.YanZhenErroException;
public class ServiceImpl implements Service{

	
	public User HandleLogin(String username, String pwd) throws Exception {
		System.out.println("HandleLogin");
		UserDao dao =Factory.newUserInstance();
		User user=dao.examineByUserName(username, pwd);
		if(user==null){
			throw new UserNotExistException();
		}
		return user;
	}

	public void HandleRegist(String username, String name, String pwd, int age,int sex, String phone, String number,String number2,String filepath) throws Exception {
		
			if(!number.equals(number2)){
				throw new YanZhenErroException();
			}
			UserDao dao =Factory.newUserInstance();
			User user=dao.findByUserName(username);
			if(user!=null){
			throw new UserAlreadyExistException();
			}
			dao.insert(username,pwd,name, age, sex, phone,filepath);
		
	}
		
}
