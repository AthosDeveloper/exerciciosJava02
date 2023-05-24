package exerciciosJava02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HorasTrabalhadas {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();
        System.out.println("informe o seu salário mensal");
double salario = sc.nextDouble();
int mes = 30;
        System.out.println("agora, informe as horas trabalhadas.");
        int horas = sc.nextInt();
        int horaTotal = horas * mes;
        double horaValor = salario / horaTotal;
    double salarioTotal = horaTotal * horaValor;
        System.out.println("A Quantidade de horas no mês é de: " + horaTotal + " e você ganha " + d.format(horaValor) + " mensal. Seu salário é de: " + salarioTotal);
    }
}


