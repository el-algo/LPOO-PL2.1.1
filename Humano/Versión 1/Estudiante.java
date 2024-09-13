/*
* Crear la clase llamada Estudiante, con al menos TRES ATRIBUTOS.
    (Debe ser atributos propios de un alumno).
* Crear los métodos set y get para cada atributo. El método set debe recibir
    como parámetro el valor del atributo correspondiente. El método get debe
    regresar el valor del atributo correspondiente.
* Hacer un programa para manejar (capturar y desplegar) los datos de al menos
    tres estudiantes. Cada estudiante debe ser un objeto independiente.
* Los valores de los datos del estudiante deben ser manejados mediante el
    método set.
* Los valores de los datos del estudiante deben ser desplegados con el método
    println (de System.out) y usando los métodos get correspondientes.
*/
import java.util.Scanner;

public class Estudiante {
    String nombre;
    int matricula;
    int semestre;
    double promedio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public static void main(String[] args) {
        Estudiante [] misEstudiantes = new Estudiante [3];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            misEstudiantes[i] = new Estudiante();

            System.out.print("Nombre de estudiante: ");
            misEstudiantes[i].setNombre(entrada.nextLine());
            System.out.print("Matricula: ");
            misEstudiantes[i].setMatricula(entrada.nextInt());
            System.out.print("Semestre actual: ");
            misEstudiantes[i].setSemestre(entrada.nextInt());
            System.out.print("Promedio: ");
            misEstudiantes[i].setPromedio(entrada.nextDouble());

            entrada.nextLine();
            System.out.println("\nNombre: " + misEstudiantes[i].getNombre());
            System.out.println("Matricula: " + misEstudiantes[i].getMatricula());
            System.out.println("Semestre: " + misEstudiantes[i].getSemestre());
            System.out.println("Promedio: " + misEstudiantes[i].getPromedio()+"\n");
        }
    }
}