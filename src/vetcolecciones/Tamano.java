package vetcolecciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utku33
 */
public enum Tamano {
    CHICO("chico"), MEDIANO ("mediano"),
    GRANDE ("grande");
    
    private final String nombre;
    Tamano (String nombre){
        this.nombre=nombre;
}
    @Override
    public String toString(){
        return nombre;
}
    }