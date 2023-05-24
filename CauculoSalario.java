package exerciciosJava02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CauculoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat();
        System.out.println("informe quanto você ganha por hora");
  double valorHora = sc.nextDouble();
        System.out.println("Agora, informe a quantidade de horas trabalhadas por dia.");
        double quantidadeHora = sc.nextDouble();
int mes = 30;
double salario = valorHora * quantidadeHora * mes;
double impostoRenda = (0.11 * salario) /100;
double sindicato = (0.5 * salario) / 100;
double inss = (0.8*salario) / 100;
double salarioLiquido = salario - impostoRenda - inss - sindicato;
System.out.println("seu salário bruto é: " + salario + " e seu salário líquido é de: " + d.format(salarioLiquido) + ". Você pagou r$ " + impostoRenda + " de imposto de renda e pagou " + sindicato + " para o sindicato");
sc.close();
    }
}


