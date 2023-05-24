package exerciciosJava02;

import java.util.Scanner;

public class MinutsToSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os minutos a serem convertidos");
        int minuts = sc.nextInt();
        int seconds = minuts * 100;
        System.out.println("a quantidade de segundos é de: " + seconds);
        sc.close();
    }
}
