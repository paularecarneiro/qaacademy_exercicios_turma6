package exrcicios_medium;

import javax.swing.*;

public class Exec5 {
    public static void main(String[] args) {
        // Inicio Algoritmo
        int i = 1, anterior = 0, numeroDigitado = 0;
        while(i<=5){
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número")); //Ler();
            if(numeroDigitado<anterior || i==1){
                anterior = numeroDigitado;
            }
            i++;
        }
        System.out.println("O menor digitado é: "+anterior);

    }
    }
