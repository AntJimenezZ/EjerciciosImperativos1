/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import entidades.Documento;
import entidades.FormaGeometrica;
import entidades.GrupoFormas;
import entidades.Texto;

/**
 *
 * @author noni4
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Documento documento = new Documento("hoja1");
        
        FormaGeometrica circulo = new FormaGeometrica("Circulo", "Forma");

        FormaGeometrica cuadrado = new FormaGeometrica("Cuadrado", "Forma");
        
        FormaGeometrica triangulo = new FormaGeometrica("Triangulo", "Forma");
        
        Texto texto = new Texto("Textoooo", "Texto");
        
        
        GrupoFormas grupo1 = new GrupoFormas("Grupo");
        
        documento.agregarContenido(texto);
        
        grupo1.agregarAlGrupo(circulo);
        grupo1.agregarAlGrupo(cuadrado);
        
        documento.agregarContenido(grupo1);
        
        documento.agregarContenido(triangulo);
            
    } 
}
