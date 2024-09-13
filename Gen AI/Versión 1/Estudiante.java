// Clase Estudiante
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

    // Métodos getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para matricula
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Métodos getter y setter para semestre
    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // Métodos getter y setter para promedio
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
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

        // Utilizar los getters y setters
        estudiante1.setPromedio(9.2); // Cambiar promedio de Mariana
        System.out.println("Promedio actualizado de Mariana: " + estudiante1.getPromedio());

        // Mostrar información de los estudiantes
        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
        estudiante3.mostrarInfo();
    }
}
