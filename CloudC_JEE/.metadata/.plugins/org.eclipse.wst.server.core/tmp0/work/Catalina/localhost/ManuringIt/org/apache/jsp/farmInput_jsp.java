/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-08-19 15:49:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.RequestDispatcher;
import java.util.ArrayList;

public final class farmInput_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.servlet.RequestDispatcher");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <html>\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("            <link href=\"css/tabs.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("            <link href=\"css/table.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("            <style>\r\n");
      out.write("                @import url(https://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100);\r\n");
      out.write("                body {\r\n");
      out.write("                    background-color: #3e94ec;\r\n");
      out.write("                    font-family: \"Roboto\", helvetica, arial, sans-serif;\r\n");
      out.write("                    font-size: 16px;\r\n");
      out.write("                    font-weight: 400;\r\n");
      out.write("                    text-rendering: optimizeLegibility;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            </style>\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("\r\n");
      out.write("            <body>\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header_menu.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("m", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("4", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("                ");
ArrayList<String> state=(ArrayList<String>)request.getAttribute("stateList"); 
      out.write("\r\n");
      out.write("                <ul id=\"tabs\">\r\n");
      out.write("                ");
 for(String s:state) {
      out.write("\r\n");
      out.write("                    <li><a href=\"#\" name='");
      out.print(s);
      out.write('\'');
      out.write('>');
      out.print(s);
      out.write("</a></li>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    \r\n");
      out.write("                <div id=\"content\">\r\n");
      out.write("                    <div id=\"default\">\r\n");
      out.write("                        <table class=\"table-fill\" >\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>CustomerID</th>\r\n");
      out.write("                                    <th>Name</th>\r\n");
      out.write("                                    <th>Phone</th>\r\n");
      out.write("                                    <th>Wt of Pesticide</th>\r\n");
      out.write("                                    <th>Type of Fertilizer</th>\r\n");
      out.write("                                    <th>Wt of Fertilizer</th>\r\n");
      out.write("                                    <th>Wt of Manure</th>\r\n");
      out.write("                                    <th>Type Of Tools</th>\r\n");
      out.write("                                    <th>Sowing</th>\r\n");
      out.write("                                    <th>Harvesting</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody class=\"table-hover\" id=\"tableID\">\r\n");
      out.write("                            ");

                    	ArrayList<String []> ar=(ArrayList<String []>)(request.getAttribute("list"));
                    	if(ar!=null){
                    	for(String[] x:ar){
                    		out.println("<tr>");
                    		for(String y:x)
                    			out.print("<td>"+y+"</td>");
                    		out.println("</tr>");
                    	}
                    	}
                    
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <script src=\"http://code.jquery.com/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("                <script>\r\n");
      out.write("                    $(document).ready(function() {\r\n");
      out.write("                        var x = \"");
      out.print(request.getAttribute("state"));
      out.write("\";\r\n");
      out.write("                        $(\"#content #default\").fadeIn(); // Show first tab's content\r\n");
      out.write("                        \r\n");
      out.write("                        $('#tabs a').click(function(e) {\r\n");
      out.write("                        \tif($(this).attr('name').toString()===x.toString()) //detection for current tab\r\n");
      out.write("                            \treturn;\r\n");
      out.write("                            else\r\n");
      out.write("                            \tstate($(this).attr('name'));\r\n");
      out.write("                        });\r\n");
      out.write("                        \r\n");
      out.write("                        $(\"#tableID\").delegate('tr', 'click', function() {\r\n");
      out.write("                       \t\tvar cid=$(this).find('td:eq(0)').text();\r\n");
      out.write("                       \t\tvar form = document.createElement(\"form\");\r\n");
      out.write("                       \t\tvar element1 = document.createElement(\"input\"); \r\n");
      out.write("\r\n");
      out.write("                            form.method = \"POST\";\r\n");
      out.write("                            form.action = \"CustInfo\";   \r\n");
      out.write("\r\n");
      out.write("                            element1.value=cid;\r\n");
      out.write("                            element1.name=\"cid\";\r\n");
      out.write("                            element1.type=\"hidden\";\r\n");
      out.write("                            form.appendChild(element1);  \r\n");
      out.write("\r\n");
      out.write("                            document.body.appendChild(form);\r\n");
      out.write("\r\n");
      out.write("                            form.submit();\r\n");
      out.write("                       });\r\n");
      out.write("                    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    function state(a) {\r\n");
      out.write("                        var form = document.createElement(\"form\");\r\n");
      out.write("                        var element1 = document.createElement(\"input\");\r\n");
      out.write("\r\n");
      out.write("                        form.method = \"POST\";\r\n");
      out.write("                        form.action = \"FarmInput\";\r\n");
      out.write("\r\n");
      out.write("                        element1.value = a.toString();\r\n");
      out.write("                        element1.name = \"state\";\r\n");
      out.write("                        element1.type=\"hidden\";\r\n");
      out.write("                        form.appendChild(element1);\r\n");
      out.write("                        document.body.appendChild(form);\r\n");
      out.write("                        form.submit();\r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
