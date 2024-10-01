import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame las horas ");
        int horas1 = sc.nextInt();
        System.out.println("Digame los minutos ");
        int minutos1 = sc.nextInt();
        System.out.println("Digame los segundos ");
        int segundos1 = sc.nextInt();
        int resultado1 = (horas1*3600) + (minutos1*60) + segundos1;
        System.out.println("Dígame la siguiente hora ");
        int horas2 = sc.nextInt();
        System.out.println("Dígame los siguientes minutos ");
        int minutos2 = sc.nextInt();
        System.out.println("Dígame los siguientes segundos ");
        int segundos2 = sc.nextInt();
        int resultado2 = (horas2*3600) + (minutos2*60) + segundos2;
        int resultado3 = resultado2 - resultado1;
        int resultadohoras = resultado3/3600;
        int resultadominutos = ((resultado3-resultadohoras*3600)/60);
        int resultadosegundos = (resultado3-(resultadohoras*3600+resultadominutos*60));
        System.out.println("La diferencia de tiempo es " +resultadohoras+ "horas " +resultadominutos+ "minutos " +resultadosegundos+ "segunos ");
    }
}