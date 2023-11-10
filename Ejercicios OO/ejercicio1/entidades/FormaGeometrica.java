/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author noni4
 */
public class FormaGeometrica extends ObjetoBase{
    
    
   private String forma;

    public FormaGeometrica(String forma, String tipo) {
        super(tipo);
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    
   
    
   
   
   
}
