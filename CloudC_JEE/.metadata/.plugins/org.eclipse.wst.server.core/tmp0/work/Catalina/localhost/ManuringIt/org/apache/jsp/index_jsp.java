/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-08-19 15:30:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html >\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>Login Form</title>\r\n");
      out.write("  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans:600'>\r\n");
      out.write("\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"login-wrap\">\r\n");
      out.write("\t<div class=\"login-html\">\r\n");
      out.write("\t\t<input id=\"tab-1\" type=\"radio\" name=\"tab\" class=\"sign-in\" checked><label for=\"tab-1\" class=\"tab\">Sign In</label>\r\n");
      out.write("\t\t<input id=\"tab-2\" type=\"radio\" name=\"tab\" class=\"sign-up\"><label for=\"tab-2\" class=\"tab\">Sign Up</label>\r\n");
      out.write("\t\t<div class=\"login-form\">\r\n");
      out.write("\t\t<form action=\"Login\" method=\"post\">\r\n");
      out.write("\t\t\t<div class=\"sign-in-htm\">\r\n");
      out.write("\t\t\t\t<div class=\"group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"user\" class=\"label\">Username</label>\r\n");
      out.write("\t\t\t\t\t<input id=\"user\" name=\"uname\" type=\"text\" class=\"input\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"pass\" class=\"label\">Password</label>\r\n");
      out.write("\t\t\t\t\t<input id=\"pass\" name=\"psw\" type=\"password\" class=\"input\" data-type=\"password\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"group\">\r\n");
      out.write("\t\t\t\t\t<input id=\"check\" type=\"checkbox\" class=\"check\">\r\n");
      out.write("\t\t\t\t\t<label for=\"check\"><span class=\"icon\"></span> Keep me Signed in</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"group\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"button\" value=\"Sign In\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"hr\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"foot-lnk\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#forgot\">Forgot Password?</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<form action=\"UserReg\" method=\"post\">\r\n");
      out.write("\t\t\t<div class=\"sign-up-htm\">\r\n");
      out.write("\t\t\t\t<div class=\"group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"user\" class=\"label\">Username</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"user\" class=\"input\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"pass\" class=\"label\">Password</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"pass\" id=\"pass1\" class=\"input\" data-type=\"password\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"pass\" class=\"label\">Repeat Password</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" id=\"conpass\" class=\"input\" data-type=\"password\" onfocusout=\"validatePassword()\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"Auser\" class=\"label\">ADMIN USER</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"Auser\" class=\"input\" value=\"admin\" readonly>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"Apass\" class=\"label\">ADMIN PASSWORD</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"Apass\" class=\"input\" data-type=\"password\" required>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"group\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"button\" value=\"Sign Up\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"hr\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"foot-lnk\">\r\n");
      out.write("\t\t\t\t\t<label for=\"tab-1\"><a href=\"index.jsp\">Already Member?</a></label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("function validatePassword(){\r\n");
      out.write("  if($('#pass1').val() != $('#conpass').val()) {\r\n");
      out.write("\t  \tdocument.getElementById('conpass').setCustomValidity(\"Passwords Don't Match\");\r\n");
      out.write("\t\t  document.getElementById('conpass').checkValidity();\r\n");
      out.write("\t\t  $('#pass1').val(\"\");$('#conpass').val(\"\");\r\n");
      out.write("  } else {\r\n");
      out.write("\t  document.getElementById('pass1').setCustomValidity('');\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("  </script>\r\n");
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
