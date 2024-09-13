// Clase Estudiante con métodos setGet
public class Estudiante {
    private String nombre;
    private int matricula;
    private int semestre;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, int matricula, int semestre, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    // Método setGet para nombre
    public String nombre(String nuevoNombre) {
        if (nuevoNombre != null) {
            this.nombre = nuevoNombre;
        }
        return this.nombre;
    }

    // Método setGet para matricula
    public int matricula(int nuevaMatricula) {
        if (nuevaMatricula > 0) {
            this.matricula = nuevaMatricula;
        }
        return this.matricula;
    }

    // Método setGet para semestre
    public int semestre(int nuevoSemestre) {
        if (nuevoSemestre > 0) {
            this.semestre = nuevoSemestre;
        }
        return this.semestre;
    }

    // Método setGet para promedio
    public double promedio(double nuevoPromedio) {
        if (nuevoPromedio >= 0) {
            this.promedio = nuevoPromedio;
        }
        return this.promedio;
    }

    // Método para mostrar información del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        // Crear tres objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Mariana Gomez", 202301001, 5, 9.1);
        Estudiante estudiante2 = new Estudiante("Luis Ruiz", 202301002, 7, 8.7);
        Estudiante estudiante3 = new Estudiante("Andrea Lopez", 202301003, 3, 9.4);

        // Usar setGet para actualizar y obtener atributos
        estudiante1.promedio(9.2); // Cambiar promedio de Mariana
        System.out.println("Promedio actualizado de Mariana: " + estudiante1.promedio(-1));

        // Mostrar información de los estudiantes
        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
        estudiante3.mostrarInfo();
    }
}
