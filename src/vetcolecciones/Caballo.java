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
public class Caballo extends Animal implements Paciente {
    // Caracteristicas
    final static float precioconsulta=(float) 400.00;
    final static int PATAS = 4;
    public Caballo (String raza, String color, String nombre) {
        super(raza,color,nombre); //me trae esos constructores desde la super clase
    }
    
    public Caballo (String raza, String color, int edad) throws EdadIncorrectaException {
        super(raza,color,edad);
    }
    public void Relinchar () {
        System.out.println("IIII!!!");
    }
    @Override //redefinimos el metodo toString heredado de todos los Objects
    public String toString(){
        return ".CABALLO." + super.toString();//Llamo al metodo toString definido Animal
        
    }
    
    @Override
     public void EmitirSonido(){
       Relinchar();
    }

    /**
     * @return the precioconsulta
     */
    @Override
    public float getPrecioConsulta() {
        return precioconsulta;
    }

}
