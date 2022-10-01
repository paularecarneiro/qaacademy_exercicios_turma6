package exercicios_easy;

import javax.swing.*;

public class Exec6 {  // Inicio Algoritmo



    public String suaNota (double nota1, double nota2, double resultado) {
        resultado = (nota1 + nota2) / 2;
        if (resultado > 5) {
          return "Você foi Aprovado!!";
    }
        if (resultado < 5) {
        return "Você foi Reprovado.";
    }
        if (resultado == 5) {
            return "Você ficou de Exame.";
    }
        return "Não foi possível calcular sua nota";



//        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informar a primeira nota: "));
//        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informar a segunda nota: "));
//        media = (nota1 + nota2) / 2;
//
//        if (media > 5) {
//            System.out.println("Você foi Aprovado!! :)");
//        }
//        if (media < 5) {
//            System.out.println("Você foi Reprovado.");
//        }
//        if (media == 5) {
//            System.out.println("Você ficou de Exame.");
//        Exercício 6 - Faça um algoritmo para ler duas notas, calcular a média. E
//        SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media = 5
//        exibir exame.
//        }
    }

}
