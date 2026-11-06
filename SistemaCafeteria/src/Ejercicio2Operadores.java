public class Ejercicio2Operadores {
    public static void main(String[] args) {
        double subtotal = 42500;
        double porcentajeDescuento = 0.15;

        boolean tieneDerechoDescuento = subtotal > 30000;

        double valorDescuento = 0;
        if (tieneDerechoDescuento) {
            valorDescuento = subtotal * porcentajeDescuento;
        }

        double totalPagar = subtotal - valorDescuento;

        System.out.println("=== Cálculo de Pedido ===");
        System.out.printf("¿Tiene derecho al descuento?: %b%n", tieneDerechoDescuento);
        System.out.printf("Valor del descuento (15%%): $%.2f%n", valorDescuento);
        System.out.printf("Total a pagar: $%.2f%n", totalPagar);
    }
}
