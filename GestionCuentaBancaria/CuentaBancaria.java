public class CuentaBancaria {
    // 1. Atributos Privados (Encapsulamiento de datos sensibles)
    private String titular;
    private double saldo;

    // 2. Constructor con validación de saldo inicial
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        // Si el saldo inicial es mayor o igual a 0, lo asigna; de lo contrario, arranca en 0.0
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0.0;
    }

    // 3. Método para depositar dinero
    public void depositar(double monto) {
        // Validamos que el monto a depositar sea positivo (mayor a 0)
        if (monto > 0) {
            this.saldo += monto; // Suma el monto al saldo actual
            System.out.println("Depósito exitoso de $" + monto + ". Saldo actual: $" + this.saldo);
        } else {
            System.out.println("[Error] El monto a depositar debe ser mayor a 0.");
        }
    }

    // 4. Método para retirar dinero
    public void retirar(double monto) {
        // Validamos dos cosas: que el monto sea positivo Y que haya suficiente dinero (saldo disponible)
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto; // Resta el monto al saldo actual
            System.out.println("Retiro exitoso de $" + monto + ". Saldo actual: $" + this.saldo);
        } else if (monto > this.saldo) {
            // Caso donde se intenta retirar más de lo que se tiene
            System.out.println("[Error] Fondos insuficientes. No se puede retirar $" + monto + " (Saldo actual: $" + this.saldo + ").");
        } else {
            // Caso donde intentan retirar un número negativo o cero
            System.out.println("[Error] El monto a retirar debe ser mayor a 0.");
        }
    }

    // 5. Método para mostrar los datos de la cuenta
    public void mostrarDatos() {
        System.out.printf("Titular: %s | Saldo disponible: $%.2f\n", titular, saldo);
    }
}