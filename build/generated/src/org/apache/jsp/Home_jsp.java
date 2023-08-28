package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Maria Cafe - Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      com.Beans.CakesBean cakesBean = null;
      synchronized (request) {
        cakesBean = (com.Beans.CakesBean) _jspx_page_context.getAttribute("cakesBean", PageContext.REQUEST_SCOPE);
        if (cakesBean == null){
          cakesBean = new com.Beans.CakesBean();
          _jspx_page_context.setAttribute("cakesBean", cakesBean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      com.Beans.OpeningHoursBean openingHourBean = null;
      synchronized (request) {
        openingHourBean = (com.Beans.OpeningHoursBean) _jspx_page_context.getAttribute("openingHourBean", PageContext.REQUEST_SCOPE);
        if (openingHourBean == null){
          openingHourBean = new com.Beans.OpeningHoursBean();
          _jspx_page_context.setAttribute("openingHourBean", openingHourBean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      com.Beans.SelfDescriptionBean selfDescriptionBean = null;
      synchronized (request) {
        selfDescriptionBean = (com.Beans.SelfDescriptionBean) _jspx_page_context.getAttribute("selfDescriptionBean", PageContext.REQUEST_SCOPE);
        if (selfDescriptionBean == null){
          selfDescriptionBean = new com.Beans.SelfDescriptionBean();
          _jspx_page_context.setAttribute("selfDescriptionBean", selfDescriptionBean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      com.Beans.AddressAndContactBean addressAndContactBean = null;
      synchronized (request) {
        addressAndContactBean = (com.Beans.AddressAndContactBean) _jspx_page_context.getAttribute("addressAndContactBean", PageContext.REQUEST_SCOPE);
        if (addressAndContactBean == null){
          addressAndContactBean = new com.Beans.AddressAndContactBean();
          _jspx_page_context.setAttribute("addressAndContactBean", addressAndContactBean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"all-content\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"body-content\">\n");
      out.write("                    <div class=\"self-description\">\n");
      out.write("                        <div class=\"bound-self-image\">\n");
      out.write("                            <img alt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selfDescriptionBean.selfDescriptions.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selfDescriptionBean.selfDescriptions.imagePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"self-image\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"self-description-content\">\n");
      out.write("                            <div class=\"self-description-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selfDescriptionBean.selfDescriptions.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selfDescriptionBean.selfDescriptions.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"items\">\n");
      out.write("                        ");
      if (_jspx_meth_t_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"visit-invite\">\n");
      out.write("                        <h4>Visit my Cafe</h4>\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${addressAndContactBean.addressAndContacts.get(0).description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${addressAndContactBean.addressAndContacts.get(0).address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <p>Phone: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${addressAndContactBean.addressAndContacts.get(0).phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"sign-box\">\n");
      out.write("                        Kind regards\n");
      out.write("                        <div class=\"sign\">\n");
      out.write("                            <i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selfDescriptionBean.selfDescriptions.sign}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
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
    _jspx_th_t_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cakesBean.top2Cakes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_t_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_t_forEach_0 = _jspx_th_t_forEach_0.doStartTag();
      if (_jspx_eval_t_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"cake\">\n");
          out.write("                                <div>\n");
          out.write("                                    <img alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cake.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cake.imagePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"image\" />\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"item-content\">\n");
          out.write("                                    <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cake.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cake.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
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
}
