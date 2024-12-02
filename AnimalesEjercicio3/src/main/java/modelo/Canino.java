/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class Canino extends Mamifero {
    public Canino(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El canino hace un ladrido.");
    }
}