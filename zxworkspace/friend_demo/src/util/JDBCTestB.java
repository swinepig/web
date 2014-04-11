package util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class JDBCTestB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Connection conn=null;
			PreparedStatement pstm =null;
			
			try {
				//conn =JDBCUtil.getConnection("MYSQL");
				Class.forName("com.mysql.jdbc.Driver");
				conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zhuxin", "root", "root");
				pstm =conn.prepareStatement("insert into computer(model,picName,prodDesc,price)"+
					"values(?,?,?,?)");  //预编译
				for(int i=0;i<6;i++){
					pstm.setString(1, "x20"+i);
					pstm.setString(2, "img/d007/x"+i+"00.jpg");
					pstm.setString(3, "黑色和红色，已经成为ThinkPad的经典");
					pstm.setDouble(4, 7000+20*i);
					pstm.executeUpdate();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(pstm!=null){
					try {
						pstm.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(conn!=null){
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
			

	}

}
