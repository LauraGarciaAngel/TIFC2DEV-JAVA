public class Ejercicio3Switch {
    public static void main(String[] args) {
        char codigoCategoria = 'F';

        System.out.println("=== Consulta de Categoría e IVA ===");
        System.out.println("Código ingresado: " + codigoCategoria);

        switch (codigoCategoria) {
            case 'B':
                System.out.println("Categoría: Bebida caliente");
                System.out.println("Porcentaje de IVA: 0%");
                break;
            case 'F':
                System.out.println("Categoría: Bebida fría");
                System.out.println("Porcentaje de IVA: 5%");
                break;
            case 'C':
                System.out.println("Categoría: Comida");
                System.out.println("Porcentaje de IVA: 8%");
                break;
            case 'P':
                System.out.println("Categoría: Postre");
                System.out.println("Porcentaje de IVA: 8%");
                break;
            default:
                System.out.println("Código no reconocido. Use B, F, C o P.");
                break;
        }
    }
}
