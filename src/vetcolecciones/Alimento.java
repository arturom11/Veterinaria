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
public class Alimento implements Vendible{
    private float precioporkg;
    private String codigo;
    private float peso;
    
    public Alimento(float precioporkg, float peso){
        this.precioporkg= precioporkg;
        this.peso = peso;
    }
    /**
     * @return the precio
     */
    @Override
    public float getPrecio() {
        float preciodeventa=precioporkg*peso;
        return preciodeventa;
    }

 
    @Override
    public void setPrecio(float precioporkg) {
        this.precioporkg = precioporkg;
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

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
}
