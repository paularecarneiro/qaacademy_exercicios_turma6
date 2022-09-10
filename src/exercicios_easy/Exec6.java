package exercicios_easy;

import javax.swing.*;

public class Exec6 {  // Inicio Algoritmo

    public static void main(String[] args) {
        int nota1, nota2, media;
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informar a primeira nota: "));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informar a segunda nota: "));
        media = (nota1 + nota2) / 2;

        if (media > 5) {
            System.out.println("Você foi Aprovado!! :)");
        }
        if (media < 5) {
            System.out.println("Você foi Reprovado.");
        }
        if (media == 5) {
            System.out.println("Você ficou de Exame.");
        }
    }

}
