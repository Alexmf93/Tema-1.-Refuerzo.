import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    Scanner sc = new Scanner(System.in);
    System.out.println("Inroduzca el nombre del alumno ");
    String cadena = sc.nextLine();
    System.out.println("Digame la nota practica del alumno ");
    double practica = sc.nextDouble();
    System.out.println("Digame la nota de problemas del alumno ");
    double problemas = sc.nextDouble();
    System.out.println("Digame la nota teorica del alumno ");
    double teorica = sc.nextDouble();
    double nota = (practica*0.1) + (problemas*0.5) + (teorica*0.4);
    System.out.println("La nota total del alumno " +cadena + " es "+nota);
    }
}