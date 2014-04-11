package redis.dao.imp;

import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.Jedis;
import redis.dao.RedisDao;
import util.RedisPool;
import entity.User;

public class RedisDaoImpl implements RedisDao{

	public User findByUserName(String username) throws Exception {
		return new User();
	}

	public void insert(String username, String pwd, String name, int age,
			int gendar, String phone, String filepath) throws Exception {
		Jedis redis = RedisPool.getRedis();
		int id = redis.incr("User:Num").intValue();
		redis.set("User:"+id+":id", id+"");
		redis.set("User:"+id+":username", username);
		redis.set("User:"+id+":pwd", pwd);
		redis.set("User:"+id+":name", name);
		redis.set("User:"+id+":age", age+"");
		redis.set("User:"+id+":phone", phone);
		redis.set("User:"+id+":gendar", gendar+"");
		redis.bgsave();
		RedisPool.desroryRedis(redis);
	}

	public User examineByUserName(String username, String pwd) throws Exception {
		return new User();
	}

	public List<User> findAll() throws Exception {
		Jedis redis = RedisPool.getRedis();
		List<User> list =new ArrayList<User>();
		int num=redis.strlen("User:Num").intValue();
		User user = null;
		for (int i = 1; i <= num; i++) {
			user = new User();
			user.setAge(Integer.parseInt(redis.get("User:"+i+":age")));
			user.setId(Integer.parseInt(redis.get("User:"+i+":id")));
			user.setName(redis.get("User:"+i+":name"));
			user.setPhone(redis.get("User:"+i+":phone"));
			user.setPwd(redis.get("User:"+i+":pwd"));
			user.setUsername(redis.get("User:"+i+":username"));
			user.setSex(Integer.parseInt(redis.get("User:"+i+":gendar")));
			list.add(user);
		}
		return list;
		
	}

	public List<String> findPhoto(int userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertPhoto(int id2, String fileName, String path)
			throws Exception {
		// TODO Auto-generated method stub
	}

}
