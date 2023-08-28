package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutListProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_url_var_value;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_t_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_forEach_var_end_begin.release();
    _jspx_tagPool_t_param_value_name_nobody.release();
    _jspx_tagPool_t_forEach_var_items.release();
    _jspx_tagPool_t_url_var_value.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>All of Cakes</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('image/blur-redblack.jpg'); \n");
      out.write("          background-position: center;\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-attachment: fixed;\">\n");
      out.write("\n");
      out.write("        ");
      com.Models.SplitPageBean splitPageBean = null;
      synchronized (request) {
        splitPageBean = (com.Models.SplitPageBean) _jspx_page_context.getAttribute("splitPageBean", PageContext.REQUEST_SCOPE);
        if (splitPageBean == null){
          splitPageBean = new com.Models.SplitPageBean();
          _jspx_page_context.setAttribute("splitPageBean", splitPageBean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("splitPageBean"), "page", request.getParameter("page"), request, "page", false);
      out.write("\n");
      out.write("        <div id=\"all-content\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"body-content\">\n");
      out.write("                    ");
      if (_jspx_meth_t_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"page-number\">\n");
      out.write("                        ");
      if (_jspx_meth_t_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "share-page.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <a href=\"#\">Created with Simplesite</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_t_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_t_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_t_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_t_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_t_forEach_0.setParent(null);
    _jspx_th_t_forEach_0.setVar("cake");
    _jspx_th_t_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${splitPageBean.cakes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_t_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_t_forEach_0 = _jspx_th_t_forEach_0.doStartTag();
      if (_jspx_eval_t_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_t_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_forEach_0, _jspx_page_context, _jspx_push_body_count_t_forEach_0))
            return true;
          out.write("\n");
          out.write("                        <div class=\"items\">\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cake.imagePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cake.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"image-intro\">\n");
          out.write("                            <div class=\"item-about\">\n");
          out.write("                                <h4><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detailCake}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cake.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                <div class=\"intro-para\">\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cake.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cake.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_t_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_t_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_t_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_t_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_t_forEach_0.doFinally();
      _jspx_tagPool_t_forEach_var_items.reuse(_jspx_th_t_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_t_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_t_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_t_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_t_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_t_url_0.setPageContext(_jspx_page_context);
    _jspx_th_t_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_forEach_0);
    _jspx_th_t_url_0.setValue("About.jsp");
    _jspx_th_t_url_0.setVar("detailCake");
    int _jspx_eval_t_url_0 = _jspx_th_t_url_0.doStartTag();
    if (_jspx_eval_t_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_t_forEach_0[0]++;
        _jspx_th_t_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_url_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_t_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_url_0, _jspx_page_context, _jspx_push_body_count_t_forEach_0))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_t_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_t_forEach_0[0]--;
    }
    if (_jspx_th_t_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_url_var_value.reuse(_jspx_th_t_url_0);
      return true;
    }
    _jspx_tagPool_t_url_var_value.reuse(_jspx_th_t_url_0);
    return false;
  }

  private boolean _jspx_meth_t_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_url_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_t_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_t_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_t_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_t_param_0.setPageContext(_jspx_page_context);
    _jspx_th_t_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_url_0);
    _jspx_th_t_param_0.setName("cakeID");
    _jspx_th_t_param_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cake.cakeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_t_param_0 = _jspx_th_t_param_0.doStartTag();
    if (_jspx_th_t_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_param_value_name_nobody.reuse(_jspx_th_t_param_0);
      return true;
    }
    _jspx_tagPool_t_param_value_name_nobody.reuse(_jspx_th_t_param_0);
    return false;
  }

  private boolean _jspx_meth_t_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_t_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_t_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_t_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_t_forEach_1.setParent(null);
    _jspx_th_t_forEach_1.setVar("i");
    _jspx_th_t_forEach_1.setBegin(1);
    _jspx_th_t_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${splitPageBean.totalPages}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_t_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_t_forEach_1 = _jspx_th_t_forEach_1.doStartTag();
      if (_jspx_eval_t_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            ");
          if (_jspx_meth_t_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_forEach_1, _jspx_page_context, _jspx_push_body_count_t_forEach_1))
            return true;
          out.write("\n");
          out.write("                            <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"link\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_t_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_t_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_t_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_t_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_t_forEach_1.doFinally();
      _jspx_tagPool_t_forEach_var_end_begin.reuse(_jspx_th_t_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_t_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_t_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_t_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_t_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_t_url_1.setPageContext(_jspx_page_context);
    _jspx_th_t_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_forEach_1);
    _jspx_th_t_url_1.setVar("u");
    _jspx_th_t_url_1.setValue("AboutListProduct.jsp");
    int _jspx_eval_t_url_1 = _jspx_th_t_url_1.doStartTag();
    if (_jspx_eval_t_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_t_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_t_forEach_1[0]++;
        _jspx_th_t_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_t_url_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_t_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_t_url_1, _jspx_page_context, _jspx_push_body_count_t_forEach_1))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_t_url_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_t_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_t_forEach_1[0]--;
    }
    if (_jspx_th_t_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_url_var_value.reuse(_jspx_th_t_url_1);
      return true;
    }
    _jspx_tagPool_t_url_var_value.reuse(_jspx_th_t_url_1);
    return false;
  }

  private boolean _jspx_meth_t_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_t_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_t_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_t_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_t_param_1.setPageContext(_jspx_page_context);
    _jspx_th_t_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_url_1);
    _jspx_th_t_param_1.setName("page");
    _jspx_th_t_param_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_t_param_1 = _jspx_th_t_param_1.doStartTag();
    if (_jspx_th_t_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_param_value_name_nobody.reuse(_jspx_th_t_param_1);
      return true;
    }
    _jspx_tagPool_t_param_value_name_nobody.reuse(_jspx_th_t_param_1);
    return false;
  }
}
