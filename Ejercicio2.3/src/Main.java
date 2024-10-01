import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);
        System.out.println("Dígame el numero de partidos ganados ");
        int ganados = sc.nextInt();
        System.out.println("Digame el numero de partidos empatados");
        int empatados = sc.nextInt();
        System.out.println("Digame el numero de partidos perdidos");
        int perdidos = sc.nextInt();
        int puntos = (ganados*3) + empatados;
        System.out.println("Los puntos totales de su equipo son "+puntos);
    }
}