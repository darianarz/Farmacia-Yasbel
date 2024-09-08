/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Carrito;
import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Modelo.DetallePedido;
import Modelo.DetallePedidoDAO;
import Modelo.PQR;
import Modelo.PQRDAO;
import Modelo.Pedidos;
import Modelo.PedidosDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Proveedores;
import Modelo.ProveedoresDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SENA
 */
public class CtrProductoLi extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ProductoDAO pdao = new ProductoDAO();
    CategoriaDAO cdao = new CategoriaDAO();
    PedidosDAO pedao = new PedidosDAO();
    List<Producto> list = pdao.listarT();
    List<Producto> productos = new ArrayList();
    List<CategoriaDAO> categoria = new ArrayList();
    List<Carrito> listacarrito = new ArrayList();
    List<Pedidos> pedidos = new ArrayList();
    Usuario us;
    List<Pedidos> listapedido = new ArrayList();
    List<DetallePedido> listadetped = new ArrayList();
    List<Proveedores> proveedores = new ArrayList();
    Proveedores prove = new Proveedores();
    ProveedoresDAO prodDao = new ProveedoresDAO();
    Pedidos ped = new Pedidos();
    DetallePedidoDAO dpdao = new DetallePedidoDAO();
    PedidosDAO peddao = new PedidosDAO();
    UsuarioDAO usudao = new UsuarioDAO();
    Carrito car;
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    List<Categoria> listaCategorias = new ArrayList();
    Categoria categ = new Categoria();

    int cantidad;
    Date fechavencimiento;
    int idp;
    int subtotal;
    int item;
    int totalpagar, idusu;
    String nom, des, foto, fec, estado, idcliente, id, marca, descuent, fechaven;

    int pre, sto, cat, mon, idcli, provee;
    Date d = new Date();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        String accion = request.getParameter("accion");
        System.out.println("accion= " + accion);
        HttpSession sesion = request.getSession();
        productos = pdao.listarS();
        categoria = cdao.listar();
        pedidos = pedao.listarT();

        System.out.println("producto " + productos.get(0).getProFoto());
        Producto p = new Producto();
        request.setAttribute("contador", listacarrito.size());
        switch (accion) {

            case "home":

                request.setAttribute("categorias", categoria);
                System.out.println("categoria " + categoria.size());
                request.setAttribute("productos", productos);
                System.out.println("producto " + productos.size());
                System.out.println("tipo " + sesion.getAttribute("tipo"));
                if (sesion.getAttribute("tipo") != null) {
                    if (sesion.getAttribute("tipo").equals("Administrador")) {
                        System.out.println("entro en administador");
                        request.getRequestDispatcher("Vistas/HomePageAdm.jsp").forward(request, response);
                    } else {
                        if (sesion.getAttribute("tipo").equals("Usuario")) {
                            request.getRequestDispatcher("Vistas/HomePage.jsp").forward(request, response);
                        }
                    }
                } else {
                    System.out.println("entro en inicio");
                    request.getRequestDispatcher("Vistas/HomePage.jsp").forward(request, response);
                }

                break;
            case "buscarcat":
                int idcat = Integer.parseInt(request.getParameter("catid"));
                productos = pdao.buscarCateg(idcat);
                request.setAttribute("categorias", categoria);
                request.setAttribute("productos", productos);

                if (sesion.getAttribute("tipo").equals("Administrador")) {
                    request.getRequestDispatcher("Vistas/HomePage.jsp").forward(request, response);
                }
                break;
            case "buscar":
                String nombre = request.getParameter("busqueda");
                productos = pdao.buscarN(nombre);
                request.setAttribute("categorias", categoria);
                request.setAttribute("productos", productos);
                request.getRequestDispatcher("Vistas/HomePage.jsp").forward(request, response);
                /*if (sesion.getAttribute("tipo").equals("Administrador")) {
                    request.getRequestDispatcher("Vistas/HomePage.jsp").forward(request, response);
                }
                if (request.getParameter("busqueda") == null) {
                    response.sendRedirect("/FarmaciaWeb/Vistas/HomePage.jsp?busqued=0");
                }*/
                break;
            case "buscarn":
                nombre = request.getParameter("busqueda");
                System.out.println("nombre: " + nombre);
                productos = pdao.buscarN(nombre);
                request.setAttribute("categorias", categoria);
                request.setAttribute("producto", productos);
                System.out.println("prodductos" + productos);
                request.getRequestDispatcher("Vistas/ListarProductoAdm.jsp").forward(request, response);
                /* if (sesion.getAttribute("tipo").equals("Administrador")) {
                    request.getRequestDispatcher("Vistas/ListarProductoAdm.jsp").forward(request, response);
                }
               if (request.getParameter("busqueda") == null) {
                    response.sendRedirect("/FarmaciaWeb/Vistas/HomePage.jsp?busqued=0");
                }*/
                break;
            case "salir":

                sesion.invalidate();
                response.sendRedirect("/FarmaciaWeb/Vistas/LogginPage.jsp");
                break;

            case "AgregarCarrito":
                cantidad = 1;
                int pos = 0;

                idp = Integer.parseInt(request.getParameter("id"));
                p = pdao.listaridp(idp);
                if (listacarrito.size() > 0) {
                    for (int i = 0; i < listacarrito.size(); i++) {
                        if (idp == listacarrito.get(i).getIdproducto()) {
                            pos = i;
                        }
                    }
                    if (idp == listacarrito.get(pos).getIdproducto()) {
                        cantidad = cantidad + listacarrito.get(pos).getCantidad();
                        subtotal = cantidad * listacarrito.get(pos).getPreciocompra();
                        listacarrito.get(pos).setCantidad(cantidad);
                        listacarrito.get(pos).setSubtotal(subtotal);
                    } else {
                        item++;
                        car = new Carrito();
                        car.setItem(item);
                        car.setIdproducto(idp);
                        car.setNombre(p.getProNombre());
                        car.setDescripcion(p.getProDescripcion());
                        car.setFoto(p.getProFoto());
                        car.setPreciocompra(p.getProPrecio());
                        car.setCantidad(cantidad);
                        car.setSubtotal(cantidad * p.getProPrecio());
                        listacarrito.add(car);
                    }
                } else {
                    item++;
                    car = new Carrito();
                    car.setItem(item);
                    car.setIdproducto(idp);
                    car.setNombre(p.getProNombre());
                    car.setDescripcion(p.getProDescripcion());
                    car.setFoto(p.getProFoto());
                    car.setPreciocompra(p.getProPrecio());
                    car.setCantidad(cantidad);
                    car.setSubtotal(cantidad * p.getProPrecio());
                    listacarrito.add(car);
                }
                request.setAttribute("contador", listacarrito.size());
                request.getRequestDispatcher("CtrProductoLi?accion=home").forward(request, response);
                break;
            case "Carrito":
                request.setAttribute("categorias", categoria);
                System.out.println("categoria " + categoria.size());
                totalpagar = 0;
                for (int i = 0; i < listacarrito.size(); i++) {
                    totalpagar = totalpagar + listacarrito.get(i).getSubtotal();
                }
                request.setAttribute("totalpagar", totalpagar);
                request.setAttribute("carrito", listacarrito);
                if (sesion.getAttribute("tipo").equals("Usuario")) {
                    request.getRequestDispatcher("Vistas/CarritoCliente.jsp").forward(request, response);
                }
                break;
            case "Comprar":
                totalpagar = 0;
                idp = Integer.parseInt(request.getParameter("id"));
                p = pdao.listaridp(idp);
                item++;
                car = new Carrito();
                car.setItem(item);
                car.setIdproducto(idp);
                car.setNombre(p.getProNombre());
                car.setDescripcion(p.getProDescripcion());
                car.setFoto(p.getProFoto());
                car.setPreciocompra(p.getProPrecio());
                car.setCantidad(cantidad);
                car.setSubtotal(cantidad * p.getProPrecio());
                boolean producto = false;
                int con = 0;
                for (int i = 0; i < listacarrito.size(); i++) {
                    if (listacarrito.get(i).getIdproducto() == idp) {
                        producto = true;
                        con = i;
                    }
                    totalpagar = totalpagar + listacarrito.get(i).getSubtotal();
                }
                if (producto == false) {
                    listacarrito.add(car);
                    totalpagar = totalpagar + listacarrito.get(listacarrito.size() - 1).getSubtotal();
                } else {
                    listacarrito.get(con).setCantidad(listacarrito.get(con).getCantidad() + 1);
                    listacarrito.get(con).setSubtotal(listacarrito.get(con).getPreciocompra() * listacarrito.get(con).getCantidad());
                    int can = listacarrito.get(con).getCantidad();
                    totalpagar = totalpagar + (listacarrito.get(con).getPreciocompra() * (can - 1));
                }
                request.setAttribute("contador", listacarrito.size());
                request.setAttribute("totalpagar", totalpagar);
                request.setAttribute("carrito", listacarrito);
                if (sesion.getAttribute("tipo").equals("Administrador")) {
                    request.getRequestDispatcher("Vistas/CarritoCliente.jsp").forward(request, response);
                }
                break;
            case "admi":
                request.setAttribute("categorias", categoria);
                request.setAttribute("productos", productos);
                request.getRequestDispatcher("Vistas/WelcomeAdmin.jsp").forward(request, response);
                break;
            case "Listaradm":
                request.setAttribute("productos", productos);
                request.getRequestDispatcher("Vistas/ListarProductoAdm.jsp").forward(request, response);
                break;
            case "EditarPro":
                int idp = Integer.parseInt(request.getParameter("idpro"));
                System.out.println("id producto" + idp);
                p = pdao.listaridp(idp);
                request.setAttribute("Productoe", p);
                request.setAttribute("editarPro", true);
                productos = pdao.listarT();
                proveedores = prodDao.listarT();
                request.setAttribute("producto", productos);
                request.setAttribute("categorias", categoria);
                request.setAttribute("proveedores", proveedores);
                request.getRequestDispatcher("/Vistas/EditarProductoAdm.jsp").forward(request, response);
                break;
            case "actualizarpro":
                int idprodu = Integer.parseInt(request.getParameter("txtid"));
                String nompro = request.getParameter("txtnombre");
                int pro = Integer.parseInt(request.getParameter("prov"));
                int prepro = Integer.parseInt(request.getParameter("txtprecio"));
                String descu = request.getParameter("txtdescuento");
                String marcapro = request.getParameter("txtmarca");
                String despro = request.getParameter("txtdescripcion");
                String fecha = request.getParameter("txtfechavencimiento");
                fechavencimiento = formatoFecha.parse(fecha);
                java.sql.Date fechaVencimiento = new java.sql.Date(fechavencimiento.getTime());
                int stopro = Integer.parseInt(request.getParameter("txtstock"));
                int catpro = Integer.parseInt(request.getParameter("cat"));
                String categorinombre2 = request.getParameter("catNombre");
                System.out.println("nomrbed e la caaaa : "  +categorinombre2);
                String fotpro = "Imagenes/" + categorinombre2 + "/" + request.getParameter("foto");
                System.out.println("direccion de la imagen:  " + fotpro);
                p.setProNombre(nompro);
                p.setTblProverdores(pro);
                p.setProPrecio(prepro);
                p.setProDescuento(descu);
                p.setProMarca(marcapro);
                p.setProDescripcion(despro);
                p.setProFechaVencimiento(fechaVencimiento);
                p.setProStok(stopro);
                p.setTblCategoria(catpro);
                p.setProFoto(fotpro);
                p.setProCodigo(idprodu);
                pdao.editar(p);
                request.getRequestDispatcher("CtrProductoLi?accion=Listaradm").forward(request, response);
                break;
            case "Agregar":
                System.out.println("entro Agregar AppWeb");
                nom = request.getParameter("txtnombre");
                System.out.println("nombre producto: " + nom);
                des = request.getParameter("txtdescripcion");
                marca = request.getParameter("txtmarca");
                fechaven = request.getParameter("txtfechavencimiento");
                fechavencimiento = formatoFecha.parse(fechaven);
                java.sql.Date fechaVencimientoSql = new java.sql.Date(fechavencimiento.getTime());
                pre = Integer.parseInt(request.getParameter("txtprecio"));
                sto = Integer.parseInt(request.getParameter("txtstock"));
                descuent = request.getParameter("txtdescuento");
                cat = Integer.parseInt(request.getParameter("categoria"));
                String categorinombre = request.getParameter("categoriaNombre");
                System.out.println("nombre de la categoria" + categorinombre);
                provee = Integer.parseInt(request.getParameter("proovedores"));
                foto = "Imagenes/" + categorinombre + "/" + request.getParameter("foto");
                System.out.println("direccion imagen" + foto);

                p.setProPrecio(pre);
                p.setProDescuento(descuent);
                p.setProMarca(marca);
                p.setProNombre(nom);
                p.setProFoto(foto);
                p.setProDescripcion(des);
                p.setTblProverdores(provee);
                p.setProFechaVencimiento(fechaVencimientoSql);
                p.setProStok(sto);
                p.setTblCategoria(cat);
                pdao.crear(p);
                request.getRequestDispatcher("CtrProductoLi?accion=Listaradm").forward(request, response);
                break;
            case "inventario":
                productos = pdao.listarT();
                request.setAttribute("productos", productos);
                request.setAttribute("categorias", categoria);
                request.getRequestDispatcher("Vistas/InventarioAdm.jsp").forward(request, response);
                break;
            case "ag":
                productos = pdao.listarT();
                proveedores = prodDao.listarT();
                request.setAttribute("productos", productos);
                request.setAttribute("categorias", categoria);
                request.setAttribute("proveedores", proveedores);
                System.out.println("proveedores : " + proveedores);
                request.getRequestDispatcher("Vistas/AdminiatracionProductosAdm.jsp").forward(request, response);
                break;

            case "eliminar":
                String id = request.getParameter("idp");
                System.out.println("id: " + id);
                pdao.eliminar(id);
                list = pdao.listarT();
                request.setAttribute("prducto", list);
                request.getRequestDispatcher("Vistas/ListarProductoAdm.jsp").forward(request, response);
                break;
            case "gestion":
                request.setAttribute("pedidos", pedidos);
                request.getRequestDispatcher("Vistas/GestionPedidoAdm.jsp").forward(request, response);
                break;
            case "ActualizarCantidad":
                System.out.println("entro actualizar cantidad ");
                int idpro = Integer.parseInt(request.getParameter("idp"));
                System.out.println("idpro = " + request.getParameter("idp"));
                int can = Integer.parseInt(request.getParameter("Cantidad"));
                System.out.println("entro actualizar cantidad cantidad = " + can);
                for (int i = 0; i < listacarrito.size(); i++) {
                    if (idpro == listacarrito.get(i).getIdproducto()) {
                        listacarrito.get(i).setCantidad(can);
                        int st = listacarrito.get(i).getPreciocompra() * can;
                        listacarrito.get(i).setSubtotal(st);
                    }
                }
                break;

            case "Delete":
                int idproducto = Integer.parseInt(request.getParameter("idp"));
                for (int i = 0; i < listacarrito.size(); i++) {
                    if (idproducto == listacarrito.get(i).getIdproducto()) {
                        listacarrito.remove(i);
                    }
                }
                break;

            case "pedido":
                if (listacarrito.size() > 0) {

                    idusu = Integer.parseInt(request.getParameter("idusu"));
                    System.out.println("usuario " + idusu);
                    fec = DateFormat.getDateInstance().format(d);
                    mon = Integer.parseInt(request.getParameter("totalp"));
                    estado = "En Proceso";
                    ped.setTblUsuarios(idusu);
                    ped.setPedFecha(fec);
                    ped.setPedTotal(mon);
                    ped.setPedEstado(estado);
                    peddao.crear(ped);
                    int idpe = peddao.listarMx();
                    System.out.println("idpedido: " + idpe);
                    for (int i = 0; i < listacarrito.size(); i++) {
                        DetallePedido dped = new DetallePedido();
                        dped.setTblPedido(idpe);
                        dped.setTblProducto(listacarrito.get(i).getIdproducto());
                        dped.setDpdNombreProducto(listacarrito.get(i).getNombre());
                        dped.setDpdCantidad(listacarrito.get(i).getCantidad());
                        dped.setDpdPrecioTotal(listacarrito.get(i).getPreciocompra());
                        dpdao.crear(dped);
                    }

                    listacarrito.removeAll(listacarrito);
                    request.getRequestDispatcher("CtrProductoLi?accion=Carrito").forward(request, response);
                    break;

                }

        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CtrProductoLi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CtrProductoLi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
