/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author HOME
 */
public class PQR {
    private String pqrCodigo;
    private String tblUsuarios;
    private String pqrFecha;
    private String pqrNombre;
    private String pqrCorreo;
    private String pqrTelefono;
    private String  pqrTipo;
    private String pqrDescripcion;
    private String pqrDireccion;
    private String PqrEstado;

    public PQR() {
    }

    public PQR(String pqrCodigo, String tblUsuarios, String pqrFecha, String pqrNombre, String pqrCorreo, String pqrTelefono, String pqrTipo, String pqrDescripcion, String pqrDireccion, String PqrEstado) {
        this.pqrCodigo = pqrCodigo;
        this.tblUsuarios = tblUsuarios;
        this.pqrFecha = pqrFecha;
        this.pqrNombre = pqrNombre;
        this.pqrCorreo = pqrCorreo;
        this.pqrTelefono = pqrTelefono;
        this.pqrTipo = pqrTipo;
        this.pqrDescripcion = pqrDescripcion;
        this.pqrDireccion = pqrDireccion;
        this.PqrEstado = PqrEstado;
    }

    public String getPqrCodigo() {
        return pqrCodigo;
    }

    public void setPqrCodigo(String pqrCodigo) {
        this.pqrCodigo = pqrCodigo;
    }

    public String getTblUsuarios() {
        return tblUsuarios;
    }

    public void setTblUsuarios(String tblUsuarios) {
        this.tblUsuarios = tblUsuarios;
    }

    public String getPqrFecha() {
        return pqrFecha;
    }

    public void setPqrFecha(String pqrFecha) {
        this.pqrFecha = pqrFecha;
    }

    public String getPqrNombre() {
        return pqrNombre;
    }

    public void setPqrNombre(String pqrNombre) {
        this.pqrNombre = pqrNombre;
    }

    public String getPqrCorreo() {
        return pqrCorreo;
    }

    public void setPqrCorreo(String pqrCorreo) {
        this.pqrCorreo = pqrCorreo;
    }

    public String getPqrTelefono() {
        return pqrTelefono;
    }

    public void setPqrTelefono(String pqrTelefono) {
        this.pqrTelefono = pqrTelefono;
    }

    public String getPqrTipo() {
        return pqrTipo;
    }

    public void setPqrTipo(String pqrTipo) {
        this.pqrTipo = pqrTipo;
    }

    public String getPqrDescripcion() {
        return pqrDescripcion;
    }

    public void setPqrDescripcion(String pqrDescripcion) {
        this.pqrDescripcion = pqrDescripcion;
    }

    public String getPqrDireccion() {
        return pqrDireccion;
    }

    public void setPqrDireccion(String pqrDireccion) {
        this.pqrDireccion = pqrDireccion;
    }

    public String getPqrEstado() {
        return PqrEstado;
    }

    public void setPqrEstado(String PqrEstado) {
        this.PqrEstado = PqrEstado;
    }

    
    
}
