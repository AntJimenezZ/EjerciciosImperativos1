/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author noni4
 */
public class GrupoFormas extends ObjetoBase{

    
    private List<FormaGeometrica> grupoFormas = new ArrayList<>();
    
    
    public GrupoFormas(String tipo) {
        super(tipo);
    }
    
    
    public void agregarAlGrupo(FormaGeometrica forma){
        
        this.grupoFormas.add(forma);
    }

    @Override
    public String toString() {
        return "GrupoFormas{" + "grupoFormas=" + grupoFormas + '}';
    }

    
    
}
