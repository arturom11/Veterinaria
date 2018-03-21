package vetcolecciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utku33
 */
public abstract class Accesorios implements Vendible{
    private final String origen;
    private float precio;
    private final String color;
    private final Material material;
    private String codigo;
    
    public Accesorios (String origen, String color, float precio, Material material) {
        this.origen = origen;
        this.color = color;
        this.material = material;
        this.precio = precio;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param precio the precio to set
     */
    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * @return the precio
     */
    @Override
    public float getPrecio() {
        return precio;
    }

    /**
     * @return the Codigo
     */
    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
 