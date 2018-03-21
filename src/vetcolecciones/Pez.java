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
public class Pez extends Animal {
    // Caracteristicas
    
    public Pez (String raza, String color, String nombre, String tipodeagua) {
        super(raza,color,nombre); //me trae esos constructores desde la super clase
    }
    
    public Pez (String raza, String color, String tipodeagua, int edad) throws EdadIncorrectaException {
        super(raza, color, edad);
    }

    @Override //redefinimos el metodo toString heredado de todos los Objects
    public String toString(){
        return ".PEZ." + super.toString();//Llamo al metodo toString definido Animal
        
    }
    
     public void EmitirSonido(){
       System.out.println("Gluc Gluc");
    }
}
