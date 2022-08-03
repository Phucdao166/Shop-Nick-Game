package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.11.2/css/all.css\">\n");
      out.write("  <!-- Bootstrap core CSS -->\n");
      out.write("  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- Material Design Bootstrap -->\n");
      out.write("  <link href=\"css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- Your custom styles (optional) -->\n");
      out.write("  <link href=\"css/style.min.css\" rel=\"stylesheet\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cart</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            h3{\n");
      out.write("                text-align: center;\n");
      out.write("                height: 73px;\n");
      out.write("                font-size: 42px;\n");
      out.write("                color: crimson;\n");
      out.write("                background-color: blanchedalmond;\n");
      out.write("                margin: auto;\n");
      out.write("            }\n");
      out.write("            table tr{\n");
      out.write("                 text-align: center;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 19px;\n");
      out.write("                margin-top: -11px;\n");
      out.write("                height: 35px;\n");
      out.write("                background-color: blanchedalmond;\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                margin: 30px 39px;\n");
      out.write("                 text-align: center;\n");
      out.write("            }\n");
      out.write("            .nickID{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .pay{\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            .proces{\n");
      out.write("                padding-top: 10px;\n");
      out.write("            }\n");
      out.write("            .pay2{\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            .pt-5, .py-5 {\n");
      out.write("                padding-top: 1rem!important;\n");
      out.write("            }\n");
      out.write("            h4{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<section class=\"pt-5 pb-5\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row w-100\">\n");
      out.write("        <div class=\"col-lg-12 col-md-12 col-12\">\n");
      out.write("            <h3 class=\"display-5 mb-2 text-center\">Shopping Cart</h3>\n");
      out.write("                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"back\">\n");
      out.write("                <a href=\"home\"><i class=\"fas fa-arrow-left mr-2\"></i> Continue Shopping</a>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("    </div>                      \n");
      out.write("</section>\n");
      out.write("                            <footer class=\"page-footer text-center font-small mt-4 wow fadeIn\">\n");
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
      out.write("  </footer>\n");
      out.write("                        \n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart==null||sessionScope.cart.size()==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <h1>List Cart is Empty</h1>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <p class=\"mb-5 text-center\">\n");
        out.write("                        <i class=\"text-info font-weight-bold\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</i> nick in your cart</p>\n");
        out.write("                    <table id=\"shoppingCart\" class=\"table table-condensed table-responsive\">\n");
        out.write("                        <thead>\n");
        out.write("                            <tr>\n");
        out.write("                                <th style=\"width:10%\">ID</th>\n");
        out.write("                                <th style=\"width:20%\">Product</th>\n");
        out.write("                                <th style=\"width:12%\">Price</th>\n");
        out.write("                                <th style=\"width:10%\">Planet</th>\n");
        out.write("                                <th style=\"width:16%\">Action</th>\n");
        out.write("                            </tr>\n");
        out.write("                        </thead>\n");
        out.write("                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </table>\n");
        out.write("                    \n");
        out.write("                    <div class=\"pay\">\n");
        out.write("                        <h4>Total:</h4>\n");
        out.write("                        <h1>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoney}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" VND</h1>\n");
        out.write("                    </div>\n");
        out.write("        </div>\n");
        out.write("    </div>\n");
        out.write("            <div class=\"proces\">\n");
        out.write("                    <div class=\"pay2\">\n");
        out.write("                        <a href=\"order\" class=\"btn btn-primary mb-4 btn-lg pl-5 pr-5\">Pay</a>\n");
        out.write("                    </div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tbody>\n");
          out.write("                            <tr>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.value.product.nickID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.value.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" class=\"img-fluid d-none d-md-block rounded mb-2 shadow \">\n");
          out.write("                                </td>\n");
          out.write("                                <td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.value.product.money}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.value.product.planet}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                <td>             \n");
          out.write("                                    <a href=\"removeproductcart?nickID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.value.product.nickID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" data-toggle=\"modal\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
          out.write("                                </td>\n");
          out.write("                            </tr>             \n");
          out.write("                        </tbody>\n");
          out.write("                    ");
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
}
