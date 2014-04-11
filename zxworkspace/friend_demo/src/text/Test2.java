package text;

import java.util.List;

import dao.UserDao;
import dao.impl.UserDaoImpl;

public class Test2 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		UserDao dao = new UserDaoImpl();
		List<String>list=dao.findPhoto(2);
		System.out.println(list.get(0));
	}

}
