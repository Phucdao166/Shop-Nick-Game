package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Sign Up Form by Colorlib</title>\n");
      out.write("\n");
      out.write("    <!-- Font Icon -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/nouislider/nouislider.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Main css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style1.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"main\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"signup-content\">\n");
      out.write("                <div class=\"signup-img\">\n");
      out.write("                    <img src=\"images/form-img.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"signup-img-content\">\n");
      out.write("                        <h2>Register now </h2>\n");
      out.write("                        <p>while seats are available !</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"signup-form\">\n");
      out.write("                    <form method=\"POST\" class=\"register-form\" id=\"register-form\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"first_name\" class=\"required\">First name</label>\n");
      out.write("                                    <input type=\"text\" name=\"first_name\" id=\"first_name\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"last_name\" class=\"required\">Last name</label>\n");
      out.write("                                    <input type=\"text\" name=\"last_name\" id=\"last_name\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"company\" class=\"required\">Company</label>\n");
      out.write("                                    <input type=\"text\" name=\"company\" id=\"company\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"email\" class=\"required\">Email</label>\n");
      out.write("                                    <input type=\"text\" name=\"email\" id=\"email\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"phone_number\" class=\"required\">Phone number</label>\n");
      out.write("                                    <input type=\"text\" name=\"phone_number\" id=\"phone_number\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"form-select\">\n");
      out.write("                                    <div class=\"label-flex\">\n");
      out.write("                                        <label for=\"meal_preference\">meal preference</label>\n");
      out.write("                                        <a href=\"#\" class=\"form-link\">Lunch detail</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"select-list\">\n");
      out.write("                                        <select name=\"meal_preference\" id=\"meal_preference\">\n");
      out.write("                                            <option value=\"Vegetarian\">Vegetarian</option>\n");
      out.write("                                            <option value=\"Kosher\">Kosher</option>\n");
      out.write("                                            <option value=\"Asian Vegetarian\">Asian Vegetarian</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-radio\">\n");
      out.write("                                    <div class=\"label-flex\">\n");
      out.write("                                        <label for=\"payment\">Payment Mode</label>\n");
      out.write("                                        <a href=\"#\" class=\"form-link\">Payment Detail</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-radio-group\">            \n");
      out.write("                                        <div class=\"form-radio-item\">\n");
      out.write("                                            <input type=\"radio\" name=\"payment\" id=\"cash\" checked>\n");
      out.write("                                            <label for=\"cash\">Cash</label>\n");
      out.write("                                            <span class=\"check\"></span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-radio-item\">\n");
      out.write("                                            <input type=\"radio\" name=\"payment\" id=\"cheque\">\n");
      out.write("                                            <label for=\"cheque\">Cheque</label>\n");
      out.write("                                            <span class=\"check\"></span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-radio-item\">\n");
      out.write("                                            <input type=\"radio\" name=\"payment\" id=\"demand\">\n");
      out.write("                                            <label for=\"demand\">Demand Draf</label>\n");
      out.write("                                            <span class=\"check\"></span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"chequeno\">DD / Cheque No.</label>\n");
      out.write("                                    <input type=\"text\" name=\"chequeno\" id=\"chequeno\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"blank_name\">Drawn on ( Bank Name)</label>\n");
      out.write("                                    <input type=\"text\" name=\"blank_name\" id=\"blank_name\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-input\">\n");
      out.write("                                    <label for=\"payable\">Payable at</label>\n");
      out.write("                                    <input type=\"text\" name=\"payable\" id=\"payable\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"donate-us\">\n");
      out.write("                            <label>Donate us</label>\n");
      out.write("                            <div class=\"price_slider ui-slider ui-slider-horizontal\">\n");
      out.write("                                <div id=\"slider-margin\"></div>\n");
      out.write("                                <span class=\"donate-value\" id=\"value-lower\"></span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-submit\">\n");
      out.write("                            <input type=\"submit\" value=\"Submit\" class=\"submit\" id=\"submit\" name=\"submit\" />\n");
      out.write("                            <input type=\"submit\" value=\"Reset\" class=\"submit\" id=\"reset\" name=\"reset\" />\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
