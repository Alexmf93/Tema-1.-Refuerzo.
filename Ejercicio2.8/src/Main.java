import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el dia de su nacimiento ");
        int dia = sc.nextInt();
        System.out.println("Introduzca el mes de su nacimiento");
        int mes = sc.nextInt();
        System.out.println("Introduzca el año de su nacimiento ");
        int año = sc.nextInt();
        int suma = (dia + mes + año);
        System.out.println("la suma es "+suma);
        int digito1 = suma/1000;
        int digito2 = (suma/100)%10;
        int digito3 = (suma/10)%10;
        int digito4 = (suma/1)%10;
        int suerte = digito1 + digito2 + digito3 + digito4;
        System.out.println("Su número de la suerte es " +suerte);
    }
}