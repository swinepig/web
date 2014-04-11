<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<link
			href="http://hi.bdimg.com/static/qbase/css/qbase_datauri.css?v=c2391e47.css"
			type=text/css rel=stylesheet>
		<link rel=stylesheet type=text/css
			href="http://hi.bdimg.com/static/qcomment/css/qcomment_datauri.css?v=a90beb01.css">
		<link rel=stylesheet type=text/css
			href="http://hi.bdimg.com/static/qhome/css/common/mod_userInfo.css?v=86bf4259.css">
		<link type=text/css rel=stylesheet
			href="http://hi.bdimg.com/static/qhome/css/detail/30001/detail_datauri.css?v=7acc6542.css">
		<link rel=stylesheet type=text/css
			href="http://hi.bdimg.com/static/qpublish/css/editor/shCoreDefault.css?v=79e715f0.css">
	</head>

	<body>
		This is my JSP page.
		<br>
		<div id="content" class="content mod-cs-content text-content clearfix">
			<div>
				<div class="syntaxhighlighter  java">
					<table border="0" cellpadding="0" cellspacing="0">
						<tbody>
							<tr>
								<td class="gutter">
									<div class="line number1 index0 alt2">
										1
									</div>
									<div class="line number2 index1 alt1">
										2
									</div>
									<div class="line number3 index2 alt2">
										3
									</div>
									<div class="line number4 index3 alt1">
										4
									</div>
									<div class="line number5 index4 alt2">
										5
									</div>
									<div class="line number6 index5 alt1">
										6
									</div>
									<div class="line number7 index6 alt2">
										7
									</div>
									<div class="line number8 index7 alt1">
										8
									</div>
									<div class="line number9 index8 alt2">
										9
									</div>
									<div class="line number10 index9 alt1">
										10
									</div>
									<div class="line number11 index10 alt2">
										11
									</div>
									<div class="line number12 index11 alt1">
										12
									</div>
									<div class="line number13 index12 alt2">
										13
									</div>
									<div class="line number14 index13 alt1">
										14
									</div>
									<div class="line number15 index14 alt2">
										15
									</div>
									<div class="line number16 index15 alt1">
										16
									</div>
									<div class="line number17 index16 alt2">
										17
									</div>
								</td>
								<td class="code">
									<div class="container">
										<div class="line number1 index0 alt2">
											<code>
												package
											</code>
											<code>
												test._20131111;
											</code>
										</div>
										<div class="line number2 index1 alt1">
											&nbsp;
										</div>
										<div class="line number3 index2 alt2">
											<code>
												import
											</code>
											<code>
												org.junit.Test;
											</code>
										</div>
										<div class="line number4 index3 alt1">
											&nbsp;
										</div>
										<div class="line number5 index4 alt2">
											<code>
												public
											</code>
											<code>
												class
											</code>
											<code>
												TestIPAddress {
											</code>
										</div>
										<div class="line number6 index5 alt1">
											<code>
												@Test
											</code>
										</div>
										<div class="line number7 index6 alt2">
											<code>
												public
											</code>
											<code>
												void
											</code>
											<code>
												test1(){
											</code>
										</div>
										<div class="line number8 index7 alt1">
											<code>
												int
											</code>
											<code>
												address;
											</code>
										</div>
										<div class="line number9 index8 alt2">
											<code>
												byte
											</code>
											<code>
												[] addr = {(
											</code>
											<code>
												byte
											</code>
											<code>
												)
											</code>
											<code>
												151
											</code>
											<code>
												,(
											</code>
											<code>
												byte
											</code>
											<code>
												)
											</code>
											<code>
												222
											</code>
											<code>
												,(
											</code>
											<code>
												byte
											</code>
											<code>
												)
											</code>
											<code>
												2
											</code>
											<code>
												,(
											</code>
											<code>
												byte
											</code>
											<code>
												)
											</code>
											<code>
												151
											</code>
											<code>
												};
											</code>
										</div>
										<div class="line number10 index9 alt1">
											<code>
												address&nbsp; = addr[
											</code>
											<code>
												3
											</code>
											<code>
												] &amp;
											</code>
											<code>
												0xFF
											</code>
											<code>
												;
											</code>
											<code>
												//&amp; 0xFF 使得byte原来的负值变成正的，byte的取值范围是 -128～127
											</code>
										</div>
										<div class="line number11 index10 alt2">
											<code>
												address |= ((addr[
											</code>
											<code>
												2
											</code>
											<code>
												] &lt;&lt;
											</code>
											<code>
												8
											</code>
											<code>
												) &amp;
											</code>
											<code>
												0xFF00
											</code>
											<code>
												);
											</code>
										</div>
										<div class="line number12 index11 alt1">
											<code>
												address |= ((addr[
											</code>
											<code>
												1
											</code>
											<code>
												] &lt;&lt;
											</code>
											<code>
												16
											</code>
											<code>
												) &amp;
											</code>
											<code>
												0xFF0000
											</code>
											<code>
												);
											</code>
										</div>
										<div class="line number13 index12 alt2">
											<code>
												address |= ((addr[
											</code>
											<code>
												0
											</code>
											<code>
												] &lt;&lt;
											</code>
											<code>
												24
											</code>
											<code>
												) &amp;
											</code>
											<code>
												0xFF000000
											</code>
											<code>
												);
											</code>
										</div>
										<div class="line number14 index13 alt1">
											<code>
												address=
											</code>
											<code>
												0
											</code>
											<code>
												;
											</code>
										</div>
										<div class="line number15 index14 alt2">
											<code>
												}
											</code>
										</div>
										<div class="line number16 index15 alt1">
											&nbsp;
										</div>
										<div class="line number17 index16 alt2">
											<code>
												}
											</code>
										</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<p>
				<br>
			</p>
		</div>
	</body>
</html>
