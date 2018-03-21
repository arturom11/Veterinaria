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
public abstract class Animal {
    private final String raza;
    private int edad=-1;
    private final String color;
    private String nombre;   
    public Animal (String raza, String color, String nombre) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
    }
    
    public Animal (String raza, String color, int edad) throws EdadIncorrectaException {
        this.raza = raza;
        this.color = color;
        setEdad(edad);
        this.nombre = "Sin Nombre";
    }
    /*****SOBRE ESCRITURA DE METODO
     * @return S******/
    @Override //redefinimos el metodo toString heredado de todos los Objects
    public String toString(){
        return "Raza: "+raza+" - Color: "+color+" - Nombre: "+nombre+" - Edad: "+edad;
        
    }
    
    public abstract void EmitirSonido();   
    /**Todas la subclases estan obligadas a implementas los metodos abstract de su super**/
    /*****SOBRE ESCRITURA DE METODOS******/
    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     * @throws vetcolecciones.EdadIncorrectaException
     */
    private void setEdad(int edad) throws EdadIncorrectaException {
        if (edad>0){
            this.edad = edad;   
        }
        else{
            throw new EdadIncorrectaException();
        }
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
