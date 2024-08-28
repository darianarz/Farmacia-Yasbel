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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <link href=\"FarmaciaWeb/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.10.5/font/bootstrap-icons.min.css\" integrity=\"sha512-ZnR2wlLbSbr8/c9AgLg3jQPAattCUImNsae6NHYnS9KrIwRdcY9DxFotXhNAKIKbAXlRnujIqUWoXXwqyFOeIQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/LoginPage.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    ");
String Mensaje = "";
        if (request.getParameter("fallo") != null) {
            int i = Integer.parseInt(request.getParameter("fallo"));
            if (i == 0) {
                Mensaje = "usuario y/o contraseña incorrecta";
            }
        }
    
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"form sign_in\">\r\n");
      out.write("                    \r\n");
      out.write("                    <img src=\"../Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\r\n");
      out.write("                    <h3>Iniciar sesión</h3>\r\n");
      out.write("\r\n");
      out.write("                    <form action=\"/FarmaciaWeb/CtrValidarInfo\" id=\"form_input\" method=\"post\">\r\n");
      out.write("                        <div class=\"type\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"Correo Electronico\" id=\"email\" name=\"txtusu\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"type\">\r\n");
      out.write("                            <input type=\"password\" placeholder=\"Contraseña\" id=\"password\" name=\"txtpass\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"forgot\">\r\n");
      out.write("                            <span>¿Olvidó su contraseña?</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Ingresar\" class=\"btn bkg\">\r\n");
      out.write("                        <p style=\"Color: red;\">");
      out.print(Mensaje );
      out.write("</p>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form sign_up\">\r\n");
      out.write("                    <img src=\"../Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\r\n");
      out.write("                    <h3>Regístrate</h3>\r\n");
      out.write("                    <form action=\"/FarmaciaWeb/CtrUsuarioCre?accion=nuevo\" id=\"form_input\" class=\"form_input2\">\r\n");
      out.write("                        <div class=\"grid-container\">\r\n");
      out.write("                            <div class=\"type\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Número de identificación\" name=\"id\" id=\"id\" class=\"id\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Nombre\" id=\"nombre\" class=\"nombre\" name=\"nombre\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Apellido\" name=\"apellido\" id=\"apellido\" class=\"apellido\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\">\r\n");
      out.write("                                <input  type=\"text\" placeholder=\"Dirección\" id=\"direccion\" class=\"direccion\" name=\"direccion\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\">\r\n");
      out.write("                                <input type=\"number\" placeholder=\"Teléfono\" id=\"telefono\" class=\"telefono\" name=\"telefono\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\">\r\n");
      out.write("                                <input type=\"email\" placeholder=\"Correo\" id=\"email\" class=\"email\" name=\"email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"type\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"usuario\" id=\"usuario\" class=\"usuario\" name=\"usuario\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"type\">\r\n");
      out.write("                                <input type=\"password\" placeholder=\"Contraseña\" id=\"contrasena\" class=\"contrasena\" name=\"contrasena\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"col formulario_grupo\" id=\"grupo_tipo\">\r\n");
      out.write("                            <label for=\"tipo\" class=\"formulario_label\">Tipo</label> \r\n");
      out.write("                            <div class=\"formulario_grupo-input\">\r\n");
      out.write("                                <select class=\"form-control formulario_input\" name=\"tipo\" id=\"tipo\">\r\n");
      out.write("                                    <option value=\"Administrador\">Administrador</option> \r\n");
      out.write("                                    <option value=\"Usuario\">Usuario</option> \r\n");
      out.write("                                    <option value=\"Invitado\">Invitado</option> \r\n");
      out.write("                                    <option value=\"Cliente\">Cliente</option> \r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                         <button type=\"submit\" class=\"btn bkg\" name=\"accion\" value=\"nuevo\">Guardar <i class=\"bi bi-floppy\"></i></button>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"overlay\">\r\n");
      out.write("                <div class=\"page page_signIn\">\r\n");
      out.write("                    <img src=\"../Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\r\n");
      out.write("                    <h3>¡Bienvenido!</h3>\r\n");
      out.write("                    <p>Para continuar con nosotros, inicie sesión con sus datos personales.</p>\r\n");
      out.write("                    <button class=\"btn btnSign-in\">Regístrate <i class=\"bi bi-arrow-right\"></i></button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"page page_signUp\">\r\n");
      out.write("                    <img src=\"../Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\r\n");
      out.write("                    <h3>¡Bienvenido!</h3>\r\n");
      out.write("                    <p>Ingresa tus datos personales</p>\r\n");
      out.write("                    <button class=\"btn btnSign-up\"><i class=\"bi bi-arrow-left\"></i> Iniciar sesión</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"../JS/LoginPage.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"../JS/ValidarDatos.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
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
