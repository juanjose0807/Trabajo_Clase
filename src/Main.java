import Models.Estudiante;
import Models.Materia;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        String nombre = sc.next();
        int edad= sc.nextInt();
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();


        Estudiante est1 = new Estudiante();
       //est1.setNombre("Juan");
        // est1.setEdad(20);
       //est1.setNotas(8.5, 9.0, 7.5);


       Materia mat1 = new Materia();
         mat1.setNombre("Matematicas");
         mat1.setCreditos(3);
         mat1.setCodigo("MAT101");
         mat1.setEstudiante(est1);

         System.out.println("Nombre del estudiante: " + mat1.getEstudiante().getNombre());
                 System.out.println("Edad del estudiante: " + mat1.getEstudiante().getEdad());
                 double[] notas = mat1.getEstudiante().getNota1();
                 System.out.println("Notas del estudiante: " + notas[0] + ", " + notas[1] + ", " + notas[2]);

        }


    }