/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class CongeladoPorAgua extends ProductoCongelado {
    private double porcentajeAgua;
    
    public CongeladoPorAgua(String fechaCaducidad, int numeroLote, String fechaEnvasado, 
                            String paisOrigen, double temperaturaMantenimiento, double porcentajeAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.porcentajeAgua = porcentajeAgua;
    }

    public double getPorcentajeAgua() {
        return porcentajeAgua;
    }

    public void setPorcentajeAgua(double porcentajeAgua) {
        this.porcentajeAgua = porcentajeAgua;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                ",Porcentaje de Agua= " + porcentajeAgua;
    }
    
}
