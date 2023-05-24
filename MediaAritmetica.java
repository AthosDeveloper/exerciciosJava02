package exerciciosJava02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();
        System.out.println("informe a primeira nota trimestral:");
double nota1 = sc.nextDouble();
        System.out.println("agora, informe a segunda nota trimestral:");
        double nota2 = sc.nextDouble();
        System.out.println("Informe a terceira nota trimestral:");
        double nota3 = sc.nextDouble();
        System.out.println("informe a quarta nota trimestral:");
  double nota4 = sc.nextDouble();
  double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("a média das notas é: " + d.format(media));
        sc.close();
    }
}
