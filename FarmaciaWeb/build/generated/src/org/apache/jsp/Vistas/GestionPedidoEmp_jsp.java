package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GestionPedidoEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"gestion-pedido-cliente.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         <div class=\"container mt-4\">\r\n");
      out.write("    <h1 class=\"text-2xl font-bold mb-6\">Gestión de Pedidos</h1>\r\n");
      out.write("    <div class=\"row g-4\">\r\n");
      out.write("      <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("            <h2 class=\"card-title\">Por Pagar</h2>\r\n");
      out.write("            <div class=\"mb-4\">\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                <div>\r\n");
      out.write("                  <p class=\"fw-medium\">Pedido #123</p>\r\n");
      out.write("                  <p class=\"text-muted small\">Hace 3 días</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"btn btn btn-sm\" style=\"background-color: #74BD64;\">Pagar</button>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center mt-2\">\r\n");
      out.write("                <div>\r\n");
      out.write("                  <p class=\"fw-medium\">Pedido #456</p>\r\n");
      out.write("                  <p class=\"text-muted small\">Hace 5 días</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"btn btn btn-sm\" style=\"background-color: #74BD64;\">Pagar</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("            <h2 class=\"card-title\">Por Enviar</h2>\r\n");
      out.write("            <div class=\"mb-4\">\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                <div>\r\n");
      out.write("                  <p class=\"fw-medium\">Pedido #789</p>\r\n");
      out.write("                  <p class=\"text-muted small\">Pagado hace 2 días</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"btn btn btn-sm\" style=\"background-color: #74BD64;\">Enviar</button>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center mt-2\">\r\n");
      out.write("                <div>\r\n");
      out.write("                  <p class=\"fw-medium\">Pedido #321</p>\r\n");
      out.write("                  <p class=\"text-muted small\">Pagado hace 4 días</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"btn btn btn-sm\" style=\"background-color: #74BD64;\">Enviar</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("            <h2 class=\"card-title\">Historial de Compras</h2>\r\n");
      out.write("            <div class=\"mb-4\">\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                <div>\r\n");
      out.write("                  <p class=\"fw-medium\">Pedido #159</p>\r\n");
      out.write("                  <p class=\"text-muted small\">Entregado el 15/04/2023</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"#\" class=\"text\" style=\"color: #74BD64;\">Ver Detalles</a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"d-flex justify-content-between align-items-center mt-2\">\r\n");
      out.write("                <div>\r\n");
      out.write("                  <p class=\"fw-medium\">Pedido #753</p>\r\n");
      out.write("                  <p class=\"text-muted small\">Entregado el 10/03/2023</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"#\" class=\"text\" style=\"color: #74BD64;\">Ver Detalles</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"card mt-4\">\r\n");
      out.write("      <div class=\"card-body\">\r\n");
      out.write("        <h2 class=\"card-title\">En Camino</h2>\r\n");
      out.write("        <div class=\"mb-4\">\r\n");
      out.write("          <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("            <div class=\"d-flex align-items-center\">\r\n");
      out.write("              <p class=\"fw-medium ms-2\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-truck\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                <path d=\"M0 3.5A1.5 1.5 0 0 1 1.5 2h9A1.5 1.5 0 0 1 12 3.5V5h1.02a1.5 1.5 0 0 1 1.17.563l1.481 1.85a1.5 1.5 0 0 1 .329.938V10.5a1.5 1.5 0 0 1-1.5 1.5H14a2 2 0 1 1-4 0H5a2 2 0 1 1-3.998-.085A1.5 1.5 0 0 1 0 10.5zm1.294 7.456A2 2 0 0 1 4.732 11h5.536a2 2 0 0 1 .732-.732V3.5a.5.5 0 0 0-.5-.5h-9a.5.5 0 0 0-.5.5v7a.5.5 0 0 0 .294.456M12 10a2 2 0 0 1 1.732 1h.768a.5.5 0 0 0 .5-.5V8.35a.5.5 0 0 0-.11-.312l-1.48-1.85A.5.5 0 0 0 13.02 6H12zm-9 1a1 1 0 1 0 0 2 1 1 0 0 0 0-2m9 0a1 1 0 1 0 0 2 1 1 0 0 0 0-2\"/>\r\n");
      out.write("              </svg> Pedido #951</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"text-muted small\">Enviado el 20/04/2023</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"d-flex justify-content-between align-items-center mt-2\">\r\n");
      out.write("            <div class=\"d-flex align-items-center\">\r\n");
      out.write("              <p class=\"fw-medium ms-2\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-truck\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                <path d=\"M0 3.5A1.5 1.5 0 0 1 1.5 2h9A1.5 1.5 0 0 1 12 3.5V5h1.02a1.5 1.5 0 0 1 1.17.563l1.481 1.85a1.5 1.5 0 0 1 .329.938V10.5a1.5 1.5 0 0 1-1.5 1.5H14a2 2 0 1 1-4 0H5a2 2 0 1 1-3.998-.085A1.5 1.5 0 0 1 0 10.5zm1.294 7.456A2 2 0 0 1 4.732 11h5.536a2 2 0 0 1 .732-.732V3.5a.5.5 0 0 0-.5-.5h-9a.5.5 0 0 0-.5.5v7a.5.5 0 0 0 .294.456M12 10a2 2 0 0 1 1.732 1h.768a.5.5 0 0 0 .5-.5V8.35a.5.5 0 0 0-.11-.312l-1.48-1.85A.5.5 0 0 0 13.02 6H12zm-9 1a1 1 0 1 0 0 2 1 1 0 0 0 0-2m9 0a1 1 0 1 0 0 2 1 1 0 0 0 0-2\"/>\r\n");
      out.write("              </svg> Pedido #357</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p class=\"text-muted small\">Enviado el 18/04/2023</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row g-4 mt-4\">\r\n");
      out.write("      <div class=\"col-md-3\">\r\n");
      out.write("        <div class=\"card text-center\">\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("            <p class=\"display-4 fw-bold\">120</p>\r\n");
      out.write("            <p class=\"text-muted\">Total de Pedidos</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-3\">\r\n");
      out.write("        <div class=\"card text-center\">\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("            <p class=\"display-4 fw-bold\">45</p>\r\n");
      out.write("            <p class=\"text-muted\">Pedidos Activos</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-3\">\r\n");
      out.write("        <div class=\"card text-center\">\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("            <p class=\"display-4 fw-bold\">30</p>\r\n");
      out.write("            <p class=\"text-muted\">Pedidos en Proceso</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-3\">\r\n");
      out.write("        <div class=\"card text-center\">\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("            <p class=\"display-4 fw-bold\">75</p>\r\n");
      out.write("            <p class=\"text-muted\">Pedidos Entregados</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"mt-4\">\r\n");
      out.write("      <p class=\"text-muted d-flex align-items-center gap-2\">\r\n");
      out.write("        <svg class=\"icon icon-clock\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("          <circle cx=\"12\" cy=\"12\" r=\"10\"/>\r\n");
      out.write("          <polyline points=\"12 6 12 12 16 14\"/>\r\n");
      out.write("        </svg>\r\n");
      out.write("        Proceso de pedidos rápido y eficiente.\r\n");
      out.write("        <a href=\"#\" class=\"text\" style=\"color: #74BD64;\">Más información</a>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p class=\"text-muted d-flex align-items-center gap-2 mt-2\">\r\n");
      out.write("        <svg class=\"icon icon-circle-plus\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("          <circle cx=\"12\" cy=\"12\" r=\"10\"/>\r\n");
      out.write("          <path d=\"M8 12h8\"/>\r\n");
      out.write("          <path d=\"M12 8v8\"/>\r\n");
      out.write("        </svg>\r\n");
      out.write("        Total de\r\n");
      out.write("        <a href=\"#\" class=\"text\" style=\"color: #74BD64;\">120 pedidos</a>\r\n");
      out.write("      </p>\r\n");
      out.write("      <p class=\"text-muted d-flex align-items-center gap-2 mt-2\">\r\n");
      out.write("        <svg class=\"icon icon-phone\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\r\n");
      out.write("          <path d=\"M22 16.92v3a2 2 0 0 1-2.18 2 19.79 19.79 0 0 1-8.63-3.07 19.5 19.5 0 0 1-6-6 19.79 19.79 0 0 1-3.07-8.63A2 2 0 0 1 8.08 2h3a2 2 0 0 1 1.57.65l1.45 1.45a2 2 0 0 1 .27 2.07 11.95 11.95 0 0 1-1.42 2.38c-.74.74-1.53 1.4-2.39 1.97s-1.61 1.16-2.43 1.64a2 2 0 0 0-.35 3.07l3.2 3.2a2 2 0 0 0 3.07-.35c.48-.82 1.05-1.64 1.64-2.43.57-.86 1.23-1.66 1.97-2.39a11.95 11.95 0 0 1 2.38-1.42 2 2 0 0 1 2.07.27l1.45 1.45A2 2 0 0 1 22 15.92z\"/>\r\n");
      out.write("        </svg>\r\n");
      out.write("        Contáctanos al\r\n");
      out.write("        <a href=\"tel:+123456789\" class=\"text\" style=\"color: #74BD64;\"> +123 456 789</a>\r\n");
      out.write("      </p>\r\n");
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
