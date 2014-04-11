package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil;
import util.CreateFile;
import dao.UserDao;
import entity.User;

public class UserDaoImpl implements UserDao{

	public User findByUserName(String username) throws Exception {
		Connection conn=DBUtil.getConnection();
		String sql="select * from friend_user where username=\'"+username+"\'";
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);
		if(rst.next()){
			User user = new User();
			user.setId(rst.getInt("id"));
			user.setUsername(rst.getString("username"));
			user.setName(rst.getString("name"));
			user.setAge(rst.getInt("age"));
			user.setPhone(rst.getString("phone"));
			user.setPwd(rst.getString("password"));
			user.setSex(rst.getInt("gendar"));
			return user;
		}
		return null;
	}

	
	public void insert(String username,String pwd, String name, int age, int gendar,
			String phone,String filepath) throws Exception {
		int id=-1;
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			PreparedStatement pre = conn.prepareStatement("insert into friend_user(username,password," +
					"name,age,gendar,phone) values(?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			pre.setString(1,username);
			pre.setString(2,pwd);
			pre.setString(3,name);
			pre.setInt(4,age);
			pre.setInt(5, gendar);
			pre.setString(6, phone);
			pre.executeUpdate();
			ResultSet rst = pre.getGeneratedKeys();
			if(rst.next()){
				id = rst.getInt(1);
			}
			CreateFile.CreateFiles(filepath,id);//创建文件
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(conn);
		}
		
	}


	public User examineByUserName(String username, String pwd) throws Exception {
		System.out.println("examineByUserName");
			Connection conn=null;
			conn =DBUtil.getConnection();
			String sql="select * from friend_user";
			Statement stm=conn.createStatement();
			ResultSet rst=stm.executeQuery(sql);
			while(rst.next()){
				if(username.equals(rst.getString("username"))&& pwd.equals(rst.getString("password"))){
					User user=new User();
					user.setId(rst.getInt("id"));
					user.setUsername(rst.getString("username"));
					user.setName(rst.getString("name"));
					user.setAge(rst.getInt("age"));
					user.setPhone(rst.getString("phone"));
					user.setPwd(rst.getString("password"));
					user.setSex(rst.getInt("gendar"));
					return user;
				}
			}
		return null;
	}


	public List<User> findAll() throws Exception {
		Connection conn=null;
		List<User> list =new ArrayList<User>();
		conn =DBUtil.getConnection();
		String sql="select * from friend_user";
		Statement stm=conn.createStatement();
		ResultSet rst=stm.executeQuery(sql);
			while(rst.next()){
				User user=new User();
				user.setId(rst.getInt("id"));
				user.setUsername(rst.getString("username"));
				user.setName(rst.getString("name"));
				user.setAge(rst.getInt("age"));
				user.setPhone(rst.getString("phone"));
				user.setPwd(rst.getString("password"));
				user.setSex(rst.getInt("gendar"));
				list.add(user);
		}
			return list;
	}


	public void insertPhoto(int id2, String fileName,String path) throws Exception {
		// TODO Auto-generated method stub
		List<String>list =new ArrayList<String>();
		Connection conn =DBUtil.getConnection();
		PreparedStatement pre = conn.prepareStatement("insert into friend_pic(picName,userId)values(?,?)");
		pre.setString(1, fileName);
		pre.setInt(2, id2);
		pre.executeUpdate();
	}


	public List<String> findPhoto(int userId) throws Exception {
		List<String>list =new ArrayList<String>();
		Connection conn =DBUtil.getConnection();
		String sql="select picName from friend_pic where userId="+userId+"";
		Statement stm=conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		while(rst.next()){
			String s=rst.getString(1);
			list.add(s);
		}
		return list;
	}

}
