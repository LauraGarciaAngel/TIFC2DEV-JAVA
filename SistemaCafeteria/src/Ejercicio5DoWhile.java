public class Ejercicio5DoWhile {
    public static void main(String[] args) {
        double montoApertura;
        int intento = 1;

        System.out.println("=== Apertura de Caja ===");

        do {
            if (intento == 1) {
                montoApertura = -5000;
            } else {
                montoApertura = 50000;
            }

            System.out.println("Intento " + intento + " - Monto ingresado: $" + montoApertura);

            if (montoApertura <= 0) {
                System.out.println(
                        "Valor inválido. El monto de apertura debe ser mayor a $0. Por favor, ingréselo nuevamente.");
            }

            intento++;
        } while (montoApertura <= 0);

        System.out.println("Apertura exitosa. Caja iniciada con: $" + montoApertura);
    }
}
