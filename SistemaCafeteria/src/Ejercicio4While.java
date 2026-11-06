public class Ejercicio4While {
    public static void main(String[] args) {
        int inventarioCafe = 50;
        int consumoPorPedido = 3;
        int numeroPedido = 1;

        System.out.println("=== Control de Inventario de Café Molido ===");
        System.out.println("Inventario inicial: " + inventarioCafe + " unidades");

        while (inventarioCafe >= 10) {
            inventarioCafe = inventarioCafe - consumoPorPedido;
            System.out.println("Pedido #" + numeroPedido + " (-" + consumoPorPedido
                    + " unidades) -> Inventario restante: " + inventarioCafe + " unidades");
            numeroPedido++;
        }

        System.out.println("Alerta: El inventario bajó de 10 unidades. Se detiene la simulación.");
    }
}
