/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author noni4
 */
abstract class ObjetoBase {

    
    
    private String tipo;

    public ObjetoBase(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ObjetoBase{" + "tipo=" + tipo + '}';
    }

    void add(ObjetoBase contenido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    
    
    
    
    
    
    
}
