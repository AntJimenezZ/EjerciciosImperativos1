/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


/**
 *
 * @author noni4
 */
public class Libro {
    
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(int codigo, String titulo, String autor, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    

    public void cambiarDisponibilidad(){
        
        
        if (this.disponible == true) {
            this.disponible = false;
        }else{
            this.disponible = true;
        }
        
    }
    
    
}
