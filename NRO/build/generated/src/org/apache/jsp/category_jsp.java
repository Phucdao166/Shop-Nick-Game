package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("  <!-- Material Design Bootstrap -->\n");
      out.write("  <link href=\"css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- Your custom styles (optional) -->\n");
      out.write("  <link href=\"css/style.min.css\" rel=\"stylesheet\">\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("    html,\n");
      out.write("    body,\n");
      out.write("    header,\n");
      out.write("    .carousel {\n");
      out.write("      height: 60vh;\n");
      out.write("    }\n");
      out.write("    .nav-item li{\n");
      out.write("        display: inline-block;\n");
      out.write("        background-color: #00ff6d;\n");
      out.write("    }\n");
      out.write("    .search1{\n");
      out.write("        display: flex;\n");
      out.write("    }\n");
      out.write("    .navbar-brand{\n");
      out.write("        font-weight: bold;\n");
      out.write("        font-size: 40px;\n");
      out.write("        color: bisque;\n");
      out.write("    }\n");
      out.write("    .navbar navbar-expand-lg navbar-dark mdb-color lighten-3 mt-3 mb-5{\n");
      out.write("        background-color: blue;\n");
      out.write("    }\n");
      out.write("    .form-control{\n");
      out.write("        margin: 5px;\n");
      out.write("        padding: 9px;\n");
      out.write("        font-size: 18px;\n");
      out.write("    }\n");
      out.write("    .btn{\n");
      out.write("        padding: 8px;\n");
      out.write("        font-size: 13px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .list-group-item:last-child {\n");
      out.write("    margin: 0px 0px -1px;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .list-group-item:first-child {\n");
      out.write("    margin: 0px 0px -1px;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .list-group-item {\n");
      out.write("    border-radius: 20px; \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .mdb-color.lighten-3 {\n");
      out.write("    background-color: #FFA!important;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    .navbar-dark .navbar-brand {\n");
      out.write("    color: #2a0303;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    a{\n");
      out.write("        color: black;\n");
      out.write("        font-weight: 100px;\n");
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
      out.write("    .page {\n");
      out.write("        margin: 23px 288px;\n");
      out.write("    }\n");
      out.write("    .page a{\n");
      out.write("        margin: 19px;\n");
      out.write("        padding: 13px;\n");
      out.write("        border: 1px solid;\n");
      out.write("    }\n");
      out.write("    a.active{\n");
      out.write("        background-color: greenyellow;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
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
      out.write("  <!-- Navbar -->\n");
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
      out.write("          <li class=\"nav-item active\">\n");
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
      out.write("            <a class=\"nav-link waves-effect\">\n");
      out.write("              <span class=\"badge red z-depth-1 mr-1\"> 1 </span>\n");
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
      out.write("  <!-- Navbar -->\n");
      out.write("\n");
      out.write("  <!--Carousel Wrapper-->\n");
      out.write("  <div id=\"carousel-example-1z\" class=\"carousel slide carousel-fade pt-4\" data-ride=\"carousel\">\n");
      out.write("    <!--Slides-->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\n");
      out.write("      <!--First slide-->\n");
      out.write("      <div class=\"carousel-item active\">\n");
      out.write("          <div class=\"view\" style=\"background-image: url('https://i.imgur.com/6HJhIRf.png'); background-size: cover;\"></div>\n");
      out.write("\n");
      out.write("          <!-- Mask & flexbox options-->\n");
      out.write("          <div class=\"mask rgba-black-strong d-flex justify-content-center align-items-center\">\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  <!--/.Carousel Wrapper-->\n");
      out.write("\n");
      out.write("  <!--Main layout-->\n");
      out.write("  <main>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <!--Navbar-->\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-dark mdb-color lighten-3 mt-3 mb-5\">\n");
      out.write("\n");
      out.write("        <!-- Navbar brand -->\n");
      out.write("        <span class=\"navbar-brand\">Planet</span>\n");
      out.write("\n");
      out.write("        <!-- Collapse button -->\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#basicExampleNav\"\n");
      out.write("          aria-controls=\"basicExampleNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <!-- Collapsible content -->\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"basicExampleNav\">\n");
      out.write("\n");
      out.write("          <!-- Links -->\n");
      out.write("          <ul class=\"navbar-nav mr-auto\">   \n");
      out.write("            <div class=\"nav-item\">\n");
      out.write("              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("          <!-- Links -->\n");
      out.write("\n");
      out.write("          <form action=\"search\" method=\"post\" class=\"form-inline\">\n");
      out.write("            <div class=\"search1\">\n");
      out.write("              <input name=\"txt\" type=\"text\" class=\"form-control\" aria-label=\"Small\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Search...\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <button  type=\"submit\" class=\"btn btn-secondary btn-number\">\n");
      out.write("                                    <i class=\"fa fa-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <!-- Collapsible content -->\n");
      out.write("\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("      <!--/.Navbar-->\n");
      out.write("\n");
      out.write("      <!--Section: Products v.3-->\n");
      out.write("\n");
      out.write("       <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      <!--Section: Products v.3-->\n");
      out.write("                    </div>\n");
      out.write("      <!--Pagination-->\n");
      out.write("      <nav class=\"d-flex justify-content-center wow fadeIn\">\n");
      out.write("        <ul class=\"page\">\n");
      out.write("          ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("      <!--Pagination-->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("  <!--Main layout-->\n");
      out.write("\n");
      out.write("  <!--Footer-->\n");
      out.write("  <footer class=\"page-footer text-center font-small mt-4 wow fadeIn\">\n");
      out.write("\n");
      out.write("    <!--Call to action-->\n");
      out.write("    <div class=\"pt-4\">\n");
      out.write("      <a class=\"btn btn-outline-white\" href=\"https://mdbootstrap.com/docs/jquery/getting-started/download/\" target=\"_blank\"\n");
      out.write("        role=\"button\">Download MDB\n");
      out.write("        <i class=\"fas fa-download ml-2\"></i>\n");
      out.write("      </a>\n");
      out.write("      <a class=\"btn btn-outline-white\" href=\"https://mdbootstrap.com/education/bootstrap/\" target=\"_blank\" role=\"button\">Start\n");
      out.write("        free tutorial\n");
      out.write("        <i class=\"fas fa-graduation-cap ml-2\"></i>\n");
      out.write("      </a>\n");
      out.write("    </div>\n");
      out.write("    <!--/.Call to action-->\n");
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
        out.write("            <li class=\"nav-item\">\n");
        out.write("                <a class=\"nav-link waves-effect\" href=\"manageraccount\">Management Account</a>\n");
        out.write("            </li>\n");
        out.write("            \n");
        out.write("            <li class=\"nav-item\">\n");
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
        out.write("            <li class=\"nav-item\">\n");
        out.write("                <a class=\"nav-link\" href=\"#\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("            </li>\n");
        out.write("            \n");
        out.write("          <li class=\"nav-item\">\n");
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
        out.write("            <li class=\"nav-item\">\n");
        out.write("                <a class=\"nav-link waves-effect\" href=\"login.jsp\">Login</a>\n");
        out.write("            </li>\n");
        out.write("            <li class=\"nav-item\">\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                 <li class=\"list-group-item text-white ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag==o.cid ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("             ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"col-12 col-md-6 col-lg-4\">\n");
          out.write("                                <div class=\"card\">\n");
          out.write("                                    <img class=\"card-img-top\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"a lt=\"Card image cap\">\n");
          out.write("                                    <div class=\"card-body\">\n");
          out.write("                                        <h4 class=\"card-title show_txt\"><a href=\"detail?nickID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.nickID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">Account ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.nickID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                        <p class=\"card-text show_txt\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.planet}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Sever ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sever}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>                    \n");
          out.write("                                        <div class=\"row\">\n");
          out.write("                                            <div class=\"col\">\n");
          out.write("                                                <p class=\"btn btn-danger btn-block\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.money}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"col\">\n");
          out.write("                                                <a href=\"#\" class=\"btn btn-success btn-block\">Add to cart</a>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setBegin(1);
    _jspx_th_c_forEach_2.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endP}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("              <a class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagg==i?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
