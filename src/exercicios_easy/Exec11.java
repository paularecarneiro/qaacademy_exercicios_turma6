package exercicios_easy;

import javax.swing.*;

public class Exec11 {
    public static void main(String[] args) {
        int num = 0, i=1;
        Integer.parseInt(JOptionPane.showInputDialog ("Digite um numero"));
        while (i<=100) {
            num = (num+2);
            System.out.println("A soma é:" + num);
            i = (i+1);
        }

    }
}
