package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Add Products</title>\n");
      out.write("\n");
      out.write("    <!-- Font Icon -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/nouislider/nouislider.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Main css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style1.css\">\n");
      out.write("    \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        img {\n");
      out.write("            max-width: 100%;\n");
      out.write("            height: 701px;\n");
      out.write("            margin: 201px 11px;\n");
      out.write("        }\n");
      out.write("        .signup-img {\n");
      out.write("            width: 350px;\n");
      out.write("            float: left;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .signup-form {\n");
      out.write("            width: 650px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .container {\n");
      out.write("            width: 100%;\n");
      out.write("            margin: 10px auto;\n");
      out.write("        }\n");
      out.write("        .register-form {\n");
      out.write("            padding: 10px 16px;\n");
      out.write("        }\n");
      out.write("        .form-row {\n");
      out.write("             margin: 0 0px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .form-row .form-group {\n");
      out.write("            width: 93%;\n");
      out.write("            padding: 0 34px;\n");
      out.write("        }\n");
      out.write("        .form-submit {\n");
      out.write("            width: 15%;\n");
      out.write("            margin-top: 29px;\n");
      out.write("            margin-left: 560px;\n");
      out.write("            margin-bottom: 24px;\n");
      out.write("        }\n");
      out.write("        display-flex, .signup-content, .form-row, .label-flex, .form-radio-group {\n");
      out.write("           display: flow-root;\n");
      out.write("        }\n");
      out.write("        h3{\n");
      out.write("            color: red;\n");
      out.write("            font-size: 34px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .bt {\n");
      out.write("            background-color: grey;\n");
      out.write("            font-size: 19px;\n");
      out.write("            color: cyan;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"main\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"signup-content\">      \n");
      out.write("                    <form action=\"add\" method=\"post\" class=\"register-form\" id=\"register-form\">\n");
      out.write("                        <h3 class=\"modal-title\">Edit Nickgame</h3>\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label class=\"required\">Planet</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.planet}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label class=\"required\">Image</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label class=\"required\">Price</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.money}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  type=\"text\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label class=\"required\">Power</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.power}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label class=\"required\">Intrinsic</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.intrinsic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label class=\"required\">Disciple</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.disciple}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label class=\"required\">LevelSkill</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.skill}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                     <label class=\"required\">Detail image</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.dimage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label class=\"required\">Description</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                   <label class=\"required\">Sever</label>\n");
      out.write("                                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.sever}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\">     \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"form-submit\">\n");
      out.write("                            <input type=\"submit\" value=\"Edit\" class=\"submit\" id=\"submit\" name=\"submit\" />                      \n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"home\"><button type=\"button\" class=\"bt\">Back to home</button></a>\n");
      out.write("                    </form>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- JS -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/nouislider/nouislider.min.js\"></script>\n");
      out.write("    <script src=\"vendor/wnumb/wNumb.js\"></script>\n");
      out.write("    <script src=\"vendor/jquery-validation/dist/jquery.validate.min.js\"></script>\n");
      out.write("    <script src=\"vendor/jquery-validation/dist/additional-methods.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
