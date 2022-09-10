package exrcicios_medium;

import javax.swing.*;

public class Exec8_1 {
    public static void main(String[] args) {

        String vetorMeses[] = new String[12];
        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Set";
        vetorMeses[9] = "Out";
        vetorMeses[10] = "Nov";
        vetorMeses[11] = "Dez";

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite qual númedo do mÊs"));
        System.out.println("O mês é: " + vetorMeses[num-1]);
    }
}

