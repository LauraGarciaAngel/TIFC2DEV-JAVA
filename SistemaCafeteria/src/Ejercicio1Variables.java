public class Ejercicio1Variables {
    public static void main(String[] args) {

        String nombreProducto = "Capuchino";
        double precioUnitario = 5000.50;
        int cantidadInventario = 25;
        boolean disponibleHoy = true;
        char codigoProducto = 'B';

        System.out.println("=== Información del Producto ===");
        System.out.println(String.format("Nombre del producto: %s", nombreProducto));
        System.out.println(String.format("Precio unitario: $%.2f", precioUnitario));
        System.out.println(String.format("Cantidad en inventario: %d unidades", cantidadInventario));
        System.out.println(String.format("¿Está disponible hoy?: %b", disponibleHoy));
        System.out.println(String.format("Código del producto: %c", codigoProducto));
    }
}
