<%@ page language="java" import="dao.impl.*,dao.*,java.util.*" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>
						Load Photo:
					</h1>
	
						<form action="load?id2=${param.id }&name2=${param.username }&phone2=${param.phone }" method="post"
							enctype="multipart/form-data">
							Upload File Name:
							<input type="file" name="file1" />
							<input type="submit" value="confirm" />
						</form>

					<h1>
						view photo:
					</h1>
					<table>
					<%
						UserDao dao = new UserDaoImpl();
						List<String>list=dao.findPhoto(Integer.parseInt(request.getParameter("id")));
						for(int k=0;k<list.size();k++){
							String fileName =list.get(k);
							String fileName2 = fileName.substring(fileName.lastIndexOf("\\") + 1);
							System.out.println("FileName"+fileName);
					 %>
								<tr>
									<td>
										<img src="upload/pic_<%=Integer.parseInt(request.getParameter("id")) %>/<%=fileName2 %>"width="300"
											height="200" />
									</td>
								</tr>
						<%} %>
					</table>

