package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LogginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <link href=\"FarmaciaWeb/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.10.5/font/bootstrap-icons.min.css\" integrity=\"sha512-ZnR2wlLbSbr8/c9AgLg3jQPAattCUImNsae6NHYnS9KrIwRdcY9DxFotXhNAKIKbAXlRnujIqUWoXXwqyFOeIQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/LoginPage.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/registrer_login.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    ");

        String Mensaje = "";
        if (request.getParameter("fallo") != null) {
            int i = Integer.parseInt(request.getParameter("fallo"));
            if (i == 0) {
                Mensaje = "usuario y/o contraseña incorrecta";
            }
        }

        if (request.getParameter("mensaje") != null) {
            int i = Integer.parseInt(request.getParameter("mensaje"));
            if (i == 0) {
                Mensaje = "usuario creado , por favor inicie sesión";
            }
        }
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"form sign_in\">\r\n");
      out.write("                    <img src=\"/FarmaciaWeb/Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\r\n");
      out.write("                    <h3>Iniciar sesión</h3>\r\n");
      out.write("                    <form action=\"/FarmaciaWeb/CtrValidarInfo\" id=\"form_input\" method=\"post\">\r\n");
      out.write("                        <div class=\"type\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"Usuario\" id=\"email\" name=\"txtusu\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"type\">\r\n");
      out.write("                            <input type=\"password\" placeholder=\"Contraseña\" id=\"password\" name=\"txtpass\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"forgot\">\r\n");
      out.write("                            <a href=\"/FarmaciaWeb/CtrProductoLi?accion=olvido\">¿Olvidó su contraseña?</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Ingresar\" class=\"btn bkg\">\r\n");
      out.write("                        <p style=\"Color: green;\">");
      out.print(Mensaje);
      out.write("</p>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form sign_up\">\r\n");
      out.write("                    <img src=\"/FarmaciaWeb/Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\r\n");
      out.write("                    <h3>Regístrate</h3>\r\n");
      out.write("                    <form action=\"/FarmaciaWeb/CtrUsuarioCre?accion=nuevo\" id=\"formulario\" class=\"form_input2\" method=\"get\">\r\n");
      out.write("                        <div class=\"grid-container\">\r\n");
      out.write("                            <div class=\"type\" id=\"grupo_identificacion\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Número de identificación\" name=\"id\" id=\"id\" class=\"id\" required pattern=\"\\d{7,10}\">\r\n");
      out.write("                                <i class=\"bi bi-check-circle\"></i>\r\n");
      out.write("                                <p class=\"formulario_input-error\">¡El documento ingresado no es válido!</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"type\" id=\"grupo_nombre\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Nombre\" id=\"nombre\" class=\"nombre\" name=\"nombre\" required>\r\n");
      out.write("                                <i class=\"bi bi-check-circle\"></i>\r\n");
      out.write("                                <p class=\"formulario_input-error\">¡Nombre no valido!</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\" id=\"grupo_apellido\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Apellido\" name=\"apellido\" id=\"apellido\" class=\"apellido\" required>\r\n");
      out.write("                                <i class=\"bi bi-check-circle\"></i>\r\n");
      out.write("                                <p class=\"formulario_input-error\">¡Apellido no valido!</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\" id=\"grupo_direccion\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Dirección\" id=\"direccion\" class=\"direccion\" name=\"direccion\" required>\r\n");
      out.write("                                <i class=\"bi bi-check-circle\"></i>\r\n");
      out.write("                                <p class=\"formulario_input-error\">La dirección debe tener entre 4 y 40 caracteres.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\" id=\"grupo_telefono\">\r\n");
      out.write("                                <input type=\"tel\" placeholder=\"Teléfono\" id=\"telefono\" class=\"telefono\" name=\"telefono\" required pattern=\"[0-9]{10}\">\r\n");
      out.write("                                <i class=\"bi bi-check-circle\"></i>\r\n");
      out.write("                                <p class=\"formulario_input-error\">El teléfono debe tener 10 dígitos.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\" id=\"grupo_correo\">\r\n");
      out.write("                                <input type=\"email\" placeholder=\"Correo\" id=\"email\" class=\"email\" name=\"email\" required>\r\n");
      out.write("                                <i class=\"bi bi-check-circle\"></i>\r\n");
      out.write("                                <p class=\"formulario_input-error\">El correo no es válido.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"type\" id=\"grupo_usuario\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Usuario\" id=\"usuario\" class=\"usuario\" name=\"usuario\" required>\r\n");
      out.write("                                <i class=\"bi bi-check-circle\"></i>\r\n");
      out.write("                                <p class=\"formulario_input-error\">El usuario debe tener entre 4 y 20 caracteres.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\" id=\"grupo_contrasena\">\r\n");
      out.write("                                <input type=\"password\" placeholder=\"Contraseña\" id=\"contrasena\" class=\"contrasena\" name=\"contrasena\" required>\r\n");
      out.write("                                <i class=\"bi bi-check-circle\"></i>\r\n");
      out.write("                                <p class=\"formulario_input-error\">La contraseña debe tener minimo 6 dijitos</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\" id=\"grupo_contrasena2\">\r\n");
      out.write("                                <input type=\"password\" placeholder=\"Confirmar contraseña\" id=\"contrasena2\" class=\"contrasena2\" name=\"contrasena2\" required>\r\n");
      out.write("                                <i class=\"bi bi-check-circle\"></i>\r\n");
      out.write("                                <p class=\"formulario_input-error\">Las contraseñas no coinciden.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn bkg\" name=\"accion\" value=\"nuevo\">Guardar <i class=\"bi bi-floppy\"></i></button>\r\n");
      out.write("                        <br><br>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"overlay\">\r\n");
      out.write("                <div class=\"page page_signIn\">\r\n");
      out.write("                    <img src=\"/FarmaciaWeb/Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\r\n");
      out.write("                    <h3>¡Bienvenido!</h3>\r\n");
      out.write("                    <p>Para continuar con nosotros, inicie sesión con sus datos personales.</p>\r\n");
      out.write("                    <button class=\"btn btnSign-in\">Regístrate <i class=\"bi bi-arrow-right\"></i></button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"page page_signUp\">\r\n");
      out.write("                    <img src=\"/FarmaciaWeb/Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\r\n");
      out.write("                    <h3>¡Bienvenido!</h3>\r\n");
      out.write("                    <p>Ingresa tus datos personales</p>\r\n");
      out.write("                    <button class=\"btn btnSign-up\"><i class=\"bi bi-arrow-left\"></i> Iniciar sesión</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script src=\"/FarmaciaWeb/JS/LoginPage.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"/FarmaciaWeb/JS/ValidarDatos.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
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
