package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("  <title>Ngoc Rong Online</title>\n");
      out.write("  <!-- Font Awesome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\">\n");
      out.write("  <!-- Bootstrap core CSS -->\n");
      out.write("  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/style.min.css\" rel=\"stylesheet\">\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("    html,\n");
      out.write("    body,\n");
      out.write("    header,\n");
      out.write("    .carousel {\n");
      out.write("      height: 60vh;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h3{\n");
      out.write("        font-weight: 900;\n");
      out.write("        font-size: 37px;\n");
      out.write("        color: red;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .lead {\n");
      out.write("    font-size: 25px;\n");
      out.write("    font-weight: 600;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    .text-warning {\n");
      out.write("    color: #335fff!important;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    img {\n");
      out.write("        vertical-align: middle;\n");
      out.write("        border-style: none;\n");
      out.write("        width: 150%;\n");
      out.write("        margin-left: 58px;\n");
      out.write("    }\n");
      out.write("    @media (max-width: 740px) {\n");
      out.write("\n");
      out.write("      html,\n");
      out.write("      body,\n");
      out.write("      header,\n");
      out.write("      .carousel {\n");
      out.write("        height: 100vh;\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    @media (min-width: 800px) and (max-width: 850px) {\n");
      out.write("\n");
      out.write("      html,\n");
      out.write("      body,\n");
      out.write("      header,\n");
      out.write("      .carousel {\n");
      out.write("        height: 100vh;\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <nav class=\"navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <!-- Brand -->\n");
      out.write("      <a class=\"navbar-brand waves-effect\" href=\"home\">\n");
      out.write("        <strong class=\"blue-text\">NRO</strong>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <!-- Collapse -->\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\n");
      out.write("        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <!-- Links -->\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("\n");
      out.write("        <!-- Left -->\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item1\">\n");
      out.write("            <a class=\"nav-link waves-effect\" href=\"home\">Home\n");
      out.write("              <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("           ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <!-- Right -->\n");
      out.write("        <ul class=\"navbar-nav nav-flex-icons\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link waves-effect\" href=\"showcart\">\n");
      out.write("                  <span class=\"badge red z-depth-1 mr-1\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("              <i class=\"fas fa-shopping-cart\"></i>\n");
      out.write("              <span class=\"clearfix d-none d-sm-inline-block\"> Cart </span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <!--Main layout-->\n");
      out.write("  <main class=\"mt-5 pt-4\">\n");
      out.write("    <div class=\"container dark-grey-text mt-5\">\n");
      out.write("\n");
      out.write("      <!--Grid row-->\n");
      out.write("      <div class=\"row wow fadeIn\">\n");
      out.write("          <div class=\"col-md-3 mb-4\">\n");
      out.write("             <h3 class=\"title mb-3\">Account ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.nickID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("          <!--Content-->\n");
      out.write("\n");
      out.write("            <p class=\"lead\">\n");
      out.write("              <span class=\"price h3 text-warning\"> \n");
      out.write("                <span class=\"currency\"></span><span class=\"num\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.money}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" VND</span>\n");
      out.write("              </span> \n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("            <p class=\"lead font-weight-bold\">Description</p>\n");
      out.write("            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("            <p>Sever: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.sever}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <p>Power: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.power}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <p>Intrinsic: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.intrinsic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("            <p>Disciple: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.disciple}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>   \n");
      out.write("            <p>Level Skill: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.skill}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \n");
      out.write("\n");
      out.write("            <form class=\"d-flex justify-content-left\">\n");
      out.write("              <!-- Default input -->\n");
      out.write("              <a href=\"showcart?nickID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.nickID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-primary btn-md my-0 p\" type=\"submit\">Add to cart\n");
      out.write("                <i class=\"fas fa-shopping-cart ml-1\"></i>\n");
      out.write("              </a>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        <div class=\"col-md-6 mb-8\">\n");
      out.write("          <div> <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.dimage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></a></div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <hr>     \n");
      out.write("  </main>\n");
      out.write("  <!--Main layout-->\n");
      out.write("\n");
      out.write("  <!--Footer-->\n");
      out.write("  <footer class=\"page-footer text-center font-small mt-4 wow fadeIn\">\n");
      out.write("\n");
      out.write("    <hr class=\"my-4\">\n");
      out.write("\n");
      out.write("    <!-- Social icons -->\n");
      out.write("    <div class=\"pb-4\">\n");
      out.write("      <a href=\"https://www.facebook.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-facebook-f mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://twitter.com/MDBootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-twitter mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://www.youtube.com/watch?v=7MUISDJ5ZZ4\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-youtube mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://plus.google.com/u/0/b/107863090883699620484\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-google-plus-g mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://dribbble.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-dribbble mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://pinterest.com/mdbootstrap\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-pinterest mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"https://github.com/mdbootstrap/bootstrap-material-design\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-github mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <a href=\"http://codepen.io/mdbootstrap/\" target=\"_blank\">\n");
      out.write("        <i class=\"fab fa-codepen mr-3\"></i>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("    <!-- Social icons -->\n");
      out.write("\n");
      out.write("    <!--Copyright-->\n");
      out.write("    <div class=\"footer-copyright py-3\">\n");
      out.write("      © 2019 Copyright:\n");
      out.write("      <a href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\"> MDBootstrap.com </a>\n");
      out.write("    </div>\n");
      out.write("    <!--/.Copyright-->\n");
      out.write("\n");
      out.write("  </footer>\n");
      out.write("  <!--/.Footer-->\n");
      out.write("\n");
      out.write("  <!-- SCRIPTS -->\n");
      out.write("  <!-- JQuery -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery-3.4.1.min.js\"></script>\n");
      out.write("  <!-- Bootstrap tooltips -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/popper.min.js\"></script>\n");
      out.write("  <!-- Bootstrap core JavaScript -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <!-- MDB core JavaScript -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/mdb.min.js\"></script>\n");
      out.write("  <!-- Initializations -->\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    // Animations initialization\n");
      out.write("    new WOW().init();\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <li class=\"nav-item1\">\n");
        out.write("                <a class=\"nav-link waves-effect\" href=\"manageraccount\">Management Account</a>\n");
        out.write("            </li>\n");
        out.write("            \n");
        out.write("            <li class=\"nav-item1\">\n");
        out.write("                <a class=\"nav-link waves-effect\" href=\"managerproducts\">Management Product</a>\n");
        out.write("            </li>  \n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <li class=\"nav-item1\">\n");
        out.write("                <a class=\"nav-link\" href=\"#\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("            </li>\n");
        out.write("            \n");
        out.write("          <li class=\"nav-item1\">\n");
        out.write("                <a class=\"nav-link waves-effect\" href=\"logout\">Logout</a>\n");
        out.write("            </li>\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <li class=\"nav-item1\">\n");
        out.write("                <a class=\"nav-link waves-effect\" href=\"login.jsp\">Login</a>\n");
        out.write("            </li>\n");
        out.write("            <li class=\"nav-item1\">\n");
        out.write("                <a class=\"nav-link waves-effect\" href=\"signUp.jsp\">Sign Up</a>\n");
        out.write("            </li>\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
