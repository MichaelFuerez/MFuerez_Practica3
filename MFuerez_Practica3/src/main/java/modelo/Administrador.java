/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
class Administrador extends Empleado {
    private String puesto;
    
    public Administrador(String nombre, String correo, String telefono, String jefe, String cargo, String puesto) {
        super(nombre, correo, telefono, jefe, cargo);
        this.puesto = puesto;
        
        
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                ",Puesto" + puesto;
    }
}