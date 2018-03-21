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
public final class VetHerencia {
    private ArrayList<Perro> perros;
    private ArrayList<Gato> gatos;
    private ArrayList<Cucha> cuchas;
    private ArrayList<Jaula> jaulas;
    private ArrayList<Pecera> peceras;
    private ArrayList<Animal> animales;
    private ArrayList<Casita> casitas;
    private ArrayList<Accesorios> listadeaccesorios;
    
    
    public VetHerencia(){
        perros = new ArrayList<>();
        gatos = new ArrayList<>();
        cuchas = new ArrayList<>();
        jaulas = new ArrayList<>();
        peceras = new ArrayList<>();
        animales = new ArrayList<>();
        casitas = new ArrayList<>();
        listadeaccesorios = new ArrayList<>();
        InicializarVeterinaria();
    }
    public void InicializarVeterinaria(){
          listadeaccesorios.add(new Plato("China", "marron", (float) 15.25, Material.PLASTICO));
          listadeaccesorios.add(new Pelota("China", "marron", (float) 15.25, Material.PLASTICO));
          perros.add(new Perro("terrbald", "marron", "Toby"));
          try{
              perros.add(new Perro("crdobensis", "negro",-5));
          }
          catch(EdadIncorrectaException ex){
              System.out.println("No se puedo crear el perro edad incorrecta");
          }
          perros.add(new Perro("scottish", "salpimienta","Mirkex"));
          gatos.add(new Gato("Lasagnero", "naranja", "Garfield"));
          gatos.add(new Gato("Callejero", "negro", "Pelusa"));
         /************POLIMORFISMO****************/
          animales.add(new Perro("Callejero", "negro", "Pelusa"));
          animales.add(new Gato("Callejero2", "negro", "Pelusa"));
         /************POLIMORFISMO****************/
          
          Perro perro = new Perro("terrbald", "marron", "Toby");
          casitas.add(new Cucha(Material.MADERA,perro,Tamano.MEDIANO,"roja","china",true,listadeaccesorios));
//          casitas.add(new Jaula());
//          casitas.add(new Pecera());
          
          Pez pez = new Pez("Dorado","dorado","Goldie","dulce");
      //    peceras.add(new Pecera(pez,Tamano.MEDIANO,"China",true,1));
      
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        VetHerencia vet = new  VetHerencia();    
        vet.ListarPerros();
        vet.ListarGatos();
        vet.ListarCuchas();
        vet.ListarJaulas();
        vet.ListarPeceras();
        vet.ListarAnimales();
        vet.EmitenSuSonido();
        vet.VamoALimpiar();

    }
    
    public void ListarPerros(){
        for (Perro p : perros){
            System.out.println(p);
        }
    }
    public void ListarGatos(){
        for (Gato g : gatos){
            System.out.println(g);
        }
    }
    public void ListarCuchas(){
        for (Cucha c : cuchas){
            System.out.println(c);
        }
    }
    public void ListarJaulas(){
        for (Jaula j : jaulas){
            System.out.println(j);
        }
    }
        public void ListarPeceras(){
        for (Pecera p : peceras){
            System.out.println(p);
        }
    }
    
    public void ListarAnimales(){
        for (Animal a : animales){
            System.out.println(a);
        }
    }
    public void EmitenSuSonido(){
        for (Animal a : animales){
            a.EmitirSonido();
        }
    }
       public void VamoALimpiar(){
        for (Casita c : casitas){
            c.Limpiar();
        }
    }
}
   