/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Proveedores;
import Modelo.ProveedoresDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author samuel
 */
@WebServlet(name = "CtrProveedores", urlPatterns = {"/CtrProveedores"})
public class CtrProveedores extends HttpServlet {

    ProveedoresDAO provdao = new ProveedoresDAO();
    Proveedores prov = new Proveedores();
    List<Proveedores> listaprov = new ArrayList();
    List<Proveedores> listprov = provdao.listarT();
    Proveedores p = new Proveedores();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre, direccion, ciudad, correo, contacto;
        int telefono, id;
        int idpv;
       

        String accion = request.getParameter("accion");
        System.out.println("Acción: " + accion);

        switch (accion) {
            case "listarProveedores":
                listprov = provdao.listarT();
                request.setAttribute("proveedores", listprov);
                request.getRequestDispatcher("/Vistas/ListarProveedoresAdm.jsp").forward(request, response);
                System.out.println("Número de proveedores: " + listprov.size());
                break;
            case "Agregar":
                nombre = request.getParameter("txtnombre");
                direccion = request.getParameter("txtdireccion");
                ciudad = request.getParameter("txtciudad");
                correo = request.getParameter("txtcorreo");
                telefono = Integer.parseInt(request.getParameter("txtelefono"));
                contacto = request.getParameter("txtcontacto");

                Proveedores prov = new Proveedores();
                prov.setNombre(nombre);
                prov.setDireccion(direccion);
                prov.setCiudad(ciudad);
                prov.setCorreo(correo);
                prov.setTelefono(telefono);
                prov.setContacto(contacto);

                provdao.crearProveedor(prov);

                response.sendRedirect("CtrProveedores?accion=listarProveedores");
                break;
            case "eliminar":
                String idp = request.getParameter("idp");
                dao.eliminar(idp);
                listprov = provdao.listarT();
                response.sendRedirect("CtrProveedores?accion=listarProveedores");
                break;
            case "buscarn":
                nombre = request.getParameter("busqueda");
                System.out.println("nombre: " + nombre);
                listprov = provdao.listarN(nombre);
                request.setAttribute("proveedores", listprov);
                request.getRequestDispatcher("Vistas/ListarProveedoresAdm.jsp").forward(request, response);
                break;
            case "editar":
                listprov = provdao.listarT();
                request.setAttribute("proveedores", listprov);
                request.getRequestDispatcher("/Vistas/EditarProveedores.jsp").forward(request, response);
                break;
            case "editarvedore":
                idpv = Integer.parseInt(request.getParameter("idprov"));
                System.out.println("id:     ss" + idpv);
                System.out.println("id producto" + idpv);
                p = provdao.listaridp(idpv);
                request.setAttribute("Proveedorese", p);

                request.getRequestDispatcher("/Vistas/EditarProveedores.jsp").forward(request, response);
                break;
            /*case "actualizarpro":
                int idprodu = Integer.parseInt(request.getParameter("id"));
                System.out.println("id: " + idprodu);
                String nompro = request.getParameter("nombre");
                String dire = request.getParameter("direccion");
                String ciud = request.getParameter("ciudad");
                String corre = request.getParameter("correo");
                int tel = Integer.parseInt(request.getParameter("telefono"));
                String cont = request.getParameter("contacto");

                p.setId(idprodu);
                p.setNombre(nompro);
                p.setDireccion(dire);
                p.setCiudad(ciud);
                p.setCorreo(corre);
                p.setTelefono(tel);
                p.setContacto(cont);

                provdao.editar(p);
                request.getRequestDispatcher("CtrProveedores?accion=listarProveedores").forward(request, response);
                break;*/
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

    ProveedoresDAO dao = new ProveedoresDAO();

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
        String accion = request.getParameter("accion");
        System.out.println("Acción: " + accion);

        switch (accion) {
            case "eliminar":
                String idp = request.getParameter("idp");
                dao.eliminar(idp);
                listprov = provdao.listarT();
                response.sendRedirect("CtrProveedores?accion=listarProveedores");
                break;
            case "actualizarpro":
                int idprodu = Integer.parseInt(request.getParameter("id"));
                System.out.println("id: " + idprodu);
                String nompro = request.getParameter("nombre");
                String dire = request.getParameter("direccion");
                String ciud = request.getParameter("ciudad");
                String corre = request.getParameter("correo");
                int tel = Integer.parseInt(request.getParameter("telefono"));
                String cont = request.getParameter("contacto");

                p.setId(idprodu);
                p.setNombre(nompro);
                p.setDireccion(dire);
                p.setCiudad(ciud);
                p.setCorreo(corre);
                p.setTelefono(tel);
                p.setContacto(cont);

                provdao.editar(p);
                request.getRequestDispatcher("CtrProveedores?accion=listarProveedores").forward(request, response);
                break;
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
