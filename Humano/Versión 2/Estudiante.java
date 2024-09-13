/*
* Una vez compilada y corrida esa primera versión, intentar hacer una segunda
    versión de métodos, donde con un mismo método se intente recibir y
    desplegar el valor de un atributo. Llamar a este método setGet...
*/
import java.util.Scanner;

public class Estudiante {
    String nombre;
    int matricula;
    int semestre;
    double promedio;

    public void setGetNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Nombre: " + this.nombre);
    }

    public void setGetMatricula(int matricula) {
        this.matricula = matricula;
        System.out.println("Matricula: " + this.matricula);
    }

    public void setGetSemestre(int semestre) {
        this.semestre = semestre;
        System.out.println("Semestre: " + this.semestre);
    }

    public void setGetPromedio(double promedio) {
        this.promedio = promedio;
        System.out.println("Promedio: " + this.promedio);
    }

    public static void main(String[] args) {
        Estudiante [] misEstudiantes = new Estudiante [3];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            misEstudiantes[i] = new Estudiante();

            System.out.print("Nombre de estudiante: ");
            misEstudiantes[i].setGetNombre(entrada.nextLine());
            System.out.print("Matricula: ");
            misEstudiantes[i].setGetMatricula(entrada.nextInt());
            System.out.print("Semestre actual: ");
            misEstudiantes[i].setGetSemestre(entrada.nextInt());
            System.out.print("Promedio: ");
            misEstudiantes[i].setGetPromedio(entrada.nextDouble());
            
            entrada.nextLine();
        }
    }
}