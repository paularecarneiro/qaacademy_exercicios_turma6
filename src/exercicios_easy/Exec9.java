package exercicios_easy;

import javax.swing.*;

public class Exec9 {
    public static void main(String[] args) {
        //inicio Algoritmo
        int numeroDigitado, i = 1;
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Informar número da taboada: "));//Ler(5);
        while (i <= 10) {
            System.out.println("Taboada " + numeroDigitado + "x " + i + " = " + numeroDigitado * i);
            i = i + 1;
        }
    }
}
         //Fim Algoritmo




