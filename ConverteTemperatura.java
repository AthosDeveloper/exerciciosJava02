package exerciciosJava02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConverteTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();
        System.out.println("informe a temperatura em fahrenheit ");
        double fahrenheit = sc.nextDouble();
        double selsios = (fahrenheit - 32) * (5.0/9.0);
        System.out.println("a temperatura em selsios é de: " + selsios);
        sc.close();
    }
}
