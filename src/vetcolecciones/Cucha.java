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
public class Cucha extends Casita {
    private ArrayList<AccesoriosCucha> accesorios;
    private boolean TieneAccesorios;
    
    public Cucha (Material material, Perro dueno, Tamano tamano, String color,String origen,boolean ocupado, ArrayList accesorios ) {
        super(material,dueno,tamano,color,origen,ocupado,accesorios);
    }
    public Cucha (Material material, Gato dueno, Tamano tamano, String color,String origen,boolean ocupado, ArrayList accesorios) {
        super(material,dueno,tamano,color,origen,ocupado, accesorios);
    }

    @Override
    public String toString(){
    return "Esta la cucha "+super.toString()+" en vidriera.";
}
    @Override
    public void Limpiar(){
        if (isOcupado()==true){  
                setOcupado(false);
                System.out.println("Desocupamos");
            } 
        setLimpio(true);
        System.out.println("Cucha limpia");
    }
    public ArrayList<AccesoriosCucha> getAccesorios() {
        return accesorios;
    }

    /**
     * @param accesorios the accesorios to set
     */
    public void setAccesorios(ArrayList<AccesoriosCucha> accesorios) {
        if (TieneAccesorios){
            this.accesorios=null;
            System.out.println("El usuario indico que no tiene Accesorios");
        }
        else{
         this.accesorios = accesorios;   
        }
        
    }
}
