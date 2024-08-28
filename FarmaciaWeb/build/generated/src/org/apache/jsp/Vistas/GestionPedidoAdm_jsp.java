package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GestionPedidoAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Gestión de Pedidos</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\">\r\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/GestionPedidoAdm.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("           <div class=\"container\">\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("      <h1>Pedidos de Farmacia</h1>\r\n");
      out.write("      <button class=\"button primary\">Nuevo Pedido</button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"table-container\">\r\n");
      out.write("      <table>\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>Estado</th>\r\n");
      out.write("            <th>Cliente</th>\r\n");
      out.write("            <th>Productos</th>\r\n");
      out.write("            <th>Total</th>\r\n");
      out.write("            <th>Acciones</th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><span class=\"badge pending\">Pendiente</span></td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div class=\"font-medium\">Juan Pérez</div>\r\n");
      out.write("              <div class=\"text-muted\">Calle Principal 123, Bogotá</div>\r\n");
      out.write("              <div class=\"text-muted\">+57 123 456 789</div>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div>Paracetamol x 2</div>\r\n");
      out.write("              <div>Ibuprofeno x 1</div>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>$50.00</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div class=\"actions\">\r\n");
      out.write("                <button class=\"button icon success\">\r\n");
      out.write("                  <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                    <path d=\"M20 6 9 17l-5-5\"></path>\r\n");
      out.write("                  </svg>\r\n");
      out.write("                  <span class=\"sr-only\">Marcar como Pagado</span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <button class=\"button icon info\">\r\n");
      out.write("                  <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                    <path d=\"M14 18V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v11a1 1 0 0 0 1 1h2\"></path>\r\n");
      out.write("                    <path d=\"M15 18H9\"></path>\r\n");
      out.write("                    <path d=\"M19 18h2a1 1 0 0 0 1-1v-3.65a1 1 0 0 0-.22-.624l-3.48-4.35A1 1 0 0 0 17.52 8H14\"></path>\r\n");
      out.write("                    <circle cx=\"17\" cy=\"18\" r=\"2\"></circle>\r\n");
      out.write("                    <circle cx=\"7\" cy=\"18\" r=\"2\"></circle>\r\n");
      out.write("                  </svg>\r\n");
      out.write("                  <span class=\"sr-only\">Marcar como Listo para Enviar</span>\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><span class=\"badge pending\">Pendiente</span></td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div class=\"font-medium\">María Gómez</div>\r\n");
      out.write("              <div class=\"text-muted\">Avenida Central 456, Medellín</div>\r\n");
      out.write("              <div class=\"text-muted\">+57 987 654 321</div>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div>Amoxicilina x 3</div>\r\n");
      out.write("              <div>Vitamina C x 1</div>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>$75.00</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div class=\"actions\">\r\n");
      out.write("                <button class=\"button icon success\">\r\n");
      out.write("                  <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                    <path d=\"M20 6 9 17l-5-5\"></path>\r\n");
      out.write("                  </svg>\r\n");
      out.write("                  <span class=\"sr-only\">Marcar como Pagado</span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <button class=\"button icon info\">\r\n");
      out.write("                  <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                    <path d=\"M14 18V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v11a1 1 0 0 0 1 1h2\"></path>\r\n");
      out.write("                    <path d=\"M15 18H9\"></path>\r\n");
      out.write("                    <path d=\"M19 18h2a1 1 0 0 0 1-1v-3.65a1 1 0 0 0-.22-.624l-3.48-4.35A1 1 0 0 0 17.52 8H14\"></path>\r\n");
      out.write("                    <circle cx=\"17\" cy=\"18\" r=\"2\"></circle>\r\n");
      out.write("                    <circle cx=\"7\" cy=\"18\" r=\"2\"></circle>\r\n");
      out.write("                  </svg>\r\n");
      out.write("                  <span class=\"sr-only\">Marcar como Listo para Enviar</span>\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><span class=\"badge paid\">Pagado por Nequi</span></td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div class=\"font-medium\">Carlos Rodríguez</div>\r\n");
      out.write("              <div class=\"text-muted\">Calle 67 #89-12, Cali</div>\r\n");
      out.write("              <div class=\"text-muted\">+57 456 789 012</div>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div>Aspirina x 1</div>\r\n");
      out.write("              <div>Loratadina x 2</div>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>$35.00</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div class=\"actions\">\r\n");
      out.write("                <button class=\"button icon info\">\r\n");
      out.write("                  <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                    <path d=\"M14 18V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v11a1 1 0 0 0 1 1h2\"></path>\r\n");
      out.write("                    <path d=\"M15 18H9\"></path>\r\n");
      out.write("                    <path d=\"M19 18h2a1 1 0 0 0 1-1v-3.65a1 1 0 0 0-.22-.624l-3.48-4.35A1 1 0 0 0 17.52 8H14\"></path>\r\n");
      out.write("                    <circle cx=\"17\" cy=\"18\" r=\"2\"></circle>\r\n");
      out.write("                    <circle cx=\"7\" cy=\"18\" r=\"2\"></circle>\r\n");
      out.write("                  </svg>\r\n");
      out.write("                  <span class=\"sr-only\">Marcar como Listo para Enviar</span>\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><span class=\"badge paid\">Pagado por Contraentrega</span></td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div class=\"font-medium\">Ana Martínez</div>\r\n");
      out.write("              <div class=\"text-muted\">Carrera 45 #78-90, Barranquilla</div>\r\n");
      out.write("              <div class=\"text-muted\">+57 789 012 345</div>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div>Omeprazol x 1</div>\r\n");
      out.write("              <div>Acetaminofén x 2</div>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>$45.00</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              <div class=\"actions\">\r\n");
      out.write("                <button class=\"button icon info\">\r\n");
      out.write("                  <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("                    <path d=\"M14 18V6a2 2 0 0 0-2-2H4a2 2 0 0 0-2 2v11a1 1 0 0 0 1 1h2\"></path>\r\n");
      out.write("                    <path d=\"M15 18H9\"></path>\r\n");
      out.write("                    <path d=\"M19 18h2a1 1 0 0 0 1-1v-3.65a1 1 0 0 0-.22-.624l-3.48-4.35A1 1 0 0 0 17.52 8H14\"></path>\r\n");
      out.write("                    <circle cx=\"17\" cy=\"18\" r=\"2\"></circle>\r\n");
      out.write("                    <circle cx=\"7\" cy=\"18\" r=\"2\"></circle>\r\n");
      out.write("                  </svg>\r\n");
      out.write("                  <span class=\"sr-only\">Marcar como Listo para Enviar</span>\r\n");
      out.write("                </button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("   \r\n");
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
