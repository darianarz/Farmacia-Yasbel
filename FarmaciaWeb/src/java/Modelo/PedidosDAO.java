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
public class PedidosDAO {

    Connection con;
    PreparedStatement pstm;
    Conectar Conexion;

    public List<Pedidos> listarT() {
        List<Pedidos> pqrList = new ArrayList<>();
        try {
            Conexion = new Conectar();
            con = Conexion.crearconexion();
            if (con != null) {
                System.out.println("Se ha establecido una conexión con la base de datos");
            }
            pstm = con.prepareStatement("select * from tblpedidos");
            ResultSet resul = pstm.executeQuery();
            while (resul.next()) {
                Pedidos ped = new Pedidos();
                ped.setPedCodigo(resul.getInt("PedCodigo"));
                ped.setTblUsuarios(resul.getInt("tblUsuarios"));
                ped.setPedDireccion(resul.getString("PedDireccion"));
                ped.setPedFormaDePago(resul.getString("PedFormaDePago"));
                ped.setPedFecha(resul.getString("PedFecha"));
                ped.setPedTotal(resul.getDouble("PedTotal"));
                ped.setPedEstado(resul.getString("PedEstado"));
                pqrList.add(ped);
            }
        } catch (Exception e) {
            System.out.println("Error al listar las PQR: " + e);
        }
        return pqrList;
    }

}
