package test;

import java.io.UnsupportedEncodingException;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import net.minidev.json.parser.ParseException;
import entity.User;


public class TestJsonSmart {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws ParseException, UnsupportedEncodingException {
		// TODO Auto-generated 
		User user = new User();
		user.setId(2);//使用User:Num作为用户数量的key
		user.setUsername("2");
		user.setName("2");
		user.setAge(2);
		user.setPhone("2");
		user.setPwd("2");
		user.setSex(2);
		String s=JSONValue.toJSONString((Object)user);
		Object u=JSONValue.parseStrict(new String(s.getBytes(),"UTF-8"));
		System.out.println(u);
	}

}
