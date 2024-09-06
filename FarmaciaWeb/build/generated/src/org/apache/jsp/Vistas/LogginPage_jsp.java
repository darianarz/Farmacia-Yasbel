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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <link href=\"FarmaciaWeb/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.10.5/font/bootstrap-icons.min.css\" integrity=\"sha512-ZnR2wlLbSbr8/c9AgLg3jQPAattCUImNsae6NHYnS9KrIwRdcY9DxFotXhNAKIKbAXlRnujIqUWoXXwqyFOeIQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/LoginPage.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    ");
String Mensaje = "";
        if (request.getParameter("fallo") != null) {
            int i = Integer.parseInt(request.getParameter("fallo"));
            if (i == 0) {
                Mensaje = "usuario y/o contraseña incorrecta";
            }
        }

    
      out.write("\n");
      out.write("    ");
String Mensaje1 = "";
        if (request.getParameter("mensaje") != null) {
            int i = Integer.parseInt(request.getParameter("mensaje"));
            if (i == 0) {
                Mensaje = "usuario creado , por favor inisie sesion";
            }
        }
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"form sign_in\">\n");
      out.write("\n");
      out.write("                    <img src=\"/FarmaciaWeb/Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\n");
      out.write("                    <h3>Iniciar sesión</h3>\n");
      out.write("\n");
      out.write("                    <form action=\"/FarmaciaWeb/CtrValidarInfo\" id=\"form_input\" method=\"post\">\n");
      out.write("                        <div class=\"type\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Usuario\" id=\"email\" name=\"txtusu\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"type\">\n");
      out.write("                            <input type=\"password\" placeholder=\"Contraseña\" id=\"password\" name=\"txtpass\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"forgot\">\n");
      out.write("                            <span>¿Olvidó su contraseña?</span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Ingresar\" class=\"btn bkg\">\n");
      out.write("                     \n");
      out.write("                        <p style=\"Color: green;\">");
      out.print(Mensaje1);
      out.write("</p>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form sign_up\">\n");
      out.write("                    <img src=\"../Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\n");
      out.write("                    <h3>Regístrate</h3>\n");
      out.write("                    <form action=\"/FarmaciaWeb/CtrUsuarioCre?accion=nuevo\" id=\"form_input\" class=\"form_input2\" method=\"get\">\n");
      out.write("                        <div class=\"grid-container\">\n");
      out.write("                            <div class=\"type\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Número de identificación\" name=\"id\" id=\"id\" class=\"id\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"type\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Nombre\" id=\"nombre\" class=\"nombre\" name=\"nombre\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"type\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Apellido\" name=\"apellido\" id=\"apellido\" class=\"apellido\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"type\">\n");
      out.write("                                <input  type=\"text\" placeholder=\"Dirección\" id=\"direccion\" class=\"direccion\" name=\"direccion\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"type\">\n");
      out.write("                                <input type=\"number\" placeholder=\"Teléfono\" id=\"telefono\" class=\"telefono\" name=\"telefono\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"type\">\n");
      out.write("                                <input type=\"email\" placeholder=\"Correo\" id=\"email\" class=\"email\" name=\"email\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"type\">\n");
      out.write("                                <input type=\"text\" placeholder=\"usuario\" id=\"usuario\" class=\"usuario\" name=\"usuario\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"type\">\n");
      out.write("                                <input type=\"password\" placeholder=\"Contraseña\" id=\"contrasena\" class=\"contrasena\" name=\"contrasena\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col formulario_grupo\" id=\"grupo_tipo\">\n");
      out.write("                                <label for=\"tipo\" class=\"formulario_label\">Tipo</label> \n");
      out.write("                                <div class=\"formulario_grupo-input\">\n");
      out.write("                                    <select class=\"form-control formulario_input\" name=\"tipo\" id=\"tipo\">\n");
      out.write("                                        <option value=\"Administrador\">Administrador</option> \n");
      out.write("                                        <option value=\"Usuario\">Usuario</option> \n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <button type=\"submit\" class=\"btn bkg\" name=\"accion\" value=\"nuevo\">Guardar <i class=\"bi bi-floppy\"></i></button>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"overlay\">\n");
      out.write("                <div class=\"page page_signIn\">\n");
      out.write("                    <img src=\"../Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\n");
      out.write("                    <h3>¡Bienvenido!</h3>\n");
      out.write("                    <p>Para continuar con nosotros, inicie sesión con sus datos personales.</p>\n");
      out.write("                    <button class=\"btn btnSign-in\">Regístrate <i class=\"bi bi-arrow-right\"></i></button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"page page_signUp\">\n");
      out.write("                    <img src=\"../Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\n");
      out.write("                    <h3>¡Bienvenido!</h3>\n");
      out.write("                    <p>Ingresa tus datos personales</p>\n");
      out.write("                    <button class=\"btn btnSign-up\"><i class=\"bi bi-arrow-left\"></i> Iniciar sesión</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"/FarmaciaWeb/JS/LoginPage.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/FarmaciaWeb/JS/ValidarDatos.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
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
