package exerciciosJava02;

import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número");
        int number = sc.nextInt();
        int anterior = number - 1;
        int proximo = number + 1;
        System.out.println("o número anterior a " + number +  " é: " + anterior + " e o próximo é: " + proximo);
    }
}
