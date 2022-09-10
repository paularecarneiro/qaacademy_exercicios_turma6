package exercicios_easy;

import javax.swing.*;

public class Exec5 {
    public static void main(String[] args) {
 //5 - Faça um algoritmo para ler três números inteiros, armazenar em
//variáveis, e exibir a soma, a subtração, multiplicação e a média dos três números
//digitados.
//Variavel inteiro: varNum1, varNum2, varNum3;
        int varNum1, varNum2, varNum3;
varNum1 = Integer.parseInt(JOptionPane.showInputDialog("digite um número"));
varNum2 = Integer.parseInt(JOptionPane.showInputDialog("digite um número"));
varNum3 = Integer.parseInt(JOptionPane.showInputDialog("digite um número"));

        varNum1 = varNum1 + varNum2 + varNum3;
        System.out.println("A soma é: " + varNum1);
        varNum1 = varNum1- varNum2 - varNum3;
        System.out.println("A subtração é: " + varNum1);
        varNum1 = varNum1 * varNum2 * varNum3;
        System.out.println("A multiplicação é: " + varNum1);
        varNum1 = varNum1 + varNum2 + varNum3 /3;
        System.out.println("A média é:" + varNum1);
    }
}






