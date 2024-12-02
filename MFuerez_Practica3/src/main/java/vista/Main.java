/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Administrador admin = new Administrador("David", "david@mail.com", "123456789", "Julian", "Manager", "TI");
        Profesor profesor = new Profesor("Juana", "juana@mail.com", "987654321", "Derlis", "Docente", "Matemáticas");
        Estudiante estudiante = new Estudiante("Paco", "paco@mail.com", "111222333", 10, 'B');
        
        
        System.out.println(admin);
        System.out.println(profesor);
        System.out.println(estudiante);
    }
}
