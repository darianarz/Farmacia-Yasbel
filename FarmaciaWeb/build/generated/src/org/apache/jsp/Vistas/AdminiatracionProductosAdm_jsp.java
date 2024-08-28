package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminiatracionProductosAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Yasbel Drugs - Administración de Productos</title>\r\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/Gestion.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("         <link href=\"../CSS/IndexAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3 sidebar\">\r\n");
      out.write("                    <div class=\"header d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                        <a href=\"#\" class=\"logo d-flex align-items-center text-light\">\r\n");
      out.write("                            <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                            <path d=\"M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z\"/>\r\n");
      out.write("                            <path d=\"m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9\"/>\r\n");
      out.write("                            <path d=\"M12 3v6\"/>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                            Farmacia Yasbel\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <button class=\"notification-btn btn btn-link text-light\">\r\n");
      out.write("                            <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                            <path d=\"M6 8a6 6 0 0 1 12 0c0 7 3 9 3 9H3s3-2 3-9\"/>\r\n");
      out.write("                            <path d=\"M10.3 21a1.94 1.94 0 0 0 3.4 0\"/>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                            <span class=\"sr-only\">Toggle notifications</span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <nav class=\"nav\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Collapsible Section -->\r\n");
      out.write("                        <div class=\"collapsible\">\r\n");
      out.write("                            <button class=\"collapsible-trigger\">\r\n");
      out.write("                                Gestión de Productos\r\n");
      out.write("                                <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                                <path d=\"m9 18 6-6-6-6\"/>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                            </button>\r\n");
      out.write("                             <div class=\"collapsible-content\">\r\n");
      out.write("                                <a href=\"#\" class=\"collapsible-link\">Droguería</a>\r\n");
      out.write("                                <a href=\"IndexAdmin.jsp\" class=\"collapsible-link submenu-btn\">Inventario</a>\r\n");
      out.write("                                <a href=\"GestionPedidoAdm.jsp\" class=\"collapsible-link submenu-btn\">Procesamiento de Pedidos</a>\r\n");
      out.write("                                <a href=\"#\" class=\"collapsible-link submenu-btn\">Gestión de Clientes</a>\r\n");
      out.write("                                <a href=\"ListarProductoAdm.jsp\" class=\"collapsible-link submenu-btn\">Gestion de Productos</a>\r\n");
      out.write("                                <a href=\"#\" class=\"collapsible-link submenu-btn\">..</a>\r\n");
      out.write("                                <a href=\"#\" class=\"collapsible-link submenu-btn\">PQR</a>\r\n");
      out.write("                                <a href=\"#\" class=\"collapsible-link submenu-btn\">Productos Disponibles</a>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-9 main-content\">\r\n");
      out.write("                    <header class=\"header d-flex justify-content-between align-items-center mb-3\">\r\n");
      out.write("                        <a href=\"#\" class=\"menu-toggle btn btn-link\">\r\n");
      out.write("                            <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                            <path d=\"M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z\"/>\r\n");
      out.write("                            <path d=\"m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9\"/>\r\n");
      out.write("                            <path d=\"M12 3v6\"/>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                            <span class=\"sr-only\">Home</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <form class=\"search-form d-flex\">\r\n");
      out.write("                            <input type=\"search\" class=\"form-control\" placeholder=\"Buscar productos...\">\r\n");
      out.write("                            <svg class=\"icon search-icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                            <circle cx=\"11\" cy=\"11\" r=\"8\"/>\r\n");
      out.write("                            <path d=\"m21 21-4.3-4.3\"/>\r\n");
      out.write("                            </svg>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <div class=\"user-menu\">\r\n");
      out.write("                            <button class=\"user-btn btn btn-link\">\r\n");
      out.write("                                <img src=\"/placeholder.svg\" width=\"32\" height=\"32\" alt=\"Avatar\" class=\"avatar\">\r\n");
      out.write("                                <span class=\"sr-only\">Toggle user menu</span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <div class=\"user-menu-content\">\r\n");
      out.write("                                <div class=\"user-menu-label\">Mi Cuenta</div>\r\n");
      out.write("                                <div class=\"user-menu-separator\"></div>\r\n");
      out.write("                                <a href=\"#\" class=\"user-menu-item\">Cerrar sesión</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </header>\r\n");
      out.write("                    <main class=\"main\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <h1 class=\"title\">Yasbel Drugs - Administración de Productos</h1>\r\n");
      out.write("                            <div class=\"grid\">\r\n");
      out.write("                                <div class=\"form-section\">\r\n");
      out.write("                                    <h2 class=\"subtitle\">Agregar Nuevo Producto</h2>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"name\">Nombre</label>\r\n");
      out.write("                                        <input id=\"name\" name=\"name\" type=\"text\" placeholder=\"Nombre del Producto\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"description\">Descripción</label>\r\n");
      out.write("                                        <textarea id=\"description\" name=\"description\" placeholder=\"Descripción del Producto\"></textarea>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <select id=\"category\" name=\"category\">\r\n");
      out.write("                                        <option value=\"\" disabled selected>Selecciona una categoría</option>\r\n");
      out.write("                                        <option value=\"Categoria 1\">Anti-pirectico</option>\r\n");
      out.write("                                        <option value=\"Categoria 2\">Desinflamatorio</option>\r\n");
      out.write("                                        <option value=\"Categoria 3\">Sales de Rehidratación</option>\r\n");
      out.write("                                        <option value=\"Categoria 4\">Anti-Diarreica</option>\r\n");
      out.write("                                        <option value=\"Categoria 4\">Sistema digestivo y Metabolico</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"price\" style=\"padding-top: 10px;\">Stock</label>\r\n");
      out.write("                                        <input id=\"price\" name=\"price\" type=\"number\" placeholder=\"Cantidad\">\r\n");
      out.write("                                    </div>      \r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"price\">Precio</label>\r\n");
      out.write("                                        <input id=\"price\" name=\"price\" type=\"number\" placeholder=\"Precio del Producto\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <label for=\"imageUrl\">URL de la Imagen</label>\r\n");
      out.write("                                        <input id=\"imageUrl\" name=\"imageUrl\" type=\"text\" placeholder=\"URL de la Imagen\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <button class=\"button\">Agregar Producto</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"products-section\">\r\n");
      out.write("                                    <h2 class=\"subtitle\">Productos Existentes</h2>\r\n");
      out.write("                                    <div class=\"product-card\">\r\n");
      out.write("                                        <div class=\"card-header\">\r\n");
      out.write("                                            <h3 class=\"card-title\">Panadol</h3>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"card-content\">\r\n");
      out.write("                                            <img src=\"../Imagenes/panadol-20s.png\" style=\"width: 250px; height: 250px;\" alt=\"Panadol\" class=\"product-image\">\r\n");
      out.write("                                            <p>Analgésico para el dolor de cabeza</p>\r\n");
      out.write("                                            <div class=\"card-footer\">\r\n");
      out.write("                                                <span class=\"price\">$5.999</span>\r\n");
      out.write("                                                <button class=\"button small\">Editar</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- Repeat similar blocks for other products -->\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </main>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Bootstrap JS, Popper.js, and jQuery -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"../JS/IndexAdmin.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
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
}
