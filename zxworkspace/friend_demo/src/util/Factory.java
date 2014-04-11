package util;
import redis.dao.RedisDao;
import redis.dao.imp.RedisDaoImpl;
import redis.service.redisService.RedisServiceImpl;
import service.Service;
import service.impl.ServiceImpl;
import dao.UserDao;
import dao.impl.UserDaoImpl;

public class Factory {
		public static  UserDao newUserInstance(){
			 UserDao dao =new UserDaoImpl();
			 return dao;
		}
		
		public static  Service newServiceInstance(){
			Service service =new ServiceImpl();
			 return service;
		}
		
		public static  Service getRedisService(){
			Service service =new RedisServiceImpl();
			 return service;
		}
		
		public static  RedisDao getRedisDao(){
			RedisDao dao =new RedisDaoImpl();
			 return dao;
		}
}
