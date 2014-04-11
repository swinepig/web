package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;

public final class y{/* userDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/photo3.jsp");
    _jspx_dependants.add("/photo.jsp");
    _jspx_dependants.add("/photo2.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>update Emp</title>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"wrap\">\n");
      out.write("\t\t\t<div id=\"top_content\">\n");
      out.write("\t\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\t<div id=\"rightheader\">\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t2009/11/20\n");
      out.write("\t\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"topheader\">\n");
      out.write("\t\t\t\t\t\t<h1 id=\"title\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Main</a>\n");
      out.write("\t\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"navigation\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t\t<p id=\"whereami\">\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\tUser Detail:\n");
      out.write("\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t<table class=\"table\">\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t姓名\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t电话\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t");
  Integer currID=(Integer)session.getAttribute("currID");
						if(currID==null){
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\t<h1>view photo</h1>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t");
}else{
						int i=Integer.parseInt(request.getParameter("id"));
						int j=(Integer)session.getAttribute("currID");
						if(i==j){
					
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("<h1>\n");
      out.write("\t\t\t\t\t\tLoad Photo:\n");
      out.write("\t\t\t\t\t</h1>\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t<form action=\"load?id2=");
      out.print(Integer.parseInt(request.getParameter("id")));
      out.write("\" method=\"post\"\n");
      out.write("\t\t\t\t\t\t\tenctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t\t\t\tUpload File Name:\n");
      out.write("\t\t\t\t\t\t\t<input type=\"file\" name=\"file1\" />\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"confirm\" />\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\t\tview photo:\n");
      out.write("\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t");

					//List filelist=(List)request.getAttribute("filelist");
					 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"upload/petty2.jpg\" width=\"300\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theight=\"200\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
}else{ 
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\t<h1>\r\n");
      out.write("\t\t\t\t\t\tview photo:\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"upload/t1.jpg\" width=\"300\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theight=\"200\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<a href=\"userList.jsp\">return</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"footer\">\n");
      out.write("\t\t\t\t<div id=\"footer_bg\">\n");
      out.write("\t\t\t\t\tABC@126.com\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }*/
}
