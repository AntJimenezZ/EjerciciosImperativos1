/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import entidades.Libro;
import entidades.Socio;
import entidades.Prestamo;
import java.time.LocalDate;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Date;


/**
 *
 * @author noni4
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Socio socio1 = new Socio(1, "Noni", "Walmart");
        Socio socio2 = new Socio(2, "Tata", "Argentina");
        Socio socio3 = new Socio(3, "Messi", "EEUU");
        Socio socio4 = new Socio(4, "El bicho", "Arabia");
        
        
        Libro libro1 = new Libro(1, "Harry Potter", "JK Rowling", true);
        Libro libro2 = new Libro(2, "Hunger Games", "Suzanne Collins", true);
        Libro libro3 = new Libro(3, "Pantalos Cortos", "Juan Pablo Vargas", true);
        Libro libro4 = new Libro(4, "Cocori", "Joel Campbell", true);
        
        
        socio1.agregarLibro(libro1);
        socio1.agregarLibro(libro2);
        socio1.agregarLibro(libro3);
        socio1.agregarLibro(libro4);
        
        socio2.agregarLibro(libro2);
        socio3.agregarLibro(libro3);
        socio4.agregarLibro(libro1);
        
        
        System.out.println(libro2.isDisponible());
        libro2.cambiarDisponibilidad();
        System.out.println(libro2.isDisponible());
             
        Date fechaActual = new Date();
        
        Prestamo prestamo1 = new Prestamo(1, 1, fechaActual);
        
        
        System.out.println(prestamo1);
        
        
        mostrarSociosConMasDe3Libros(socio1,socio2);
    }
    
    public static void mostrarSociosConMasDe3Libros(Socio... socios) {
        List<Socio> sociosConMasDe3Libros = 
            List.of(socios).stream()
                .filter(socio -> socio.getListaLibros().size() > 3)
                .collect(Collectors.toList());
        
        for (Socio socio : sociosConMasDe3Libros) {
            System.out.println("Numero de socio: " + socio.getNumeroSocio() +
                    ", Nombre: " + socio.getNombre() +
                    ", Libros prestados: " + socio.getListaLibros().size());
        }
    }
}
