/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


import java.util.Date;
/**
 *
 * @author noni4
 */
public class Prestamo {
    
    
    private int codigoLibro;
    private int numeroSocio;
    private Date fecha;  

    public Prestamo(int codigoLibro, int numeroSocio, Date fecha) {
        this.codigoLibro = codigoLibro;
        this.numeroSocio = numeroSocio;
        this.fecha = fecha;
    }
    
    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigoLibro=" + codigoLibro + ", numeroSocio=" + numeroSocio + ", fecha=" + fecha + '}';
    }
    
    
    
    
    
    
    
}
