package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=\"UTF-8\">\r\n");
      out.write("              <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Farma-online</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/PQR.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");

            if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
                response.sendRedirect("../Vistas/LogginPage.jsp");
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Navbar -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light navbar-custom\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"/FarmaciaWeb/CtrProductoLi?accion=home\">\r\n");
      out.write("                <img src=\"/FarmaciaWeb/Imagenes/lo-removebg-preview.png\" class=\"icon\" width=\"60\" height=\"60\" alt=\"Farmacia Yasbel\"/>\r\n");
      out.write("                Farmacia Yasbel\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0 mr-auto\" action=\"/FarmaciaWeb/CtrProductoLi?accion=buscar\" method=\"post\">\r\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Buscar productos...\" aria-label=\"Search\" name=\"busqueda\">\r\n");
      out.write("                    <button class=\"btn-search my-2 my-sm-0\" type=\"submit\">\r\n");
      out.write("                        <div class=\"original\">BUSCAR</div>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"navbar-nav\">\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle nav-text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"bi bi-person\"></i> Mi Cuenta\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                            <a class=\"dropdown-item text-center\" href=\"#\"><i class=\"bi bi-person\"></i></a>\r\n");
      out.write("                            <a class=\"dropdown-item \"  data-bs-toggle=\"modal\" data-bs-target=\"#editarusuario\" href=\"/FarmaciaWeb/CtrUsuarioCre?accion=editarusuarios&idss=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsuid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsunombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                            <a class=\"dropdown-item \" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsutipo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"/FarmaciaWeb/CtrProductoLi?accion=historial\">Historial Pedido</a>\r\n");
      out.write("                            <a class=\"dropdown-item\"  data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">PQR</a>\r\n");
      out.write("                            <a class=\"dropdown-item text-danger\" href=\"/FarmaciaWeb/CtrProductoLi?accion=salir\">Cerrar Sesion</a>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link nav-text-white\" href=\"CtrProductoLi?accion=carro\">\r\n");
      out.write("                            <i class=\"bi bi-cart-check-fill\"></i> Carrito\r\n");
      out.write("                            (<label style=\"color: darkorange\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>)\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle nav-text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"bi bi-bookmark\"></i> Comprar por categorías\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("            <div class=\"carousel-inner\">\r\n");
      out.write("                <div class=\"carousel-item active\">\r\n");
      out.write("                    <div class=\"carousel-content\">\r\n");
      out.write("                        <img class=\"d-block w-100 large-image\" src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" alt=\"First slide\">\r\n");
      out.write("                        <div class=\"mini-images\">\r\n");
      out.write("                            <img class=\"mini-image\" src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" alt=\"Mini First slide\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                        <div class=\"promo-banner\">\r\n");
      out.write("                            <span>HEY! <strong>2x1</strong> En medicamentos!</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <div class=\"carousel-content\">\r\n");
      out.write("                        <img class=\"d-block w-100 large-image\" src=\"/FarmaciaWeb/Imagenes/regencia.jpg\" alt=\"Second slide\">\r\n");
      out.write("                        <div class=\"mini-images\">\r\n");
      out.write("                            <img class=\"mini-image\" src=\"/FarmaciaWeb/Imagenes/regencia.jpg\" alt=\"Mini Second slide\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                        <div class=\"promo-banner\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"carousel-item\">\r\n");
      out.write("                    <div class=\"carousel-content\">\r\n");
      out.write("                        <img class=\"d-block w-100 large-image\" src=\"/FarmaciaWeb/Imagenes/regencia.jpg\" alt=\"Third slide\">\r\n");
      out.write("                        <div class=\"mini-images\">\r\n");
      out.write("                            <img class=\"mini-image\" src=\"/FarmaciaWeb/Imagenes/regencia.jpg\" alt=\"Mini Third slide\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                        <div class=\"promo-banner\">\r\n");
      out.write("                            <span>HEY! <strong>2x1</strong> En medicamentos!</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"sr-only\">Previous</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"sr-only\">Next</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"offer-banner\"> \r\n");
      out.write("            <p class=\"offer-text\">Explora nuestros <span class=\"discount\">15% de Descuento</span> en la Farmacia Yasbel</p>\r\n");
      out.write("            <div class=\"offer-cards\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"rotating-light\"></div>\r\n");
      out.write("            <div class=\"carousel-controls\">\r\n");
      out.write("                <button class=\"carousel-prev\">&lt;</button>\r\n");
      out.write("                <button class=\"carousel-next\">&gt;</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <br>            \r\n");
      out.write("        <!-- Products Section -->\r\n");
      out.write("        <section id=\"productos\" class=\"product-container\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("        <footer class=\"py-5 bg-dark text-white\" id=\"footer\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <h5 class=\"footer-heading\">Información</h5>\r\n");
      out.write("                        <p class=\"footer-text\">Dirección: Calle 51d#2g63</p>\r\n");
      out.write("                        <p class=\"footer-text\">Teléfono: 324 6794400</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <h5 class=\"footer-heading\">Métodos de Pago</h5>\r\n");
      out.write("                        <div class=\"payment-methods\">\r\n");
      out.write("                            <a href=\"#\"><img src=\"../img/nequi.png\" alt=\"Nequi\" class=\"payment-icon\"></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <h5 class=\"footer-heading\">Redes Sociales</h5>\r\n");
      out.write("                        <div class=\"social-links\">\r\n");
      out.write("                            <a href=\"#\" class=\"social-link\"><i class=\"bi bi-facebook\"></i> Facebook</a><br>\r\n");
      out.write("                            <a href=\"#\" class=\"social-link\"><i class=\"bi bi-instagram\"></i> Instagram</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"footer-bottom mt-4\">\r\n");
      out.write("                    <p class=\"footer-text\">Tu salud, nuestra prioridad. Descubre la comodidad de cuidarte desde casa con nuestra droguería en línea. Expertos en bienestar a solo un clic.</p>\r\n");
      out.write("                    <div class=\"footer-buttons\">\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-light footer-btn\">Términos de servicio</a>\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-light footer-btn\">Política de privacidad</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">Sistema de PQR</h1>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form action=\"/FarmaciaWeb/CtrPQR?accion=CrearPQR\" method=\"POST\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"name\">Nombre</label>\r\n");
      out.write("                                <input id=\"name\" name=\"nombre\" class=\"nombre\" type=\"text\" placeholder=\"Ingrese su nombre\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"email\">Correo electrónico</label>\r\n");
      out.write("                                <input id=\"email\" name=\"correo\" type=\"email\" class=\"email\" placeholder=\"Ingrese su correo\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"phone\">Teléfono</label>\r\n");
      out.write("                                <input id=\"telefono\" class=\"telefono\" name=\"telefono\" type=\"text\" placeholder=\"Ingrese su teléfono\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"type\">Tipo de solicitud</label>\r\n");
      out.write("                                <select id=\"type\" name=\"tipo\" class=\"tipo\">\r\n");
      out.write("                                    <option value=\"\" disabled selected>Seleccione una opción</option>\r\n");
      out.write("                                    <option value=\"peticion\">Petición</option>\r\n");
      out.write("                                    <option value=\"queja\">Queja</option>\r\n");
      out.write("                                    <option value=\"consulta\">Consulta</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"id\" id=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsuid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                <label for=\"description\">Descripción de la solicitud</label>\r\n");
      out.write("                                <textarea id=\"descripcion\" class=\"descripcion\" name=\"descripcion\" placeholder=\"Ingrese los detalles de su solicitud\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" name=\"accion\" value=\"CrearPQR\" class=\"button\">Enviar</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\" id=\"modal\">\r\n");
      out.write("                        <p>Si el problema persiste, llame a la línea +123-456-789</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("                                \r\n");
      out.write("        <div class=\"modal fade\" id=\"editarusuario\" tabindex=\"-1\" aria-labelledby=\"usuarioModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">Editar Usuario</h1>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form class=\"form-sing\" action=\"/AppWeb/CtrProducto?accion=actualizarpro\" method=\"POST\" >\r\n");
      out.write("                            <div class=\"form-row\">\r\n");
      out.write("                                <div class=\"col-6\">\r\n");
      out.write("                                    <label>Nombre</label> \r\n");
      out.write("                                    <input type=\"hidden\" class=\"form-control\" name=\"txtid\" id=\"txtid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarios.getUsuId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"txtnombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarios.getUsunombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"nombre\" required=\"\">\r\n");
      out.write("                                </div>  \r\n");
      out.write("                                <div class=\"col-6\">\r\n");
      out.write("                                    <label>Precio</label> \r\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" name=\"txtprecio\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"precio\" required=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-6\">\r\n");
      out.write("                                    <label>Descripcion</label> \r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"txtdescripcion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"descripcion\" required=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-6\">\r\n");
      out.write("                                    <label>Stock</label> \r\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getStok()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtstock\" placeholder=\"disponibilidad\" required=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                                <center>\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary mt-4 mb-2 formulario_btn\" name=\"btnagregar\" value=\"Agregar\">Agregar <i class=\"bi bi-floppy\"></i></button>\r\n");
      out.write("                                    <a class=\"btn btn-danger formulario_btn mt-4 mb-2\" name=\"regresar\" href=\"#\">Regresar <i class=\"bi bi-box-arrow-left\"></i></a>\r\n");
      out.write("                                </center>\r\n");
      out.write("                            \r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Scripts -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("                integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"/FarmaciaWeb/JS/Ofertas_home.js\" type=\"text/javascript\"></script>\r\n");
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
    _jspx_th_c_forEach_0.setVar("c");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categorias}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <a class=\"dropdown-item\" href=\"/FarmaciaWeb/CtrProductoLi?accion=buscarcat&catid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getCatCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    <i class=\"bi bi-bookmarks\"></i> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getCatNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                </a>\r\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("prod");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${descuento}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"offer-card\">\r\n");
          out.write("                        <div class=\"card-header\">\r\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProFoto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"card-image\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                            <div class=\"discount-badge\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProDescuento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%</div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                        <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                        <p class=\"card-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                        <p class=\"card-price\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                        <div class=\"card-buttons\">\r\n");
          out.write("                            <a href=\"/FarmaciaWeb/CtrProductoLi?accion=Comprar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-primary\">Comprar</a>\r\n");
          out.write("                            <a href=\"/FarmaciaWeb/CtrProductoLi?accion=AgregarCarrito&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-secondary\">Agregar al carrito</a>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("prod");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-md-3 col-sm-6 mb-4\"> \r\n");
          out.write("                            <div class=\"card h-100\">\r\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProFoto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"card-img-top\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                <div class=\"card-body d-flex flex-column\">\r\n");
          out.write("                                    <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                                    <p class=\"card-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                    <p class=\"card-text\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                    <div class=\"mt-auto\">\r\n");
          out.write("                                        <a href=\"/FarmaciaWeb/CtrProductoLi?accion=Comprar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  class=\"btn btn-primary\">Comprar</a>\r\n");
          out.write("                                        <a href=\"/FarmaciaWeb/CtrProductoLi?accion=AgregarCarrito&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-primary\">Agregar al carrito</a>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
