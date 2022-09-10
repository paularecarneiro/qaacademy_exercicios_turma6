package exercicios_easy;

import javax.swing.*;

public class Exec10 {
    public static void main(String[] args) {
        //Inicio Algoritmo
        double valorInvestimento, taxaJuros, valorJuros, valorTotal, ano = 0;

        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite valor")); //Ler (1000,00);

        taxaJuros = 0.05 * 10;

        valorJuros = valorInvestimento * taxaJuros;
        valorTotal = valorJuros + valorInvestimento;


            System.out.println("Você investiu: "+valorInvestimento);
            System.out.println("Rendeu : "+valorJuros + " de Juros");
            System.out.println("O Valor total é : "+valorTotal);

        }

    }



