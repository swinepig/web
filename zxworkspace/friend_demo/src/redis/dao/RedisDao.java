package redis.dao;

import java.util.List;

import entity.User;

public interface RedisDao {
	public User findByUserName(String username) throws Exception;

	public void insert(String username, String pwd, String name, int age,
			int gendar, String phone, String filepath) throws Exception;

	public User examineByUserName(String username, String pwd) throws Exception;

	public List<User> findAll() throws Exception;

	public List<String> findPhoto(int userId) throws Exception;

	public void insertPhoto(int id2, String fileName, String path)
			throws Exception;
}
