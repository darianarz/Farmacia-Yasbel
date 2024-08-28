package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IndexAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Index Admin</title>\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("         <link href=\"/FarmaciaWeb/CSS/IndexAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 sidebar\">\r\n");
      out.write("                <div class=\"header d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                    <a href=\"#\" class=\"logo d-flex align-items-center text-light\">\r\n");
      out.write("                        <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                            <path d=\"M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z\"/>\r\n");
      out.write("                            <path d=\"m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9\"/>\r\n");
      out.write("                            <path d=\"M12 3v6\"/>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                        Farmacia Yasbel\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <button class=\"notification-btn btn btn-link text-light\">\r\n");
      out.write("                        <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                            <path d=\"M6 8a6 6 0 0 1 12 0c0 7 3 9 3 9H3s3-2 3-9\"/>\r\n");
      out.write("                            <path d=\"M10.3 21a1.94 1.94 0 0 0 3.4 0\"/>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                        <span class=\"sr-only\">Toggle notifications</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <nav class=\"nav\">\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- Collapsible Section -->\r\n");
      out.write("                    <div class=\"collapsible\">\r\n");
      out.write("                        <button class=\"collapsible-trigger\">\r\n");
      out.write("                            Gestión de Productos\r\n");
      out.write("                            <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                                <path d=\"m9 18 6-6-6-6\"/>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <div class=\"collapsible-content\">\r\n");
      out.write("                            <a href=\"#\" class=\"collapsible-link\">Droguería</a>\r\n");
      out.write("                            <a href=\"IndexAdmin.jsp\" class=\"collapsible-link submenu-btn\">Inventario</a>\r\n");
      out.write("                            <a href=\"GestionPedidoAdm.jsp\" class=\"collapsible-link submenu-btn\">Procesamiento de Pedidos</a>\r\n");
      out.write("                            <a href=\"#\" class=\"collapsible-link submenu-btn\">Gestión de Clientes</a>\r\n");
      out.write("                            <a href=\"/FarmaciaWeb/CtrProductoLi?accion=listaradm\" class=\"collapsible-link submenu-btn\">Gestion de Productos</a>\r\n");
      out.write("                            <a href=\"#\" class=\"collapsible-link submenu-btn\">..</a>\r\n");
      out.write("                            <a href=\"#\" class=\"collapsible-link submenu-btn\">PQR</a>\r\n");
      out.write("                            <a href=\"#\" class=\"collapsible-link submenu-btn\">Productos Disponibles</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-9 main-content\">\r\n");
      out.write("                <header class=\"header d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                    <a href=\"#\" class=\"menu-toggle btn btn-link\">\r\n");
      out.write("                        <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                            <path d=\"M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z\"/>\r\n");
      out.write("                            <path d=\"m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9\"/>\r\n");
      out.write("                            <path d=\"M12 3v6\"/>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                        <span class=\"sr-only\">Home</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <form class=\"search-form d-flex\">\r\n");
      out.write("                        <input type=\"search\" class=\"form-control\" placeholder=\"Buscar productos...\">\r\n");
      out.write("                        <svg class=\"icon search-icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                            <circle cx=\"11\" cy=\"11\" r=\"8\"/>\r\n");
      out.write("                            <path d=\"m21 21-4.3-4.3\"/>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <div class=\"user-menu\">\r\n");
      out.write("                        <button class=\"user-btn btn btn-link\">\r\n");
      out.write("                            <img src=\"/placeholder.svg\" width=\"32\" height=\"32\" alt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("                            <span class=\"sr-only\">Toggle user menu</span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <div class=\"user-menu-content\">\r\n");
      out.write("                            <div class=\"user-menu-label\">Mi Cuenta</div>\r\n");
      out.write("                            <div class=\"user-menu-separator\"></div>\r\n");
      out.write("                            <a href=\"#\" class=\"user-menu-item\">Cerrar sesión</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </header>\r\n");
      out.write("                <main class=\"main\">\r\n");
      out.write("                    <h1>Panel de Administración</h1>\r\n");
      out.write("                    <div class=\"table-container\">\r\n");
      out.write("                        <table class=\"table\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>Producto</th>\r\n");
      out.write("                                    <th>Disponibilidad</th>\r\n");
      out.write("                                    <th>Vendidos</th>\r\n");
      out.write("                                    <th>Estado</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("                            </tbody>\r\n");
      out.write("                            \r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </main>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Bootstrap JS, Popper.js, and jQuery -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"/FarmaciaWeb/JS/IndexAdmin.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("prod");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProStok()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td>12</td>\r\n");
          out.write("                                    <td>En stock</td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
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
