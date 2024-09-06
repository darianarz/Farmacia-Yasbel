package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Gestionpedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Historial de pedidos</title>\n");
      out.write("  <!-- Bootstrap CSS -->\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"../CSS/Gestionpedido.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("  <!-- Navbar -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light navbar-custom\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"/FarmaciaWeb/CtrProductoLi?accion=home\">\n");
      out.write("        <img src=\"/FarmaciaWeb/Imagenes/lo-removebg-preview.png\" class=\"icon\" width=\"60\" height=\"60\" alt=\"Farmacia Yasbel\"/>\n");
      out.write("        Farmacia Yasbel\n");
      out.write("    </a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0 mr-auto search-form\" action=\"/FarmaciaWeb/CtrProductoLi?accion=buscar\" method=\"post\">\n");
      out.write("            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Buscar productos...\" aria-label=\"Search\" name=\"busqueda\">\n");
      out.write("            <button class=\"btn-search my-2 my-sm-0\" type=\"submit\">\n");
      out.write("                <div class=\"original\">BUSCAR</div>\n");
      out.write("            </button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle nav-text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    <i class=\"bi bi-person\"></i> Mi Cuenta\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                    <a class=\"dropdown-item text-center\" href=\"#\"><i class=\"bi bi-person\"></i></a>\n");
      out.write("                    <a class=\"dropdown-item\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsunombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                    <a class=\"dropdown-item\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsutipo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                    <a class=\"dropdown-item\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">PQR</a>\n");
      out.write("                    <a class=\"dropdown-item text-danger\" href=\"/FarmaciaWeb/CtrProductoLi?accion=salir\">Cerrar Sesión</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link nav-text-white\" href=\"CtrProductoLi?accion=Carrito\">\n");
      out.write("                    <i class=\"bi bi-cart-check-fill\"></i> Carrito\n");
      out.write("                    (<label style=\"color: darkorange\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>)\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle nav-text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    <i class=\"bi bi-bookmark\"></i> Comprar por categorías\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                    <c:forEach var=\"c\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categorias}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <a class=\"dropdown-item\" href=\"/FarmaciaWeb/CtrProductoLi?accion=buscarcat&catid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getCatCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <i class=\"bi bi-bookmarks\"></i> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getCatNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                    </c:forEach>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("  <!-- Espacio entre el navbar y el contenido -->\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <div class=\"mt-4 container\">\n");
      out.write("    <header class=\"mb-4\">\n");
      out.write("      <h1>Historial de pedidos</h1>\n");
      out.write("      <p>Aquí puedes ver el estado, precio y procesamiento de tus pedidos.</p>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"table-responsive\">\n");
      out.write("      <table class=\"table table-hover\">\n");
      out.write("        <thead class=\"table-light\">\n");
      out.write("          <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>Estado</th>\n");
      out.write("            <th>Precio</th>\n");
      out.write("            <th>Fecha</th>\n");
      out.write("            <th>Acción</th>\n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("          <tr>\n");
      out.write("            <td>ORD001</td>\n");
      out.write("            <td><span class=\"badge bg-warning text-dark\">Pendiente</span></td>\n");
      out.write("            <td>$149.909</td>\n");
      out.write("            <td>2023-05-12</td>\n");
      out.write("            <td><button class=\"btn btn-outline-primary btn-sm\" data-bs-toggle=\"modal\" data-bs-target=\"#orderModal\" onclick=\"setModalDetails('ORD001')\">Ver detalles</button></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>ORD002</td>\n");
      out.write("            <td><span class=\"badge bg-info text-dark\">Enviado</span></td>\n");
      out.write("            <td>$79.909</td>\n");
      out.write("            <td>2023-04-28</td>\n");
      out.write("            <td><button class=\"btn btn-outline-primary btn-sm\" data-bs-toggle=\"modal\" data-bs-target=\"#orderModal\" onclick=\"setModalDetails('ORD002')\">Ver detalles</button></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>ORD003</td>\n");
      out.write("            <td><span class=\"badge bg-success\">Entregado</span></td>\n");
      out.write("            <td>$299.99</td>\n");
      out.write("            <td>2023-03-15</td>\n");
      out.write("            <td><button class=\"btn btn-outline-primary btn-sm\" data-bs-toggle=\"modal\" data-bs-target=\"#orderModal\" onclick=\"setModalDetails('ORD003')\">Ver detalles</button></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>ORD004</td>\n");
      out.write("            <td><span class=\"badge bg-danger\">Cancelado</span></td>\n");
      out.write("            <td>$39.909</td>\n");
      out.write("            <td>2023-02-22</td>\n");
      out.write("            <td><button class=\"btn btn-outline-primary btn-sm\" data-bs-toggle=\"modal\" data-bs-target=\"#orderModal\" onclick=\"setModalDetails('ORD004')\">Ver detalles</button></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>ORD005</td>\n");
      out.write("            <td><span class=\"badge bg-warning text-dark\">Pendiente</span></td>\n");
      out.write("            <td>$199.990</td>\n");
      out.write("            <td>2023-01-08</td>\n");
      out.write("            <td><button class=\"btn btn-outline-primary btn-sm\" data-bs-toggle=\"modal\" data-bs-target=\"#orderModal\" onclick=\"setModalDetails('ORD005')\">Ver detalles</button></td>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"orderModal\" tabindex=\"-1\" aria-labelledby=\"orderModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <h5 class=\"modal-title\" id=\"orderModalLabel\">Detalles del pedido</h5>\n");
      out.write("            <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-body\">\n");
      out.write("            <p id=\"orderDetails\">Detalles del pedido...</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cerrar</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap JS (y dependencias de Popper.js) -->\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    function setModalDetails(orderId) {\n");
      out.write("      document.getElementById('orderDetails').innerText = 'Detalles del pedido: ' + orderId;\n");
      out.write("    }\n");
      out.write("  </script>\n");
      out.write("</body>\n");
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
