/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-08-19 15:46:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.LinkedList;

public final class cropSel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.LinkedList");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Crop Selection</title>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Bitter' rel='stylesheet' type='text/css'>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("\tbackground:#AEE4FF;\r\n");
      out.write("}\r\n");
      out.write(".form-style-10{\r\n");
      out.write("\tmax-width:85%;\r\n");
      out.write("\tpadding:30px;\r\n");
      out.write("\tmargin:40px auto;\r\n");
      out.write("\tbackground: #FFF;\r\n");
      out.write("\tborder-radius: 10px;\r\n");
      out.write("\t-webkit-border-radius:10px;\r\n");
      out.write("\t-moz-border-radius: 10px;\r\n");
      out.write("\tbox-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);\r\n");
      out.write("\t-moz-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);\r\n");
      out.write("\t-webkit-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);\r\n");
      out.write("}\r\n");
      out.write(".form-style-10 .inner-wrap{\r\n");
      out.write("\tpadding: 30px;\r\n");
      out.write("\tbackground: #F8F8F8;\r\n");
      out.write("\tborder-radius: 6px;\r\n");
      out.write("\tmargin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write(".form-style-10 h1{\r\n");
      out.write("\tbackground: #2A88AD;\r\n");
      out.write("\tpadding: 20px 30px 15px 30px;\r\n");
      out.write("\tmargin: -30px -30px 30px -30px;\r\n");
      out.write("\tborder-radius: 10px 10px 0 0;\r\n");
      out.write("\t-webkit-border-radius: 10px 10px 0 0;\r\n");
      out.write("\t-moz-border-radius: 10px 10px 0 0;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\ttext-shadow: 1px 1px 3px rgba(0, 0, 0, 0.12);\r\n");
      out.write("\tfont: normal 30px 'Bitter', serif;\r\n");
      out.write("\t-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\r\n");
      out.write("\t-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\r\n");
      out.write("\tbox-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\r\n");
      out.write("\tborder: 1px solid #257C9E;\r\n");
      out.write("}\r\n");
      out.write(".form-style-10 h1 > span{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tmargin-top: 2px;\r\n");
      out.write("\tfont: 13px Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".form-style-10 label{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tfont: 13px Arial, Helvetica, sans-serif;\r\n");
      out.write("\tcolor: #888;\r\n");
      out.write("\tmargin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write(".form-style-10 input[type=\"text\"],\r\n");
      out.write(".form-style-10 input[type=\"date\"],\r\n");
      out.write(".form-style-10 input[type=\"datetime\"],\r\n");
      out.write(".form-style-10 input[type=\"email\"],\r\n");
      out.write(".form-style-10 input[type=\"number\"],\r\n");
      out.write(".form-style-10 input[type=\"search\"],\r\n");
      out.write(".form-style-10 input[type=\"time\"],\r\n");
      out.write(".form-style-10 input[type=\"url\"],\r\n");
      out.write(".form-style-10 input[type=\"password\"],\r\n");
      out.write(".form-style-10 textarea,\r\n");
      out.write(".form-style-10 select {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-moz-box-sizing: border-box;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\tborder-radius: 6px;\r\n");
      out.write("\t-webkit-border-radius:6px;\r\n");
      out.write("\t-moz-border-radius:6px;\r\n");
      out.write("\tborder: 2px solid #fff;\r\n");
      out.write("\tbox-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);\r\n");
      out.write("\t-moz-box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);\r\n");
      out.write("\t-webkit-box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);\r\n");
      out.write("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-style-10 .section{\r\n");
      out.write("\tfont: normal 20px 'Bitter', serif;\r\n");
      out.write("\tcolor: #2A88AD;\r\n");
      out.write("\tmargin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write(".form-style-10 .section span {\r\n");
      out.write("\tbackground: #2A88AD;\r\n");
      out.write("\tpadding: 5px 10px 5px 10px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tborder-radius: 50%;\r\n");
      out.write("\t-webkit-border-radius: 50%;\r\n");
      out.write("\t-moz-border-radius: 50%;\r\n");
      out.write("\tborder: 4px solid #fff;\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("\tmargin-left: -45px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tmargin-top: -3px;\r\n");
      out.write("}\r\n");
      out.write(".form-style-10 input[type=\"button\"], \r\n");
      out.write(".form-style-10 input[type=\"submit\"]{\r\n");
      out.write("\tbackground: #2A88AD;\r\n");
      out.write("\tpadding: 8px 20px 8px 20px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\t-webkit-border-radius: 5px;\r\n");
      out.write("\t-moz-border-radius: 5px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\ttext-shadow: 1px 1px 3px rgba(0, 0, 0, 0.12);\r\n");
      out.write("\tfont: normal 30px 'Bitter', serif;\r\n");
      out.write("\t-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\r\n");
      out.write("\t-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\r\n");
      out.write("\tbox-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\r\n");
      out.write("\tborder: 1px solid #257C9E;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\talign:center;\r\n");
      out.write("}\r\n");
      out.write(".form-style-10 input[type=\"button\"]:hover, \r\n");
      out.write(".form-style-10 input[type=\"submit\"]:hover{\r\n");
      out.write("\tbackground: #2A6881;\r\n");
      out.write("\t-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);\r\n");
      out.write("\t-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);\r\n");
      out.write("\tbox-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);\r\n");
      out.write("}\r\n");
      out.write(".form-style-10 .privacy-policy{\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\tfont: 12px Arial, Helvetica, sans-serif;\r\n");
      out.write("\tcolor: #4D4D4D;\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("}\r\n");
      out.write("table{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("}\r\n");
      out.write("th{\r\n");
      out.write("\talign:center;\r\n");
      out.write("}\r\n");
      out.write("td{\r\n");
      out.write("\talign:center;\r\n");
      out.write("\tpadding:10px;\r\n");
      out.write("}\r\n");
      out.write("h3 {\r\n");
      out.write("    text-shadow: 0 0 2px #00FF00;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"form-style-10\">\r\n");
      out.write("<h1>Select the crops<span>Select crops based on the season they are sowen and harvested</span></h1>\r\n");
      out.write("<form method=\"post\" action=\"RegComp\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"section\"><span>1</span>Rabi Season</div>\r\n");
      out.write("    <div class=\"inner-wrap\">\r\n");
      out.write("    <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th colspan=\"2\"><h3>CROP 1</h3></th>\r\n");
      out.write("    <th colspan=\"2\"><h3>CROP 2</h3></th>\r\n");
      out.write("    <th colspan=\"2\"><h3>CROP 3</h3></th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("        <select name=\"rcrop1\" id=\"1\" >\r\n");
      out.write("        <option value=\"0\" selected=\"selected\" required>Select CROP</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("        <select name=\"rcrop2\" id=\"2\" >\r\n");
      out.write("        <option value=\"0\" selected=\"selected\" >Select CROP</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("        <select name=\"rcrop3\" id=\"3\" >\r\n");
      out.write("        <option value=\"0\" selected=\"selected\" >Select CROP</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <th>SOW : </th>\r\n");
      out.write("        <td><select name=\"s1\" id=\"s1\">\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <th>HARV : </th>\r\n");
      out.write("        <td><select name=\"h1\" id=\"h1\">\r\n");
      out.write("   \t\t</select>\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"section\"><span>2</span>Summer Season</div>\r\n");
      out.write("    <div class=\"inner-wrap\">\r\n");
      out.write("    <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th colspan=\"2\"><h3>CROP 1</h3></th>\r\n");
      out.write("    <th colspan=\"2\"><h3>CROP 2</h3></th>\r\n");
      out.write("    <th colspan=\"2\"><h3>CROP 3</h3></th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("        <select name=\"scrop1\" id=\"7\" >\r\n");
      out.write("        <option value=\"\" selected=\"selected\" >Select CROP</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("        <select name=\"scrop2\" id=\"8\" >\r\n");
      out.write("        <option value=\"\" selected=\"selected\" >Select CROP</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("        <select name=\"scrop3\" id=\"9\" >\r\n");
      out.write("        <option value=\"\" selected=\"selected\" >Select CROP</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <th>SOW : </th>\r\n");
      out.write("        <td><select name=\"s3\" id=\"s3\">\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <th>HARV : </th>\r\n");
      out.write("        <td><select name=\"h3\" id=\"h3\">\r\n");
      out.write("   \t\t</select>\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"section\"><span>3</span>Kharif Season</div>\r\n");
      out.write("    <div class=\"inner-wrap\">\r\n");
      out.write("    <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th colspan=\"2\"><h3>CROP 1</h3></th>\r\n");
      out.write("    <th colspan=\"2\"><h3>CROP 2</h3></th>\r\n");
      out.write("    <th colspan=\"2\"><h3>CROP 3</h3></th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("        <select name=\"kcrop1\" id=\"4\" >\r\n");
      out.write("        <option value=\"\" selected=\"selected\" required>Select CROP</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("        <select name=\"kcrop2\" id=\"5\" >\r\n");
      out.write("        <option value=\"\" selected=\"selected\" >Select CROP</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("        <select name=\"kcrop3\" id=\"6\" >\r\n");
      out.write("        <option value=\"\" selected=\"selected\" >Select CROP</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        <th>SOW : </th>\r\n");
      out.write("        <td><select name=\"s2\" id=\"s2\">\r\n");
      out.write("        </select>\r\n");
      out.write("        </td>\r\n");
      out.write("        <th>HARV : </th>\r\n");
      out.write("        <td><select name=\"h2\" id=\"h2\">\r\n");
      out.write("   \t\t</select>\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<input type=\"submit\" value=\"Confirm Selection\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("window.onload = function () {\r\n");
      out.write("\tvar rcrop1 = document.getElementById(\"1\");\r\n");
      out.write("\tvar rcrop2 = document.getElementById(\"2\");\r\n");
      out.write("\tvar rcrop3 = document.getElementById(\"3\");\r\n");
      out.write("\tvar kcrop1 = document.getElementById(\"4\");\r\n");
      out.write("\tvar kcrop2 = document.getElementById(\"5\");\r\n");
      out.write("\tvar kcrop3 = document.getElementById(\"6\");\r\n");
      out.write("\tvar scrop1 = document.getElementById(\"7\");\r\n");
      out.write("\tvar scrop2 = document.getElementById(\"8\");\r\n");
      out.write("\tvar scrop3 = document.getElementById(\"9\");\r\n");
      out.write("\t\r\n");
      out.write("\tvar s1 = document.getElementById(\"s1\");\r\n");
      out.write("\tvar s2 = document.getElementById(\"s2\");\r\n");
      out.write("\tvar s3 = document.getElementById(\"s3\");\r\n");
      out.write("\r\n");
      out.write("\tvar h1 = document.getElementById(\"h1\");\r\n");
      out.write("\tvar h2 = document.getElementById(\"h2\");\r\n");
      out.write("\tvar h3 = document.getElementById(\"h3\");\r\n");
      out.write("\t\r\n");
      out.write("\t");

	ArrayList<String> ar=(ArrayList<String>)session.getAttribute("cropList");
	for(int i=1;i<=ar.size();i++)
	{
      out.write("\r\n");
      out.write("\trcrop1.options[rcrop1.options.length] =new Option(\"");
      out.print(ar.get(i-1));
      out.write('"');
      out.write(',');
      out.write('"');
      out.print(i);
      out.write("\");\r\n");
      out.write("\t");
}
	byte months[]=(byte [])session.getAttribute("months");
      out.write("\r\n");
      out.write("\tscrop1.innerHTML=scrop2.innerHTML=scrop3.innerHTML=kcrop1.innerHTML=kcrop2.innerHTML=kcrop3.innerHTML=rcrop3.innerHTML=rcrop2.innerHTML = rcrop1.innerHTML;\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"Select Month\",\"0\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"JANUARY\",\"1\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"FEBRUARY\",\"2\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"MARCH\",\"3\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"APRIL\",\"4\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"MAY\",\"5\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"JUNE\",\"6\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"JULY\",\"7\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"AUGUST\",\"8\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"SEPTEMBER\",\"9\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"OCTOBER\",\"10\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"NOVEMBER\",\"11\");\r\n");
      out.write("\ts1.options[s1.options.length] =new Option(\"DECEMBER\",\"12\");\r\n");
      out.write("\t\r\n");
      out.write("\th1.innerHTML=h2.innerHTML=h3.innerHTML=s3.innerHTML=s2.innerHTML=s1.innerHTML;\r\n");
      out.write("\ts1.selectedIndex=");
      out.print(months[0]);
      out.write(";\r\n");
      out.write("\th1.selectedIndex=");
      out.print(months[1]);
      out.write(";\r\n");
      out.write("\ts2.selectedIndex=");
      out.print(months[2]);
      out.write(";\r\n");
      out.write("\th2.selectedIndex=");
      out.print(months[3]);
      out.write(";\r\n");
      out.write("\ts3.selectedIndex=");
      out.print(months[4]);
      out.write(";\r\n");
      out.write("\th3.selectedIndex=");
      out.print(months[5]);
      out.write(";\r\n");
      out.write("\t\r\n");
      out.write("\t");

	byte b[]=(byte [])session.getAttribute("rabicombi");
	
      out.write("\r\n");
      out.write("\trcrop1.selectedIndex=");
      out.print(b[0]);
      out.write(";\r\n");
      out.write("\trcrop2.selectedIndex=");
      out.print(b[1]);
      out.write(";\r\n");
      out.write("\trcrop3.selectedIndex=");
      out.print(b[2]);
      out.write(";\r\n");
      out.write("\t\r\n");
      out.write("\t");

	b=(byte [])session.getAttribute("kharifcombi");
	
      out.write("\r\n");
      out.write("\tkcrop1.selectedIndex=");
      out.print(b[0]);
      out.write(";\r\n");
      out.write("\tkcrop2.selectedIndex=");
      out.print(b[1]);
      out.write(";\r\n");
      out.write("\tkcrop3.selectedIndex=");
      out.print(b[2]);
      out.write(";\r\n");
      out.write("\t\r\n");
      out.write("\t");

	b=(byte [])session.getAttribute("summercombi");
	
      out.write("\r\n");
      out.write("\tscrop1.selectedIndex=");
      out.print(b[0]);
      out.write(";\r\n");
      out.write("\tscrop2.selectedIndex=");
      out.print(b[1]);
      out.write(";\r\n");
      out.write("\tscrop3.selectedIndex=");
      out.print(b[2]);
      out.write(";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
