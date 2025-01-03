/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */

public class ProductoCongelado extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperaturaMantenimiento;

    // Constructor con inicialización de atributos
    public ProductoCongelado(String fechaCaducidad, int numeroLote, String fechaEnvasado, 
                             String paisOrigen, double temperaturaMantenimiento) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    // Getters y setters
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    // Método toString corregido
    @Override
    public String toString() {
        return super.toString() + 
               ", Fecha de Envasado: " + fechaEnvasado +
               ", País de Origen: " + paisOrigen +
               ", Temperatura de Mantenimiento: " + temperaturaMantenimiento + "°C";
    }
}