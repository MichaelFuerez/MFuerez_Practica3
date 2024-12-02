/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
class Estudiante extends Persona {
    private int grado;
    private char grupo;
    
    public Estudiante(String nombre, String correo, String telefono, int grado, char grupo) {
        super(nombre, correo, telefono);
        this.grupo = grupo;
        this.grado = grado;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                ",grado" + grado +
                ",grupo" + grupo;
    }
}