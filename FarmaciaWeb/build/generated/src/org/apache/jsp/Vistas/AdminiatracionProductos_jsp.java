package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminiatracionProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <title>Yasbel Drugs - Administración de Productos</title>\r\n");
      out.write("          <link href=\"../CSS/Gestion.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <div class=\"container\">\r\n");
      out.write("    <h1 class=\"title\">Yasbel Drugs - Administración de Productos</h1>\r\n");
      out.write("    <div class=\"grid\">\r\n");
      out.write("      <div class=\"form-section\">\r\n");
      out.write("        <h2 class=\"subtitle\">Agregar Nuevo Producto</h2>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"name\">Nombre</label>\r\n");
      out.write("          <input id=\"name\" name=\"name\" type=\"text\" placeholder=\"Nombre del Producto\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"description\">Descripción</label>\r\n");
      out.write("          <textarea id=\"description\" name=\"description\" placeholder=\"Descripción del Producto\"></textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("        <select id=\"category\" name=\"category\">\r\n");
      out.write("          <option value=\"\" disabled selected>Selecciona una categoría</option>\r\n");
      out.write("          <option value=\"Categoria 1\">Anti-pirectico</option>\r\n");
      out.write("          <option value=\"Categoria 2\">Desinflamatorio</option>\r\n");
      out.write("          <option value=\"Categoria 3\">Sales de Rehidratación</option>\r\n");
      out.write("          <option value=\"Categoria 4\">Anti-Diarreica</option>\r\n");
      out.write("          <option value=\"Categoria 4\">Sistema digestivo y Metabolico</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"price\" style=\"padding-top: 10px;\">Stock</label>\r\n");
      out.write("          <input id=\"price\" name=\"price\" type=\"number\" placeholder=\"Cantidad\">\r\n");
      out.write("        </div>      \r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"price\">Precio</label>\r\n");
      out.write("          <input id=\"price\" name=\"price\" type=\"number\" placeholder=\"Precio del Producto\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("          <label for=\"imageUrl\">URL de la Imagen</label>\r\n");
      out.write("          <input id=\"imageUrl\" name=\"imageUrl\" type=\"text\" placeholder=\"URL de la Imagen\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <button class=\"button\">Agregar Producto</button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"products-section\">\r\n");
      out.write("        <h2 class=\"subtitle\">Productos Existentes</h2>\r\n");
      out.write("        <div class=\"product-card\">\r\n");
      out.write("          <div class=\"card-header\">\r\n");
      out.write("            <h3 class=\"card-title\">Panadol</h3>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"card-content\">\r\n");
      out.write("            <img src=\"../Imagenes/panadol-20s.png\" style=\"width: 250px; height: 250px;\" alt=\"Panadol\" class=\"product-image\">\r\n");
      out.write("            <p>Analgésico para el dolor de cabeza</p>\r\n");
      out.write("            <div class=\"card-footer\">\r\n");
      out.write("              <span class=\"price\">$5.999</span>\r\n");
      out.write("              <button class=\"button small\">Editar</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Repeat similar blocks for other products -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> \r\n");
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
