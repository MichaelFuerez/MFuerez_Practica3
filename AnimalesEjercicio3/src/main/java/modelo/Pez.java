/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class Pez extends Oviparo {
    public Pez(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pez hace burbujas");
    }
    //actualizar
}