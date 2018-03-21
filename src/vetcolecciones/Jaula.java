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
public class Jaula extends Casita {
    private final int lugares;
    private boolean TieneAccesorios;
    private ArrayList<AccesoriosJaula> accesorios;
    
    public Jaula () {    //Jaula por defecto
        super(Material.METAL,null,Tamano.MEDIANO,"Gris","China",false,null);
        lugares=1;
    }
   
    public Jaula (Loro dueno, Tamano tamano, String color,String origen,boolean ocupado, int lugares, ArrayList listadeaccesorios ) {
        super(Material.METAL,dueno,tamano,color,origen,ocupado, listadeaccesorios);
        this.lugares=lugares;
    }
    @Override
    public String toString(){
    return "Hay una jaula "+super.toString()+" en el fondo.";
}
    /**
     * @return the lugares
     */
    public int getLugares() {
        return lugares;
    }
    
    @Override
    public void Limpiar(){
        if (isLimpio()==true)
            System.out.println("La jaula ya estaba limpia");
        else{
            if (isOcupado()==true){  
                setOcupado(false);
                System.out.println("Desocupamos");
            }    
            setTieneAccesorios(false);
            System.out.println("Jaula sin accesorios");
            setLimpio(true);
            System.out.println("Jaula limpia");
            setTieneAccesorios(true);
            System.out.println("Jaula con accesorios"); 
            }
    }

    /**
     * @return the tieneaccesorios
     */
    public boolean isTieneAccesorios() {
        return TieneAccesorios;
    }

    /**
     * @param tieneaccesorios the tieneaccesorios to set
     */
    public void setTieneAccesorios(boolean tieneaccesorios) {
        this.TieneAccesorios = tieneaccesorios;
    }
    
    public ArrayList<AccesoriosJaula> getAccesorios() {
        return accesorios;
    }

    /**
     * @param accesorios the accesorios to set
     */
    public void setAccesorios(ArrayList<AccesoriosJaula> accesorios) {
        if (TieneAccesorios){
            this.accesorios=null;
            System.out.println("El usuario indico que no tiene Accesorios");
        }
        else{
         this.accesorios = accesorios;   
        }
        
    }

}
