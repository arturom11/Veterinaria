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
public class Gato extends Animal {
    final static float precioconsulta =(float) 200.00;
    final static int PATAS = 4;
    public Gato (String raza, String color, String nombre) {
        super(raza,color,nombre); //me trae esos constructores desde la super clase
    }
    
    public Gato (String raza, String color, int edad) throws EdadIncorrectaException {
        super(raza,color, edad);
    } 
    public void Maullar () {
        System.out.println("Miiaauu!!!");
    }
        @Override //redefinimos el metodo toString heredado de todos los Objects
    public String toString(){
        return ".GATO." + super.toString();//Llamo al metodo toString definido Animal
        
    }
    @Override
      public void EmitirSonido(){
       Maullar();
    }
    public float getPrecioConsulta() {
        return precioconsulta;
    }
}
