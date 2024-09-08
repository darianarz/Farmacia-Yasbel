/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Configuracion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author samuel
 */
public class ProveedoresDAO {

    Connection con;
    PreparedStatement pstm;
    Conectar Conexion;

   
    public void crearProveedor(Proveedores proveedor) {
        try {
            Conexion = new Conectar();
            con = Conexion.crearconexion();
            if (con != null) {
                System.out.println("Conexión establecida con la base de datos");
            }

            pstm = con.prepareStatement("INSERT INTO tblproveedores (Nombre, Direccion, Ciudad, Correo, Telefono, Contacto) VALUES (?, ?, ?, ?, ?, ?)");

            pstm.setString(1, proveedor.getNombre());
            pstm.setString(2, proveedor.getDireccion());
            pstm.setString(3, proveedor.getCiudad());
            pstm.setString(4, proveedor.getCorreo());
            pstm.setInt(5, proveedor.getTelefono());
            pstm.setString(6, proveedor.getContacto());

            pstm.executeUpdate();
            System.out.println("Proveedor creado exitosamente");
        } catch (Exception e) {
            System.out.println("Error al crear el proveedor: " + e);
        }
    }


    public List<Proveedores> listarT() {
        List<Proveedores> proList = new ArrayList<>();
        try {
            Conexion = new Conectar();
            con = Conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("SELECT * FROM tblproveedores");
            ResultSet resul = pstm.executeQuery();
            while (resul.next()) {
                Proveedores prov = new Proveedores();
                prov.setId(resul.getInt("ID"));
                prov.setNombre(resul.getString("Nombre"));
                prov.setDireccion(resul.getString("Direccion"));
                prov.setCiudad(resul.getString("Ciudad"));
                prov.setCorreo(resul.getString("Correo"));
                prov.setTelefono(resul.getInt("Telefono"));
                prov.setContacto(resul.getString("Contacto"));
                System.out.println("entro a proveedores");
                proList.add(prov);
            }
        } catch (Exception e) {
            System.out.println("Error al listar las PQR: " + e);
        }
        return proList;
    }

}
