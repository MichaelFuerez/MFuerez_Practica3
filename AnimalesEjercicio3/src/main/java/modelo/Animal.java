/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class Animal {
    private String nombre;
    private String tipo;


    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
        
    }
    
    @Override
    public String toString(){
        return "Animal [Nombre= " + nombre +
                ", Tipo= " + tipo;
               
    }
    
}
