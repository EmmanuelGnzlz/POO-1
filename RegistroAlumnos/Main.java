public class Main {
    public static void main(String[] args) {
        // 1. Creamos arreglos independientes con las notas de distintos alumnos
        double[] notasJuan = {7.5, 8.0, 6.5, 9.0};
        double[] notasMaria = {4.0, 5.5, 6.0};
        double[] notasCarlos = {9.0, 9.5, 10.0};

        // 2. Instanciamos a los estudiantes pasándoles su nombre y su arreglo de notas
        Estudiante estudiante1 = new Estudiante("Juan Pérez", notasJuan);
        Estudiante estudiante2 = new Estudiante("María Gómez", notasMaria);
        Estudiante estudiante3 = new Estudiante("Carlos López", notasCarlos);

        // 3. Mostramos los resultados por pantalla
        System.out.println("--- Registro de Alumnos y Promedios ---");
        estudiante1.mostrarDatos(); // Promedio alto -> Aprobado
        estudiante2.mostrarDatos(); // Promedio bajo -> Desaprobado
        estudiante3.mostrarDatos(); // Promedio excelente -> Aprobado
    }
}