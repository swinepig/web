package text;

import java.sql.*;

//import util.DBUtil;
//import dao.UserDao;
//import entity.User;

public class UserDaoJdbcImpl{ //implements UserDao {

	/*public long save(User user) throws Exception {
		long id = -1;
		Connection conn = 
			DBUtil.getConnection();
		PreparedStatement prep = 
			conn.prepareStatement(
					"insert into t_user(username,name,password,sex) values(?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
		prep.setString(1, user.getUsername());
		prep.setString(2, user.getName());
		prep.setString(3, user.getPassword());
		prep.setString(4, user.getSex());
		prep.executeUpdate();
		ResultSet rst = prep.getGeneratedKeys();
		if(rst.next()){
			id = rst.getLong(1);
		}
		DBUtil.close(conn);
		return id;

	}

	public User findByUsername(String username) throws Exception {
		Connection conn = 
			DBUtil.getConnection();
		String sql = "select * from t_user where username=?";
		PreparedStatement prep = 
			conn.prepareStatement(sql);
		prep.setString(1, username);
		ResultSet rst = 
			prep.executeQuery();
		User user = null;
		if(rst.next()){
			user = new User();
			user.setId(rst.getLong("id"));
			user.setUsername(username);
			user.setPassword(rst.getString("password"));
			user.setSex(rst.getString("sex"));
			user.setName(rst.getString("name"));
		}
		return user;
	}*/

}
