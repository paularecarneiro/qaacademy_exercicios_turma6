package exercicios_easy;

import javax.swing.*;

public class Exec3 {
    public static void main(String[] args) {
       // Declarar variáveis do tipo texto : nome, sobrenome;

        String nome, sobrenome, auxiliar;
        nome = JOptionPane.showInputDialog("digite seu nome");
        sobrenome = JOptionPane.showInputDialog("Agora digite seu sobrenome");
        auxiliar = nome;
        nome = sobrenome;
        sobrenome = auxiliar;
        System.out.println("O nome e sobrenome é: " + sobrenome + " " + nome);





    }
}


//3-) Faça um algoritmo para ler dois valores, armazenar em variáveis, e exibir os valores das variáveis, trocados.
//        Ex1:
//        Inicio Algoritmo
//        Declarar variáveis do tipo texto : nome, sobrenome;
//        nome = Ler(“Silas”);
//        sobrenome = Ler(“Leão”);
//        Exibir: “O nome é ” + sobrenome + nome;
//        Fim Algoritmo
//        Ex2:
//        Inicio Algoritmo
//        Declarar variáveis do tipo texto : nome, sobrenome, auxiliar;
//        nome = Ler(“Silas”);
//        sobrenome = Ler(“Leão”);
//        auxiliar = nome;
//        nome = sobrenome;
//        sobrenome = auxiliar;
//        Exibir: “O nome é ” + nome + sobrenome;
//        Fim Algoritmo

