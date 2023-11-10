/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
        

/**
 *
 * @author noni4
 */
public class Documento {
    
    
    private String nombre;
    
    private List<ObjetoBase> contenido = new ArrayList<>();

    public Documento(String nombre) {
        this.nombre = nombre;
    }

    

    public void agregarContenido( ObjetoBase contenido){
        
        
        this.contenido.add(contenido);
    }

    
    public void setContenido(List<ObjetoBase> contenido) {
        this.contenido = contenido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    
}
