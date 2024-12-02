/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class ProductoRefrigerado {
    private String codigoSupervision;
    private String fechaEnvasado;
    private double temperaturaMantenimiento;
    private String paisOrigen;

    public ProductoRefrigerado(String string, int par, String orG123, String string1, double par1, String argentina) {
    }

    public ProductoRefrigerado(String codigoSupervision, String fechaEnvasado, double temperaturaMantenimiento, String paisOrigen) {
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }
    
    public String getCodigoSupervision() {
        return codigoSupervision;
    }

    public void setCodigoSupervision(String codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + ", Producto Refrigerado [Código de Supervisión=" + codigoSupervision +
                ", Fecha de Envasado=" + fechaEnvasado + 
                ", Temperatura de Mantenimiento=" + temperaturaMantenimiento +
                ", País de Origen=" + paisOrigen ;
    }
    
}
