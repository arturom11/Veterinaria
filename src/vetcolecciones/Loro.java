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
public class Loro extends Animal{
    final static int PATAS= 2;
    final static int ALAS= 2;
    private boolean habla;
        public Loro (String raza, String color, String nombre) {
        super(raza,color,nombre); //me trae esos constructores desde la super clase
    }
    
    public Loro (String raza, String color, int edad) throws EdadIncorrectaException {
        super(raza,color, edad);
    }
     public void Repetir (String frase) {
        System.out.println(frase);
    }
     
     public void EmitirSonido(){
       Repetir("Hola Hola");
    } 

    /**
     * @return the habla
     */
    public boolean isHabla() {
        return habla;
    }

    /**
     * @param habla the habla to set
     */
    public void setHabla(boolean habla) {
        this.habla = habla;
    }
}
