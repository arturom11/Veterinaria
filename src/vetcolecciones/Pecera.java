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
public class Pecera extends Casita {
    private final int lugares;
    private boolean TieneAccesorios;
    private boolean EstaLlena;
    private ArrayList<AccesoriosPecera> accesorios;
    
    public Pecera () {    //Jaula por defecto
        super(Material.VIDRIO,null,Tamano.MEDIANO,"transparente","China",false, null);
        lugares=1;
    }
   
    public Pecera (Pez dueno, Tamano tamano,String origen,boolean ocupado, int lugares, ArrayList listadeaccesorios ) {
        super(Material.VIDRIO,dueno,tamano,"transparente",origen,ocupado, listadeaccesorios);
        this.lugares=lugares;
    }
    
    @Override
    public String toString(){
    return "Hay una "+super.toString()+" en el fondo.";
}
    @Override
        public void Limpiar(){
        if (isLimpio()==true)
            System.out.println("Ya esta limpio");
        else{            
            if (isOcupado()==true){  
                setOcupado(false);
                System.out.println("Desocupamos");
            } 
            setEstaLlena(false);
            System.out.println("Pecera Vacia");
            setTieneAccesorios(false);
            System.out.println("Pecera sin accesorios");
            setLimpio(true);
            System.out.println("Pecera limpia");
            setTieneAccesorios(true);
            System.out.println("Pecera con accesorios"); 
            setEstaLlena(true);
            System.out.println("Pecera Llena");
            }
    }
    /**
     * @return the lugares
     */
    public int getLugares() {
        return lugares;
    }

    /**
     * @return the TieneAccesorios
     */
    public boolean isTieneAccesorios() {
        return TieneAccesorios;
    }

    /**
     * @param TieneAccesorios the TieneAccesorios to set
     */
    public void setTieneAccesorios(boolean TieneAccesorios) {
        this.TieneAccesorios = TieneAccesorios;
    }

    /**
     * @return the EstaLlena
     */
    public boolean isEstaLlena() {
        return EstaLlena;
    }

    /**
     * @param EstaLlena the EstaLlena to set
     */
    public void setEstaLlena(boolean EstaLlena) {
        this.EstaLlena = EstaLlena;
    }

    /**
     * @return the accesorios
     */
    public ArrayList<AccesoriosPecera> getAccesorios() {
        return accesorios;
    }

    /**
     * @param accesorios the accesorios to set
     */
    public void setAccesorios(ArrayList<AccesoriosPecera> accesorios) {
        if (TieneAccesorios){
            this.accesorios=null;
            System.out.println("El usuario indico que no tiene Accesorios");
        }
        else{
         this.accesorios = accesorios;   
        }
        
    }

}
