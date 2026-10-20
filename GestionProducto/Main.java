public class Main {
    public static void main(String[] args) {
        // 1. Instanciación: Crea el objeto 'miProducto' llamando al constructor
        Producto miProducto = new Producto("Teclado Mecánico", 45.50, 10);

        System.out.println("--- Datos Iniciales ---");
        miProducto.mostrarDatos();

        // 2. Prueba de suma de stock
        System.out.println("\n--- Sumando stock (+5) ---");
        miProducto.actualizarStock(5); // Pasa de 10 a 15
        miProducto.mostrarDatos();

        // 3. Prueba de resta inválida (exceso)
        System.out.println("\n--- Intentando restar demasiado stock (-25) ---");
        miProducto.actualizarStock(-25); // 15 - 25 = -10 (Rechazado, se mantiene en 15)
        miProducto.mostrarDatos();

        // 4. Prueba de resta válida
        System.out.println("\n--- Restando stock válido (-8) ---");
        miProducto.actualizarStock(-8); // 15 - 8 = 7
        miProducto.mostrarDatos();
    }
}