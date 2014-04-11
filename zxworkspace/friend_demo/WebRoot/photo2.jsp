	<%@ page language="java" import="dao.impl.*,dao.*,java.util.*" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
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

