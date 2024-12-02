/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
class Profesor extends Empleado {
   private String carrera;
   
   public Profesor(String nombre, String correo, String telefono, String jefe, String cargo, String carrera ) {
       super(nombre, correo, telefono, jefe, cargo);
       
   }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
   
   
    @Override
    public String toString() {
        return super.toString() +
                "Carrera =" + carrera; 
    }
}