public class Producto {
    // 1. Atributos Privados (Encapsulamiento)
    private String nombre;
    private double precio;
    private int stock;

    // 2. Constructor con validaciones
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        // Operador ternario: (condicion) ? valor_si_verdadero : valor_si_falso
        // Si el precio recibido es >= 0, lo guarda. Si es menor a 0, asigna 0.0
        this.precio = precio >= 0 ? precio : 0.0;
        // Lo mismo para el stock: si es negativo, lo fuerza a 0.
        this.stock = stock >= 0 ? stock : 0;
    }

    // 3. Método para actualizar stock (Sumar o Restar)
    public void actualizarStock(int cantidad) {
        // Validamos si al sumar/restar la 'cantidad', el resultado final sigue siendo >= 0
        if (this.stock + cantidad >= 0) {
            this.stock += cantidad; // Modifica el atributo stock
            System.out.println("Stock actualizado correctamente. Nuevo stock: " + this.stock);
        } else {
            // Si el stock resultado es negativo, no modifica nada y muestra un error
            System.out.println("[Error] No se puede realizar la operación. El stock quedaría en negativo.");
        }
    }

    // 4. Método para mostrar datos
    public void mostrarDatos() {
        // System.out.printf permite dar formato a la salida (%s = String, %.2f = decimal con 2 decimales, %d = entero)
        System.out.printf("Producto: %s | Precio: $%.2f | Stock: %d\n", this.nombre, this.precio, this.stock);
    }
}