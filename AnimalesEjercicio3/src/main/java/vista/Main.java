/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author HP
 */
import modelo.Animal;
import modelo.Ave;
import modelo.Canino;
import modelo.Felino;
import modelo.Pez;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        Animal perro = new Canino("Perro");
        Animal lobo = new Canino("Lobo");
        Animal gato = new Felino("Gato");
        Animal tigre = new Felino("Tigre");
        Animal aguila = new Ave("Águila");
        Animal paloma = new Ave("Paloma");
        Animal trucha = new Pez("Trucha");
    System.out.println(perro);
        perro.hacerSonido();
        System.out.println(lobo);
        lobo.hacerSonido();
        System.out.println(gato);
        gato.hacerSonido();
        System.out.println(tigre);
        tigre.hacerSonido();
        System.out.println(aguila);
        aguila.hacerSonido();
        System.out.println(paloma);
        paloma.hacerSonido();
        System.out.println(trucha);
        trucha.hacerSonido();
    }
}
