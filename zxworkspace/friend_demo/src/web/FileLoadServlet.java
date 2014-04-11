package web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import util.Factory;

import dao.UserDao;

public class FileLoadServlet extends HttpServlet {

		public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			int id2=Integer.parseInt(request.getParameter("id2"));
			String name2=request.getParameter("name2");
			String phone2=request.getParameter("phone2");
			//为解析器提供一个配置
			DiskFileItemFactory factory = 
			new DiskFileItemFactory();
			//创建解析器
			ServletFileUpload sfu = 
				new ServletFileUpload(factory);
			sfu.setHeaderEncoding("utf-8");
			//sfu.setFileSizeMax(1024*50);
			//开始解析,表单中的每一个表单域的数据都存放
			//到了对应的FileItem对象里。比如，有两个表单域，
			//则会有两个对应的FileItem对象。
			try {
				List<FileItem> fileItems = 
					sfu.parseRequest(request);
				for(int i=0;i<fileItems.size();i++){
					FileItem item = fileItems.get(i);
					
					//非文件上传域
					if(item.isFormField()){
						String paramName = item.getFieldName();
						String paramValue = 
							item.getString();
						System.out.println(paramName + " " + paramValue);
					}else{
						ServletContext sctx = getServletContext();
						//获得逻辑路径所对应的实例的物理路径。
						String path = sctx.getRealPath("/upload");
						System.out.println("path:" + path);
						String fileName = item.getName();
						//某些os,会返回路径
						System.out.println("fileName "+fileName );
						String fileName2 = fileName
						.substring(fileName.lastIndexOf("\\") + 1);
						System.out.println("fileName2 "+fileName2 );
//						String newPath = path.replaceAll("\\\\", "/");
//						File file = new File(newPath + "/pic_"+id2+"/"+fileName2);
//						File file = new File("D:/suncity.jpg");
						File file = new File("C:\\Users\\zhuxin\\Workspaces\\MyEclipse 8.6\\friend_demo\\.\\WebRoot\\upload\\pic_"+id2+"\\"+fileName2);
//						File file = new File("/home/nlin/workspace/friend_demo/WebRoot/upload/pic_"+id2+"/"+fileName2);
						if(!file.exists()){
							file.createNewFile();
						}
						item.write(file);
						UserDao dao=Factory.newUserInstance();
						dao.insertPhoto(id2, fileName,path);
						response.sendRedirect("userDetail.jsp?id="+id2+"&username="+name2+"&phone="+phone2);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
	}

}
