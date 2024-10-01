import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame el radio de la circunferencia ");
        double radio = sc.nextDouble();
        final double pi = 3.14;
        double perimetro = 2*pi*radio;
        double area = radio*radio+pi;
        System.out.println("El perimetro de la circunferencia es "+perimetro);
        System.out.println("el área de la circunferencia es "+area);
    }
}