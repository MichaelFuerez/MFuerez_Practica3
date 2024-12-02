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
        // Creación de objetos ProductoFresco
        ProductoFresco fresco1 = new ProductoFresco("2024-12-15", 101, "2024-11-30", "Ecuador");
        ProductoFresco fresco2 = new ProductoFresco("2024-12-20", 102, "2024-11-25", "Colombia");
        ProductoFresco fresco3 = new ProductoFresco("2024-12-25", 103, "2024-12-01", "Perú");

        System.out.println("=== Productos Frescos ===");
        System.out.println(fresco1);
        System.out.println(fresco2);
        System.out.println(fresco3);

        // Creación de objetos ProductoRefrigerado
        ProductoRefrigerado refri1 = new ProductoRefrigerado("2024-12-10", 201, "ORG123", "2024-11-28", -5.0, "Argentina");
        ProductoRefrigerado refri2 = new ProductoRefrigerado("2024-12-15", 202, "ORG456", "2024-11-29", -4.0, "Chile");
        ProductoRefrigerado refri3 = new ProductoRefrigerado("2024-12-20", 203, "ORG789", "2024-11-30", -6.0, "Uruguay");

        System.out.println("\n=== Productos Refrigerados ===");
        System.out.println(refri1);
        System.out.println(refri2);
        System.out.println(refri3);

        // Creación de objetos CongeladoPorAire
        CongeladoPorAire aire1 = new CongeladoPorAire("2024-12-31", 301, "2024-12-01", "Brasil", -18.0, 78.0, 21.0, 0.03, 0.02);
        CongeladoPorAire aire2 = new CongeladoPorAire("2024-12-31", 302, "2024-12-02", "México", -20.0, 80.0, 19.0, 0.01, 0.03);

        // Creación de objetos CongeladoPorAgua
        ProductoCongelado agua1 = new CongeladoPorAgua("2024-12-31", 401, "2024-12-01", "Cuba", -15.0, 3.5);

        // Creación de objetos CongeladoPorNitrogeno
        CongeladoPorNitrogeno nitrogeno1 = new CongeladoPorNitrogeno("2024-12-31", 501, "2024-12-01", "Venezuela", -30.0, "Inmersión", 45);

        System.out.println("\n=== Productos Congelados ===");
        System.out.println(aire1);
        System.out.println(aire2);
        System.out.println(agua1);
        System.out.println(nitrogeno1);

        // Upcasting: ProductoFresco a Producto
        Producto productoUp = fresco1; // Upcasting implícito
        System.out.println("\n=== Upcasting ===");
        System.out.println("Producto (Upcasting): " + productoUp);

        // Downcasting: Producto a ProductoFresco
        if (productoUp instanceof ProductoFresco) {
            ProductoFresco frescoDown = (ProductoFresco) productoUp;
            System.out.println("\n=== Downcasting ===");
            System.out.println("Producto Fresco (Downcasting): " + frescoDown);
        }

        // Upcasting: CongeladoPorNitrogeno a ProductoCongelado
        ProductoCongelado congeladoUp = nitrogeno1; // Upcasting implícito
        System.out.println("\n=== Upcasting ===");
        System.out.println("Producto Congelado (Upcasting): " + congeladoUp);

        // Downcasting: ProductoCongelado a CongeladoPorNitrogeno
        if (congeladoUp instanceof CongeladoPorNitrogeno) {
            CongeladoPorNitrogeno nitrogenoDown = (CongeladoPorNitrogeno) congeladoUp;
            System.out.println("\n=== Downcasting ===");
            System.out.println("Congelado por Nitrógeno (Downcasting): " + nitrogenoDown);
        }
    }
}