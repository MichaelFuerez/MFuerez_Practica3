/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
class Empleado extends Persona {
    private String jefe;
    private String cargo;
    
    public Empleado(String nombre, String correo, String telefono, String jefe, String cargo){
        super(nombre, correo, telefono);
        this.jefe = jefe;
        this.cargo = cargo;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
@Override
public String toString() {
    return super.toString() +
        ",Jefe= " + jefe +
        ",Cargo = " + cargo;
             
}
}