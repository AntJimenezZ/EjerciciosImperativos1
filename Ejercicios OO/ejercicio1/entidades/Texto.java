/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author noni4
 */
public class Texto extends ObjetoBase{
    
    private String contenido;

    public Texto(String contenido, String tipo) {
        super(tipo);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Texto{" + "contenido=" + contenido + '}';
    }

    
    
    
    
}
