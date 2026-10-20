public class Main {
    public static void main(String[] args) {
        // 1. Instanciar la cuenta con un saldo inicial
        CuentaBancaria miCuenta = new CuentaBancaria("Ana Pérez", 1500.50);

        System.out.println("--- Datos Iniciales ---");
        miCuenta.mostrarDatos();

        // 2. Probar depósito exitoso
        System.out.println("\n--- Operación de Depósito ---");
        miCuenta.depositar(500.0); // 1500.50 + 500 = 2000.50

        // 3. Probar retiro exitoso
        System.out.println("\n--- Operación de Retiro ---");
        miCuenta.retirar(200.0); // 2000.50 - 200 = 1800.50

        // 4. Probar caso de error: Fondos insuficientes
        System.out.println("\n--- Intentando Retirar de Más ---");
        miCuenta.retirar(3000.0); // Intenta retirar más de lo que tiene -> Muestra error

        // 5. Probar caso de error: Monto negativo
        System.out.println("\n--- Intentando Depositar Monto Negativo ---");
        miCuenta.depositar(-100.0); // Rechazado por la validación
    }
}