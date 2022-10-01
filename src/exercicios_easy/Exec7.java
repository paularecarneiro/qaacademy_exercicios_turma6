package exercicios_easy;

import javax.swing.*;

public class Exec7 {
    public double calculaInss (double salario){
double inss = 0.0;

//  Faça um algoritmo para ler um valor de salário,
//  calcular e exibir o valor do INSS a ser pago. Respeitando a tabela abaixo:
//Inicio Algoritmo

//float salario, inss;
//salario = Float.parseFloat(JOptionPane.showInputDialog("Informar salario: "));

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
        return inss;
    }
}

// Exercício 7 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do INSS a ser pago. Respeitando a tabela abaixo:
//Salário de Contribuição (R$) 	Alíquota
//Até R$ 1.045,00 >> 7,50% = 0,075
//De R$ 1.045,01 a R$ 2.089,60 	>> 9% = 0,009
//De R$ 2.089,61 até R$3.134,40 >>	12%	= 0,12
//De R$ 3.134,41 até R$ 6.101,06  >> 14%   = 0,14
