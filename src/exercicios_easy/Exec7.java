package exercicios_easy;

import javax.swing.*;

public class Exec7 {
    public static void main(String[] args) {
//  Faça um algoritmo para ler um valor de salário,
//  calcular e exibir o valor do INSS a ser pago. Respeitando a tabela abaixo:
        //Inicio Algoritmo

        float salario, inss;

        salario = Float.parseFloat(JOptionPane.showInputDialog("Informar salario: "));
        if (salario <= 1045.00) {
            inss = (float) (salario * 0.075);
            System.out.println("O valor de INSS é: " + inss);
        }
        if (salario >= 1045.01 && salario <= 2089.60)
        {
            inss = (float) (salario * 0.09);
            System.out.println("O valor de INSS é: " + inss);
        }
        if (salario >= 2089.61 && salario <= 3134.40)
        {
            inss = (float) (salario * 0.12);
            System.out.println("O valor de INSS é: " + inss);
        }
        if (salario >= 3134.41) {
            inss = (float) (salario * 0.14);
            System.out.println("O valor de INSS é: " + inss);
        }
    }
}
