/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class Ave extends Oviparo {
    public Ave(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El ave hace un canto.");
    }
}
