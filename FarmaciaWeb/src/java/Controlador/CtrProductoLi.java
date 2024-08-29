/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Carrito;
import Modelo.CategoriaDAO;
import Modelo.PQR;
import Modelo.PQRDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

    List<Producto> productos = new ArrayList();
    List<CategoriaDAO> categoria = new ArrayList();
    List<Carrito> listacarrito = new ArrayList();
    Usuario us;

    int cantidad;
    Carrito car;
    int idp;
    int subtotal;
    int item;
    int totalpagar;
    String nom, des, foto, idusu, fec, estado, idcliente;
    int pre, sto, cat, mon, idcli;
    Date d = new Date();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        System.out.println("accion= " + accion);
        HttpSession sesion = request.getSession();
        productos = pdao.listarS();
        categoria = cdao.listar();
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
                        if (sesion.getAttribute("tipo").equals("Cliente")) {
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
                if (sesion.getAttribute("tipo").equals("Administrador")) {
                    request.getRequestDispatcher("Vistas/HomePage.jsp").forward(request, response);
                }
                if (request.getParameter("busqueda") == null) {
                    response.sendRedirect("/FarmaciaWeb/Vistas/HomePage.jsp?busqued=0");
                }
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
                totalpagar = 0;
                for (int i = 0; i < listacarrito.size(); i++) {
                    totalpagar = totalpagar + listacarrito.get(i).getSubtotal();
                }
                request.setAttribute("totalpagar", totalpagar);
                request.setAttribute("carrito", listacarrito);
                if (sesion.getAttribute("tipo").equals("Administrador")) {
                    request.getRequestDispatcher("Vistas/CarritoCliente.jsp").forward(request, response);
                } else if (sesion.getAttribute("tipo").equals("Cliente")) {
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
                if (sesion.getAttribute("tipo") != null) {
                    if (sesion.getAttribute("tipo").equals("Administrador")) {
                        request.getRequestDispatcher("Vistas/IndexAdmin.jsp").forward(request, response);
                    }
                } else {
                    request.getRequestDispatcher("/FarmaciaWeb/CtrProductoLi?accion=home").forward(request, response);
                }
                break;
            case "Listaradm":
                request.setAttribute("productos", productos);
                request.getRequestDispatcher("Vistas/ListarProductoAdm.jsp").forward(request, response);
                break;
            case "EditarPro":
                int idp = Integer.parseInt(request.getParameter("idpro"));
                p = pdao.listaridp(idp);
                request.setAttribute("Productoe", p);
                request.setAttribute("editarPro", true);
                productos = pdao.listarT();
                request.setAttribute("producto", productos);
                request.setAttribute("categorias", categoria);
                request.getRequestDispatcher("/Vistas/ListarProductosAdm.jsp").forward(request, response);
                break;
            case "actualizarpro":
                int idprodu = Integer.parseInt(request.getParameter("txtid"));
                String nompro = request.getParameter("txtnombre");
                int prepro = Integer.parseInt(request.getParameter("txtprecio"));
                String despro = request.getParameter("txtdescripcion");
                int stopro = Integer.parseInt(request.getParameter("txtstock"));
                int catpro = Integer.parseInt(request.getParameter("cat"));
                String fotpro = request.getParameter("foto2");
                p.setProCodigo(idprodu);
                p.setProPrecio(prepro);
                p.setProNombre(nompro);
                p.setProFoto(fotpro);
                p.setProDescripcion(despro);
                p.setProStok(stopro);
                p.setTblCategoria(catpro);
                pdao.editar(p);
                request.getRequestDispatcher("CtrProducto?accion=listar").forward(request, response);
                break;
            case "Agregar":
                System.out.println("entro Agregar AppWeb");
                nom = request.getParameter("txtnombre");
                System.out.println("nombre producto: " + nom);
                des = request.getParameter("txtdescripcion");
                pre = Integer.parseInt(request.getParameter("txtprecio"));
                sto = Integer.parseInt(request.getParameter("txtstock"));
                cat = Integer.parseInt(request.getParameter("categoria"));
                System.out.println("categoria producto: " + cat);
                foto = "Imagenes/" + request.getParameter("foto");
                p.setProNombre(nom);
                p.setProDescripcion(des);
                p.setProPrecio(pre);
                p.setProStok(sto);
                p.setTblCategoria(cat);
                p.setProFoto(foto);
                pdao.crear(p);
                request.getRequestDispatcher("CtrProductoLi?accion=listar").forward(request, response);
                break;
            case "listar":
                productos = pdao.listarT();
                request.setAttribute("producto", productos);
                request.setAttribute("categorias", categoria);
                request.getRequestDispatcher("Vistas/IndexAdmin.jsp").forward(request, response);
                break;
            case "ag":
                request.getRequestDispatcher("Vistas/AdminiatracionProductosAdm.jsp").forward(request, response);
                break;

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
        processRequest(request, response);
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
        processRequest(request, response);
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
