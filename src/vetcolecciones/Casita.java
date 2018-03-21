/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetcolecciones;

import java.util.ArrayList;

/**
 *
 * @author utku33
 */
public abstract class Casita implements Vendible{
    private final Material material;
    private boolean ocupado;
    private Animal dueno;
    private final Tamano tamano;
    private String color;
    private final String origen;
    private boolean limpio;
    private ArrayList<Accesorios>listadeaccesorios;
    private float precio;
    private String codigo;

    public Casita (Material material, Animal dueno, Tamano tamano, String color,String origen,boolean ocupado,ArrayList listadeaccesorios) {
        this.material = material;
        this.dueno = dueno;
        this.tamano = tamano;
        this.color = color;
        this.origen = origen;
        this.ocupado = ocupado;
        this.listadeaccesorios = listadeaccesorios;
    }
    
    public abstract void Limpiar();

    /**
     * @return the ocupado
     */
 
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * @param ocupado the ocupado to set
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }


    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * @return the tamano
     */
    public Tamano getTamano() {
        return tamano;
    }

    /**
     * @return the limpio
     */
    public boolean isLimpio() {
        return limpio;
    }

    /**
     * @param limpio the limpio to set
     */
    public void setLimpio(boolean limpio) {
        this.limpio = limpio;
    }
    
    @Override //redefinimos el metodo toString heredado de todos los Objects
    public String toString(){
   
        return "PECERA cuyo dueno es "+dueno.getNombre()+" de color "+color+" y tamano "+tamano;  
    }

    /**
     * @return the dueno
     */
    public Animal getDueno() {
        return dueno;
    }

    /**
     * @param dueno the dueno to set
     */
    public void setDueno(Animal dueno) {
        this.dueno = dueno;
    }


    public void getListadeaccesorios() {
        for (Accesorios a : listadeaccesorios){
            System.out.println(a);
        }

    }

    /**
     * @param listadeaccesorios the listadeaccesorios to set
     */
    public void setListadeaccesorios(ArrayList<Accesorios> listadeaccesorios) {
        this.listadeaccesorios = listadeaccesorios;
    }

    /**
     * @return the precio
     */
    @Override
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the codigo
     */
    @Override
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
