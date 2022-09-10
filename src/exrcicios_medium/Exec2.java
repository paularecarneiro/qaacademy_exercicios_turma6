package exrcicios_medium;

import javax.swing.*;

public class Exec2 {
    public static void main(String[] args) {
        //Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a.
        // Ao final de 10 anos, exibir o valor investido, valor dos juros, e o total.
        // Considerando que a remuneração será no regime de juros compostos.

        //Inicio Algoritmo

        double valorInvestment, taxaJuros = 0.05, valorTotal, ano =1, valorJuros;

        valorInvestment = Double.parseDouble(JOptionPane.showInputDialog("Digite valor investido")); //(“1000,00”);
        valorTotal = valorInvestment;

        while (ano<=10) {

            valorTotal = (valorTotal * taxaJuros) + valorTotal;
            ano = ano + 1; //ano++
        }
        valorJuros = valorTotal - valorInvestment;

        System.out.println("Você investiu: " +valorInvestment);
        System.out.println("Rendeu: "+valorJuros + " de Juros");
        System.out.println("O Valor total: "+valorTotal);


    }
}
