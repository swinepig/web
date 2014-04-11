package redis.service.redisService;


import dao.UserDao;
import redis.dao.RedisDao;
import util.Factory;
import entity.User;
import exception.UserAlreadyExistException;
import exception.UserNotExistException;
import exception.YanZhenErroException;

public class RedisServiceImpl implements RedisService{

	public User HandleLogin(String username, String pwd) throws Exception {
		RedisDao dao=Factory.getRedisDao();
		User user=dao.examineByUserName(username, pwd);
		if(user==null){
			throw new UserNotExistException();
		}
		return user;
	}

	public void HandleRegist(String username, String name, String pwd, int age,
			int sex, String phone, String number, String number2,
			String filepath) throws Exception {

		if(!number.equals(number2)){
			throw new YanZhenErroException();
		}
		RedisDao dao=Factory.getRedisDao();
		User user=dao.findByUserName(username);
		if(user!=null){
		throw new UserAlreadyExistException();
		}
		dao.insert(username,pwd,name, age, sex, phone,filepath);
		
	}

}
