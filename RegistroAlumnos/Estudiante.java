public class Estudiante {
    // 1. Atributos Privados
    private String nombre;
    private double[] notas; // Usamos un arreglo (array) de tipo double para guardar múltiples notas

    // 2. Constructor que recibe nombre y notas
    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    // 3. Método para calcular el promedio de las notas
    public double calcularPromedio() {
        // Validación por seguridad: si no hay notas o el arreglo está vacío, retorna 0.0
        if (notas == null || notas.length == 0) {
            return 0.0;
        }
        
        double suma = 0;
        // Recorremos cada nota del arreglo y la sumamos acumulativamente
        for (double nota : notas) {
            suma += nota;
        }
        // Dividimos la suma total entre la cantidad de notas para obtener el promedio
        return suma / notas.length;
    }

    // 4. Método para saber si está aprobado (retorna true si el promedio es >= 6.0)
    public boolean estaAprobado() {
        return calcularPromedio() >= 6.0;
    }

    // 5. Método para mostrar la información completa del estudiante
    public void mostrarDatos() {
        double promedio = calcularPromedio();
        // Operador ternario: si 'estaAprobado()' es true muestra "Aprobado", sino "Desaprobado"
        String estado = estaAprobado() ? "Aprobado" : "Desaprobado";
        
        System.out.printf("Estudiante: %s | Promedio: %.2f | Estado: %s\n", nombre, promedio, estado);
    }
}