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
    private String nombre;
    private String correo;
    private String telefono;
    private String jefe;
    private String puesto;
    private String departamento;
    
    public Administrador(String nombre, String correo, String telefono, String jefe, String cargo, String puesto) {
        super(nombre, correo, telefono, jefe, cargo);
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.puesto = puesto;
        this.departamento = departamento;
        
        
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
                ",NOmbre" + nombre +
                ",Correo" + correo +
                ",Telefono" + telefono +
                ",Jefe" + jefe +
                ",Puesto" + puesto +
                ",Departamento" + departamento;
    }
}