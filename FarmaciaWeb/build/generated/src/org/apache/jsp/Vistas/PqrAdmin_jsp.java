package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PqrAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Index Admin</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"../CSS/IndexAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 sidebar\">\n");
      out.write("                    <div class=\"header d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                        <a href=\"#\" class=\"logo d-flex align-items-center text-light\">\n");
      out.write("                            <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                            <path d=\"M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z\"/>\n");
      out.write("                            <path d=\"m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9\"/>\n");
      out.write("                            <path d=\"M12 3v6\"/>\n");
      out.write("                            </svg>\n");
      out.write("                            Farmacia Yasbel\n");
      out.write("                        </a>\n");
      out.write("                        <button class=\"notification-btn btn btn-link text-light\">\n");
      out.write("                            <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                            <path d=\"M6 8a6 6 0 0 1 12 0c0 7 3 9 3 9H3s3-2 3-9\"/>\n");
      out.write("                            <path d=\"M10.3 21a1.94 1.94 0 0 0 3.4 0\"/>\n");
      out.write("                            </svg>\n");
      out.write("                            <span class=\"sr-only\">Toggle notifications</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <nav class=\"nav\">\n");
      out.write("\n");
      out.write("                        <!-- Collapsible Section -->\n");
      out.write("                        <div class=\"collapsible\">\n");
      out.write("                            <button class=\"collapsible-trigger\">\n");
      out.write("                                Gestión de Productos\n");
      out.write("                                <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                                <path d=\"m9 18 6-6-6-6\"/>\n");
      out.write("                                </svg>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"collapsible-content\">\n");
      out.write("                                <a href=\"#\" class=\"collapsible-link\">Droguería</a>\n");
      out.write("                                <a href=\"IndexAdmin.jsp\" class=\"collapsible-link submenu-btn\">Inventario</a>\n");
      out.write("                                <a href=\"GestionPedidoAdm.jsp\" class=\"collapsible-link submenu-btn\">Procesamiento de Pedidos</a>\n");
      out.write("                                <a href=\"#\" class=\"collapsible-link submenu-btn\">Gestión de Clientes</a>\n");
      out.write("                                <a href=\"ListarProductoAdm.jsp\" class=\"collapsible-link submenu-btn\">Gestion de Productos</a>\n");
      out.write("                                <a href=\"#\" class=\"collapsible-link submenu-btn\">..</a>\n");
      out.write("                                <a href=\"#\" class=\"collapsible-link submenu-btn\">PQR</a>\n");
      out.write("                                <a href=\"#\" class=\"collapsible-link submenu-btn\">Productos Disponibles</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9 main-content\">\n");
      out.write("                    <header class=\"header d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                        <a href=\"#\" class=\"menu-toggle btn btn-link\">\n");
      out.write("                            <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                            <path d=\"M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z\"/>\n");
      out.write("                            <path d=\"m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9\"/>\n");
      out.write("                            <path d=\"M12 3v6\"/>\n");
      out.write("                            </svg>\n");
      out.write("                            <span class=\"sr-only\">Home</span>\n");
      out.write("                        </a>\n");
      out.write("                        <form class=\"search-form d-flex\">\n");
      out.write("                            <input type=\"search\" class=\"form-control\" placeholder=\"Buscar productos...\">\n");
      out.write("                            <svg class=\"icon search-icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                            <circle cx=\"11\" cy=\"11\" r=\"8\"/>\n");
      out.write("                            <path d=\"m21 21-4.3-4.3\"/>\n");
      out.write("                            </svg>\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"user-menu\">\n");
      out.write("                            <button class=\"user-btn btn btn-link\">\n");
      out.write("                                <img src=\"/placeholder.svg\" width=\"32\" height=\"32\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("                                <span class=\"sr-only\">Toggle user menu</span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"user-menu-content\">\n");
      out.write("                                <div class=\"user-menu-label\">Mi Cuenta</div>\n");
      out.write("                                <div class=\"user-menu-separator\"></div>\n");
      out.write("                                <a href=\"#\" class=\"user-menu-item\">Cerrar sesión</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </header>\n");
      out.write("                    <main class=\"main\">\n");
      out.write("                        <div class=\"container mt-5\">\n");
      out.write("                            <h1 class=\"mb-4\">PQR Realizadas</h1>\n");
      out.write("                            <div class=\"table-container\">\n");
      out.write("                                <table class=\"table table-striped\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>ID</th>\n");
      out.write("                                            <th>Tipo</th>\n");
      out.write("                                            <th>Asunto</th>\n");
      out.write("                                            <th>Descripción</th>\n");
      out.write("                                            <th>Fecha</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>1</td>\n");
      out.write("                                            <td>Pregunta</td>\n");
      out.write("                                            <td>Información sobre el producto</td>\n");
      out.write("                                            <td>¿Cuáles son las especificaciones del producto X?</td>\n");
      out.write("                                            <td>2024-08-24</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>2</td>\n");
      out.write("                                            <td>Queja</td>\n");
      out.write("                                            <td>Servicio al cliente</td>\n");
      out.write("                                            <td>El servicio al cliente no respondió a mi consulta.</td>\n");
      out.write("                                            <td>2024-08-25</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <!-- Más filas aquí -->\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </main>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Bootstrap JS, Popper.js, and jQuery -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"../JS/IndexAdmin.js\" type=\"text/javascript\"></script>\n");
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
