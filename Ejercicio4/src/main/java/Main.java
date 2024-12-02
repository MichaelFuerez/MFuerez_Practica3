
public class Main {
    public static void main(String[] args) {
        
        // Creación de productos frescos
        ProductoFresco fresco1 = new ProductoFresco("2024-12-15", 101, "2024-11-30", "Ecuador");
        ProductoFresco fresco2 = new ProductoFresco("2024-12-20", 102, "2024-11-25", "Colombia");
        ProductoFresco fresco3 = new ProductoFresco("2024-12-25", 103, "2024-12-01", "Perú");

        
        System.out.println("Productos Frescos");
        fresco1.mostrar();
        fresco2.mostrar();
        fresco3.mostrar();

        // Creación de productos refrigerados
        ProductoRefrigerado refri1 = new ProductoRefrigerado("2024-12-10", 201, "ORG123", "2024-11-28", -5.0, "Argentina");
        ProductoRefrigerado refri2 = new ProductoRefrigerado("2024-12-15", 202, "ORG456", "2024-11-29", -4.0, "Chile");
        ProductoRefrigerado refri3 = new ProductoRefrigerado("2024-12-20", 203, "ORG789", "2024-11-30", -6.0, "Uruguay");

        
        System.out.println("Productos Refrigerados");
        refri1.mostrar();
        refri2.mostrar();
        refri3.mostrar();

        // Creación de productos congelados por aire
        CongeladoPorAire aire1 = new CongeladoPorAire("2024-12-31", 301, "2024-12-01", "Brasil", -18.0, 78.0, 21.0, 0.03, 0.02);
        CongeladoPorAire aire2 = new CongeladoPorAire("2024-12-31", 302, "2024-12-02", "México", -20.0, 80.0, 19.0, 0.01, 0.03);

        
        System.out.println("Productos Congelados por Aire");
        aire1.mostrar();
        aire2.mostrar();

        // Creación de productos congelados por agua
        CongeladoPorAgua agua1 = new CongeladoPorAgua("2024-12-31", 401, "2024-12-01", "Cuba", -15.0, 3.5);
        System.out.println("Productos Congelados por Agua");
        agua1.mostrar();

        // Creación de productos congelados por nitrógeno
        CongeladoPorNitrogeno nitrogeno1 = new CongeladoPorNitrogeno("2024-12-31", 501, "2024-12-01", "Venezuela", -30.0, "Inmersión", 45);
        System.out.println("Productos Congelados por Nitrógeno");
        nitrogeno1.mostrar();
    }
}

// Clase base Producto
class Producto {
    String fechaCaducidad;
    int numeroLote;
    String fechaEnvasado;
    String paisOrigen;

    public Producto(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public void mostrar() {
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Número de lote: " + numeroLote);
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
    }
}


class ProductoFresco extends Producto {
    public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
    }
}


class ProductoRefrigerado extends Producto {
    double temperaturaMantenimiento;
    String organizacion;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String organizacion, String fechaEnvasado, double temperaturaMantenimiento, String paisOrigen) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.organizacion = organizacion;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Temperatura de mantenimiento: " + temperaturaMantenimiento);
        System.out.println("Organización: " + organizacion);
    }
}


class ProductoCongelado extends Producto {
    double temperaturaMantenimiento;

    public ProductoCongelado(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Temperatura de mantenimiento: " + temperaturaMantenimiento);
    }
}


class CongeladoPorAire extends ProductoCongelado {
    double temperaturaAire;
    double flujoAire;

    public CongeladoPorAire(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, double temperaturaAire, double flujoAire, double par4, double par5) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.temperaturaAire = temperaturaAire;
        this.flujoAire = flujoAire;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Temperatura del aire: " + temperaturaAire);
        System.out.println("Flujo de aire: " + flujoAire);
    }
}


class CongeladoPorAgua extends ProductoCongelado {
    double porcentajeAgua;

    public CongeladoPorAgua(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, double porcentajeAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.porcentajeAgua = porcentajeAgua;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Porcentaje de agua: " + porcentajeAgua);
    }
}


class CongeladoPorNitrogeno extends ProductoCongelado {
    String metodoCongelacion;
    int tiempoCongelacion;

    public CongeladoPorNitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, String metodoCongelacion, int tiempoCongelacion) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoCongelacion = tiempoCongelacion;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Método de congelación: " + metodoCongelacion);
        System.out.println("Tiempo de congelación: " + tiempoCongelacion);
    }
}
