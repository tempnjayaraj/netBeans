/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-04-05 12:11:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Roles and Permissions</title>\n");
      out.write("        <style>\n");
      out.write("            body.Admin{\n");
      out.write("                background-image: url('data:image/jpeg;base64,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');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-size: cover;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            body.Developer{\n");
      out.write("                background-image: url('https://static.vecteezy.com/system/resources/thumbnails/002/016/085/original/colorful-gradient-background-free-video.jpg');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            body.Employee{\n");
      out.write("                background-image: url('https://cdn.pixabay.com/photo/2021/08/02/22/41/background-6517956__340.jpg');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            body.User{\n");
      out.write("                background-image: url('https://img.freepik.com/free-vector/green-tones-gradient-background_23-2148376167.jpg?w=2000');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            body.External_User{\n");
      out.write("                background-image: url('data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgICggICAgHBwcHCAoHBwcHCA8ICQcKFREWFhUREx8YHSggGCYlJxMTITEhJSkrLi4uFx8zODMsNygtLisBCgoKDQ0NDw8NFSsZFRkrKy03NysrKy0tKy0tKysrKysrKystNysrKysrNysrKysrKysrKysrKysrKysrKysrK//AABEIALcBEwMBIgACEQEDEQH/xAAaAAEBAQADAQAAAAAAAAAAAAAAAQIDBAUH/8QAHhABAQEBAAICAwAAAAAAAAAAAAEREgIhYXExUYH/xAAaAQEBAQEBAQEAAAAAAAAAAAABAAIDBQYE/8QAGBEBAQEBAQAAAAAAAAAAAAAAAAEREgL/2gAMAwEAAhEDEQA/APtSA/Bi0QGsOppQOHUCo1ItEVK3DoioZD1UBK3IdEVGjolKjWFUEMhDURqQyqgjeNy6qCacK6lBqQiUKcSaASJfyqEgBT00KPFx5uiBWpDqANSESiU4gEakRSojch0QK3i0EqNTydKCNcmUqGprWNghrWNAia1jUUE1Y2qGhxJQCQoIoKiIAU9JAeTjydNSgcMogVrldJQRueT0ItQ4pRBK3I1olVlqeTqpTUbkKUKjUjULUTRrHSABbkQAtyAgiAIgCQIqKAIgBT0EVHnY8ToKIWtVNEOHQoEpQRqRCFG5DqIqNxqVKCUyNxEBrHTygULoIom5UALSCoiAIgFRQBEASACnfCj8LwhAR0BDi0qFDIZRFRuQ6lKFaaZqVan7LUEoVqOsZKoW4iKF1lQBEATcqComhFCkAREURQURQBJ3jSj8j58BKiAhwlAakOoAShQpjUrNRULp5QoUusRFFrcQVFrcAFraCi0yoGC1vRKodKCh1M4LgtKC4mHSB7Fpd0CPz4+fEoHEgUJAEUBKSFCkxlFZqdvKpViJ1EqpU1ABNyoKJtAVaUDDE1ABNagoigqYtR6RcFpQUWl2gGXz+iKiJoBQAigFJQtEqakRBE7eVQpU6wRRFAA1AAukAA0AJAGJrQMMGtCKLSguItSYqhLsAB86JVQtwAREVKkJVZtLS38MVbUTp5iConWAAbAE0IomogoNaiGKDWkUUa0goNSC4YNalQxRa1qGKKUpgodTmE010fPAampqRRnS1NLqams2lqRrUTUtTc8qiaJ0kDQDpABNCpFZ0gA0gehnSAJuVQARQBMBUUFwwaZUGs+Uw61qC4LVq2p19OPpL5P08vE5cmm/Lj6Ojy1PLel8tcfSWrGp5b1LWdNjLcjemsbDU3I0M6ugyKamgrcVWVFpUgMaVEUEBYtKYouDUi4NSDWpWVi4DWtTDGpCRno6g1/FwdJjFa5XIOkzg1kF0nn9nYPTefJDs7BEvkTyBE6OgZrUXTQYrUX2aAK6SgKWtAc6VlUBURYARFBkquIArFwGalkXAZK4YDNK4uIMW0rIvP0gtpXPpAZ1P//Z');\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" onload=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("()\">\n");
      out.write("        <p align=\"right\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b>|");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("<br>\n");
      out.write("            <a href = \"/dbvalidate\">Logout</a></p>\n");
      out.write("    <center>   \n");
      out.write("        <h1>Welcome Dear ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" </h1>\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("        <br><br><br>\n");
      out.write("        \n");
      out.write("        <button id=\"create\" onclick=\"allowCreate()\">Create</button><br><br>\n");
      out.write("        <button id=\"save\" onclick=\"allowSave()\">Save</button><br><br>\n");
      out.write("        <button id=\"submit\"onclick=\"allowSubmit()\">Submit</button><br><br>\n");
      out.write("        <button id=\"approve\" onclick=\"allowApprove()\">Approve</button><br><br>\n");
      out.write("        <button id=\"authorize\" onclick=\"allowAuthorize()\">Authorize</button><br><br>\n");
      out.write("        \n");
      out.write("        <font color=\"green\"> <p id=\"comment\"></p></font>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        \n");
      out.write("        function allowCreate() {\n");
      out.write("            document.getElementById(\"comment\").innerHTML = 'Record created';\n");
      out.write("        }\n");
      out.write("        function allowSave() {\n");
      out.write("            document.getElementById(\"comment\").innerHTML = 'Record Saved';\n");
      out.write("        }\n");
      out.write("        function allowSubmit() {\n");
      out.write("            document.getElementById(\"comment\").innerHTML = 'Record submitted';\n");
      out.write("        }\n");
      out.write("        function allowApprove() {\n");
      out.write("            document.getElementById(\"comment\").innerHTML = 'Record Approved';\n");
      out.write("        }\n");
      out.write("        function allowAuthorize() {\n");
      out.write("            document.getElementById(\"comment\").innerHTML = 'Record Authorized';\n");
      out.write("        }\n");
      out.write("        function Developer(){\n");
      out.write("            document.getElementById(\"authorize\").style.visibility = 'hidden';\n");
      out.write("        }\n");
      out.write("        function Employee(){\n");
      out.write("            document.getElementById(\"authorize\").style.visibility = 'hidden';\n");
      out.write("            document.getElementById(\"approve\").style.visibility = 'hidden';\n");
      out.write("        }\n");
      out.write("        function User(){\n");
      out.write("            document.getElementById(\"authorize\").style.visibility = 'hidden';\n");
      out.write("            document.getElementById(\"approve\").style.visibility = 'hidden';\n");
      out.write("            document.getElementById(\"submit\").style.visibility = 'hidden';\n");
      out.write("        }\n");
      out.write("        function External_User(){\n");
      out.write("            document.getElementById(\"authorize\").style.visibility = 'hidden';\n");
      out.write("            document.getElementById(\"approve\").style.visibility = 'hidden';\n");
      out.write("            document.getElementById(\"submit\").style.visibility = 'hidden';\n");
      out.write("            document.getElementById(\"save\").style.visibility = 'hidden';\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}