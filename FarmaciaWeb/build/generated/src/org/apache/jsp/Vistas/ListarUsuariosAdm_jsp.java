package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListarUsuariosAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Listar Usuarios</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 sidebar\">\n");
      out.write("                <div class=\"header d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                    <a href=\"#\" class=\"logo d-flex align-items-center text-light\">\n");
      out.write("                        <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                            <path d=\"M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z\"/>\n");
      out.write("                            <path d=\"m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9\"/>\n");
      out.write("                            <path d=\"M12 3v6\"/>\n");
      out.write("                        </svg>\n");
      out.write("                        Farmacia Yasbel\n");
      out.write("                    </a>\n");
      out.write("                    <button class=\"notification-btn btn btn-link text-light\">\n");
      out.write("                        <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                            <path d=\"M6 8a6 6 0 0 1 12 0c0 7 3 9 3 9H3s3-2 3-9\"/>\n");
      out.write("                            <path d=\"M10.3 21a1.94 1.94 0 0 0 3.4 0\"/>\n");
      out.write("                        </svg>\n");
      out.write("                        <span class=\"sr-only\">Toggle notifications</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <nav class=\"nav\">\n");
      out.write("                    \n");
      out.write("                    <!-- Collapsible Section -->\n");
      out.write("                    <div class=\"collapsible\">\n");
      out.write("                        <button class=\"collapsible-trigger\">\n");
      out.write("                            Gestión de Productos\n");
      out.write("                            <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                                <path d=\"m9 18 6-6-6-6\"/>\n");
      out.write("                            </svg>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"collapsible-content\">\n");
      out.write("                            <a href=\"#\" class=\"collapsible-link\">Droguería</a>\n");
      out.write("                            <a href=\"IndexAdmin.jsp\" class=\"collapsible-link submenu-btn\">Inventario</a>\n");
      out.write("                            <a href=\"GestionPedidoAdm.jsp\" class=\"collapsible-link submenu-btn\">Procesamiento de Pedidos</a>\n");
      out.write("                            <a href=\"#\" class=\"collapsible-link submenu-btn\">Gestión de Clientes</a>\n");
      out.write("                            <a href=\"ListarProductoAdm.jsp\" class=\"collapsible-link submenu-btn\">Gestion de Productos</a>\n");
      out.write("                            <a href=\"#\" class=\"collapsible-link submenu-btn\">..</a>\n");
      out.write("                            <a href=\"#\" class=\"collapsible-link submenu-btn\">PQR</a>\n");
      out.write("                            <a href=\"#\" class=\"collapsible-link submenu-btn\">..</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-9 main-content\">\n");
      out.write("                <header class=\"header d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                    <a href=\"#\" class=\"menu-toggle btn btn-link\">\n");
      out.write("                        <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                            <path d=\"M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z\"/>\n");
      out.write("                            <path d=\"m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9\"/>\n");
      out.write("                            <path d=\"M12 3v6\"/>\n");
      out.write("                        </svg>\n");
      out.write("                        <span class=\"sr-only\">Home</span>\n");
      out.write("                    </a>\n");
      out.write("                    <form class=\"search-form d-flex\">\n");
      out.write("                        <input type=\"search\" class=\"form-control\" placeholder=\"Buscar productos...\">\n");
      out.write("                        <svg class=\"icon search-icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                            <circle cx=\"11\" cy=\"11\" r=\"8\"/>\n");
      out.write("                            <path d=\"m21 21-4.3-4.3\"/>\n");
      out.write("                        </svg>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"user-menu\">\n");
      out.write("                        <button class=\"user-btn btn btn-link\">\n");
      out.write("                            <img src=\"/placeholder.svg\" width=\"32\" height=\"32\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("                            <span class=\"sr-only\">Toggle user menu</span>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"user-menu-content\">\n");
      out.write("                            <div class=\"user-menu-label\">Mi Cuenta</div>\n");
      out.write("                            <div class=\"user-menu-separator\"></div>\n");
      out.write("                            <a href=\"#\" class=\"user-menu-item\">Cerrar sesión</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("                <main class=\"main\">\n");
      out.write("                     <div class=\"container mt-5 border\" style=\"border-radius: 15px\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <form class=\"form-inline mt-4\" action=\"/AppWeb/CtrUsuario?accion=buscar\">\n");
      out.write("                        <div class=\"form-group mx-sm-3 mb-2\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"txtbuscar\" placeholder=\"digite nombre\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success mb-2\" name=\"accion\" value=\"buscar\"  style=\"background: #74BD64\"><i class=\"bi bi-search\"></i> Buscar</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead class=\"thead-light border\">\n");
      out.write("                    <tr table-success>\n");
      out.write("                        <th scope=\"col\" colspan=\"7\" class=\"text-center border\">USUARIOS DE LA FARMACIA</th>\n");
      out.write("                        <th scope=\"col\" class=\"text-center border\"><a class=\"btn btn-primary ml-2\" href=\"/AppWeb/Vistas/CrearUsuario.jsp\"  style=\"background: #74BD64\"><i class=\"bi bi-person-add\"></i></a></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"col\" class=\"text-center border\">Id</th>\n");
      out.write("                        <th scope=\"col\" class=\"text-center border\">Nombre</th>\n");
      out.write("                        <th scope=\"col\" class=\"text-center border\">Apellido</th>\n");
      out.write("                        <th scope=\"col\" class=\"text-center border\">Direccion</th>\n");
      out.write("                        <th scope=\"col\" class=\"text-center border\">Telefono</th>\n");
      out.write("                        <th scope=\"col\" class=\"text-center border\">Usuario</th>\n");
      out.write("                        <th scope=\"col\" class=\"text-center border\">Tipo</th>\n");
      out.write("                        <th scope=\"col\" class=\"text-center border\">Acciones</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <c:forEach var=\"usu\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarios}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">  \n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\" class=\"border\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</th>\n");
      out.write("                        <td class=\"border\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td class=\"border\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getApellido()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td class=\"border\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td class=\"border\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getTelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td class=\"border\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td class=\"border\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getTipo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                        <td class=\" text-center border\">\n");
      out.write("                            <input type=\"hidden\" name=\"id\" id=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <a class=\"btn btn-warning\" href=\"/AppWeb/CtrUsuario?accion=editar&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usu.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><i class=\"bi bi-pencil-fill\"></i></a>\n");
      out.write("                            <a class=\"btn btn-danger\" id=\"btneliminar\" href=\"#\"><i class=\"bi bi-trash-fill\"></i></i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    </c:forEach>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("                </main>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Bootstrap JS, Popper.js, and jQuery -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../JS/IndexAdmin.js\" type=\"text/javascript\"></script>\n");
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
}
