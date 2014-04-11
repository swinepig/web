package util;

import java.io.File;
import java.util.Date;

public class CreateFile {

	public static void CreateFiles(String filepath,int id) {
		File f=null;
		File f2=null;
		 //f = new File(filepath+"/pic_"+id);
		 //f = new File("./WebRoot/upload/pic_"+id);
		f = new File("/home/nlin/workspace/friend_demo/WebRoot/upload/pic_"+id);
		f.mkdir();
		//f2= new File("C:\\Users\\zhuxin\\Workspaces\\MyEclipse 8.6\\friend_demo\\.\\WebRoot\\upload\\pic_"+id);
		//f2.mkdir();
		System.out.println(f.getAbsolutePath());
		System.out.println("创建文件pic_"+id);
	}
	

}
