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
 * @author HOME
 */
public class PQRDAO {

    Connection con;
    PreparedStatement pstm;
    Conectar Conexion;

    public void crearPQR(PQR pqr) {
        try {
            Conexion = new Conectar();
            con = Conexion.crearconexion();
            if (con != null) {
                System.out.println("Conexión establecida con la base de datos");
            }

            pstm = con.prepareStatement("INSERT INTO tblpqrs ( PQRTipo ,PQRNombre, PQRCorreo, PQRTelefono, PQRDescripcion) VALUES (?, ?, ?, ?, ?)");

            pstm.setString(1, pqr.getPqrTipo());
            pstm.setString(2, pqr.getPqrNombre());
            pstm.setString(3, pqr.getPqrCorreo());
            pstm.setString(4, pqr.getPqrTelefono());
            pstm.setString(5, pqr.getPqrDescripcion());

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al crear la PQR: " + e);
        }

    }

    public List<PQR> listarT() {
        List<PQR> pqrList = new ArrayList<>();
        try {
            Conexion = new Conectar();
            con = Conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("select * from tblpqrs");
            ResultSet resul = pstm.executeQuery();
            while (resul.next()) {
                PQR pqr = new PQR();
                pqr.setPqrCodigo(resul.getString("PQRCodigo"));
                pqr.setTblUsuarios(resul.getString("tblUsuarios"));
                pqr.setPqrFecha(resul.getString("PQRFecha"));
                pqr.setPqrTipo(resul.getString("PQRTipo"));
                pqr.setPqrEstado(resul.getString("PQREstado"));
                pqr.setPqrDescripcion(resul.getString("PQRDireccion"));
                pqr.setPqrNombre(resul.getString("PQRNombre"));
                pqr.setPqrCorreo(resul.getString("PQRCorreo"));
                pqr.setPqrTelefono(resul.getString("PQRTelefono"));
                pqr.setPqrDescripcion(resul.getString("PQRDescripcion"));
                pqrList.add(pqr);
            }
        } catch (Exception e) {
            System.out.println("Error al listar las PQR: " + e);
        }
        return pqrList;
    }

}
