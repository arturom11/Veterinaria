/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetcolecciones;

/**
 *
 * @author utku33
 */
public enum Material {
    MADERA ("madera"), METAL ("metal"),
    PLASTICO ("plastico"), TELA ("tela"), 
    VIDRIO ("vidrio");
    
    private final String nombre;
    Material (String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}