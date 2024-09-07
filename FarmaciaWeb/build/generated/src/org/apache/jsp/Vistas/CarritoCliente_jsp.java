package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CarritoCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\n");
      out.write("        <title>Listar Productos</title>\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/IndexAdmin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    ");

     //   if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
     //       response.sendRedirect("/FarmaciaWeb/Vistas/LogginPage.jsp");
     //   }
    
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 sidebar\">\n");
      out.write("                    <div class=\"header d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                        <a href=\"/FarmaciaWeb/CtrProductoLi?accion=home\" class=\"logo d-flex align-items-center text-light\">\n");
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
      out.write("                        <div class=\"collapsible\">\n");
      out.write("                            <button class=\"collapsible-trigger\">\n");
      out.write("                                Gestión de Productos\n");
      out.write("                                <svg class=\"icon\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\">\n");
      out.write("                                <path d=\"m9 18 6-6-6-6\"/>\n");
      out.write("                                </svg>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"collapsible-content\">\n");
      out.write("                                <a href=\"/FarmaciaWeb/CtrProductoLi?accion=inventario\" class=\"collapsible-link submenu-btn\">Inventario</a>\n");
      out.write("                                <a href=\"/FarmaciaWeb/CtrProductoLi?accion=gestion\" class=\"collapsible-link submenu-btn\">Procesamiento de Pedidos</a>\n");
      out.write("                                <a href=\"/FarmaciaWeb/CtrUsuarioCre?accion=Listar\" class=\"collapsible-link submenu-btn\">Gestión de Clientes</a>\n");
      out.write("                                <a href=\"/FarmaciaWeb/CtrProductoLi?accion=Listaradm\" class=\"collapsible-link submenu-btn\">Gestion de Productos</a>\n");
      out.write("                                <a href=\"/FarmaciaWeb/CtrPQR?accion=listarPQR\" class=\"collapsible-link submenu-btn\">PQR</a>\n");
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
      out.write("                                <a class=\"dropdown-item \" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsunombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                                <a class=\"dropdown-item \" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsutipo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                                <a class=\"dropdown-item text-danger\" href=\"/FarmaciaWeb/CtrProductoLi?accion=salir\">Cerrar Sesion</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </header>\n");
      out.write("                 \n");
      out.write("                        \n");
      out.write("                            <div class=\"modal-dialog\">\n");
      out.write("                                <div class=\"modal-content\">\n");
      out.write("                                    <div class=\"modal-header\">\n");
      out.write("                                        <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">Editar Producto</h1>\n");
      out.write("                                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        <form class=\"form-sing\" action=\"/FarmaciaWeb/CtrProductoLi?accion=actualizarpro\" method=\"POST\" >\n");
      out.write("\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <label>Nombre</label> \n");
      out.write("                                                    <input type=\"hidden\" class=\"form-control\" name=\"txtid\" id=\"txtid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getProCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"txtnombre\" placeholder=\"nombre\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                </div>  \n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <label>Proovedores</label> \n");
      out.write("                                                    <select class=\"form-control\" name=\"proovedores\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                                <input type=\"hidden\" class=\"form-control\" name=\"prov\" id=\"prov\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getTblProverdores()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <label>Precio</label> \n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" name=\"txtprecio\" placeholder=\"precio\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getProPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <label>Descuento</label> \n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" name=\"txtdescuento\" placeholder=\"descuento\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getProDescuento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <label>Marca</label> \n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"txtmarca\" placeholder=\"marca\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getProMarca()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <label>Descripcion</label> \n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" name=\"txtdescripcion\" placeholder=\"descripcion\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getProDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <label>Fecha vencimiento</label> \n");
      out.write("                                                    <input type=\"date\" class=\"form-control\" name=\"txtfechavencimiento\" placeholder=\"fecha\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getProFechaVencimiento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <label>Stock</label> \n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" name=\"txtstock\" placeholder=\"stock\" required=\"\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getProStok()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <label>Categoria</label> \n");
      out.write("                                                    <select class=\"form-control\" name=\"categoria\" onchange=\"actualizarInputOculto(this)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getTblCategoria()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                    <input type=\"hidden\" class=\"form-control\" name=\"cat\" id=\"cat\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getCategoria()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> \n");
      out.write("                                                    <script>\n");
      out.write("                                                        function actualizarInputOculto(selectElement) {\n");
      out.write("                                                            var inputOculto = document.getElementById(\"cat\");\n");
      out.write("                                                            inputOculto.value = selectElement.value;\n");
      out.write("                                                        }\n");
      out.write("                                                    </script>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-6\">\n");
      out.write("                                                    <label>Imagen</label> \n");
      out.write("                                                    <input type=\"file\" class=\"form-control\" name=\"foto\" id=\"foto\" onchange=\"actualizarInputOculto2(this)\">\n");
      out.write("                                                    <input type=\"hidden\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Productoe.getProFoto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"foto2\" id=\"foto2\">\n");
      out.write("                                                    <script>\n");
      out.write("                                                        function actualizarInputOculto2(selectElement) {\n");
      out.write("                                                            var inputOculto = document.getElementById(\"foto2\");\n");
      out.write("                                                            var filePath = selectElement.value;\n");
      out.write("                                                            var fileName = filePath.split('\\\\').pop().split('/').pop(); // Esto obtiene el nombre del archivo\n");
      out.write("                                                            inputOculto.value = \"Imagenes/\" + fileName;\n");
      out.write("                                                            //inputOculto.value = \"Imagenes/\" + selectElement.value;\n");
      out.write("                                                        }\n");
      out.write("                                                    </script>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>    \n");
      out.write("\n");
      out.write("                                            <center>\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-primary mt-4 mb-2 formulario_btn\" name=\"btnagregar\" value=\"Agregar\">Agregar <i class=\"bi bi-floppy\"></i></button>\n");
      out.write("                                                <a class=\"btn btn-danger formulario_btn mt-4 mb-2\" name=\"regresar\" href=\"#\">Regresar <i class=\"bi bi-box-arrow-left\"></i></a>\n");
      out.write("                                            </center>\n");
      out.write("\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </main>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>                        \n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>  \n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"/FarmaciaWeb/JS/IndexAdmin.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"/FarmaciaWeb/JS/EliminarProducto.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("                                                        $(document).ready(function () {\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                        });\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("prod");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedores}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
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
    _jspx_th_c_forEach_1.setVar("cat");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categorias}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.getCatCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.getCatNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${editarPro}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            $('#editarproducto').modal('show');\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
