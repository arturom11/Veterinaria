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
public class Perro extends Animal implements Paciente{
    // Caracteristicas
    private static final float precioconsulta =(float) 100.00;
    final static int PATAS = 4;

    /**
     * @return the precioconsulta
     */
    @Override
    public float getPrecioConsulta() {
        return precioconsulta;
    }
    public Perro (String raza, String color, String nombre) {
        super(raza,color,nombre); //me trae esos constructores desde la super clase
    }
    
    public Perro (String raza, String color, int edad) throws EdadIncorrectaException {
        super(raza,color,edad);
    }
    public void Ladrar () {
        System.out.println("Guuaauu!!!");
    }
    @Override //redefinimos el metodo toString heredado de todos los Objects
    public String toString(){
        return ".PERRO." + super.toString();//Llamo al metodo toString definido Animal
        
    }
    
    @Override
     public void EmitirSonido(){
       Ladrar();
    }
}
