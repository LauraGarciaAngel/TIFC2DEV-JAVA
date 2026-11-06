public class SistemaCafeteria {
    public static void main(String[] args) {
        String[] nombres = { "Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie" };
        double[] precios = { 3500, 5000, 4000, 4500, 6000 };
        char[] categorias = { 'B', 'B', 'F', 'C', 'P' };

        // Datos de los 6 pedidos del turno
        int[] pedidoProducto = { 0, 2, 1, 4, 0, 3 };
        int[] pedidoCantidad = { 2, 1, 3, 1, 1, 2 };
        int inventarioBrownie = 10;
        int totalPedidosProcesados = 0;
        double totalRecaudado = 0;
        double mayorValorPedido = 0;
        int numeroPedidoMayorValor = 0;
        System.out.println("APERTURA DE TURNO - CAFETERÍA");
        double montoApertura;
        int intentoApertura = 1;

        do {
            if (intentoApertura == 1) {
                montoApertura = 0;
            } else {
                montoApertura = 50000;
            }

            System.out.println("Intento " + intentoApertura + " - Monto de apertura ingresado: $" + montoApertura);

            if (montoApertura <= 0) {
                System.out.println("Error: El monto de apertura debe ser mayor a $0. Intente nuevamente.");
            }

            intentoApertura++;
        } while (montoApertura <= 0);

        System.out.println("Caja abierta correctamente con $" + montoApertura);
        System.out.println();
        System.out.println("PROCESAMIENTO DE PEDIDOS");

        for (int i = 0; i < pedidoProducto.length; i++) {
            int numeroPedido = i + 1;
            int indiceProducto = pedidoProducto[i];
            int cantidad = pedidoCantidad[i];

            String nombreProducto = nombres[indiceProducto];
            double precioUnitario = precios[indiceProducto];
            char codigoCategoria = categorias[indiceProducto];

            System.out.println("--- Pedido #" + numeroPedido + " ---");

            if (indiceProducto == 4 && cantidad > inventarioBrownie) {
                System.out.println("Producto solicitado: " + nombreProducto + " (Cantidad: " + cantidad + ")");
                System.out.println("Estado: Producto agotado. No hay suficiente inventario y no se cobra este pedido.");
            } else {
                if (indiceProducto == 4) {
                    inventarioBrownie = inventarioBrownie - cantidad;
                }
                String descripcionCategoria;
                switch (codigoCategoria) {
                    case 'B':
                        descripcionCategoria = "Bebida caliente";
                        break;
                    case 'F':
                        descripcionCategoria = "Bebida fría";
                        break;
                    case 'C':
                        descripcionCategoria = "Comida";
                        break;
                    case 'P':
                        descripcionCategoria = "Postre";
                        break;
                    default:
                        descripcionCategoria = "Categoría no reconocida";
                        break;
                }

                double subtotal = precioUnitario * cantidad;

                System.out.println("Producto: " + nombreProducto);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Categoría: " + descripcionCategoria);
                System.out.println("Subtotal: $" + subtotal);

                double valorFinal = subtotal;
                if (subtotal > 12000) {
                    double descuento = subtotal * 0.10;
                    valorFinal = subtotal - descuento;
                    System.out.println("Descuento (10%): Sí aplicó (-$" + descuento + ")");
                } else {
                    System.out.println("Descuento (10%): No aplicó");
                }

                System.out.println("Valor final: $" + valorFinal);

                if (indiceProducto == 4) {
                    System.out.println("Inventario restante de Brownie: " + inventarioBrownie + " unidades");
                }

                totalPedidosProcesados++;
                totalRecaudado = totalRecaudado + valorFinal;

                if (valorFinal > mayorValorPedido) {
                    mayorValorPedido = valorFinal;
                    numeroPedidoMayorValor = numeroPedido;
                }
            }
            System.out.println();
        }
        System.out.println("REPORTE DE CIERRE");
        System.out.println("Total de pedidos procesados: " + totalPedidosProcesados);
        System.out.println("Total recaudado: $" + totalRecaudado);
        if (totalPedidosProcesados > 0) {
            System.out.println("Número del pedido con mayor valor: Pedido #" + numeroPedidoMayorValor + " ($"
                    + mayorValorPedido + ")");
        } else {
            System.out.println("Número del pedido con mayor valor: Ninguno (no se procesaron pedidos)");
        }
    }
}
