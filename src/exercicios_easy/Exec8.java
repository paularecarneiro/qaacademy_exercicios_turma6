package exercicios_easy;

public class Exec8 {
    public String calcularIr(double salarioBruto) {
        String calculo = " ";

        if (salarioBruto<=1903.98) {
            double ir=(salarioBruto*1)-0;
            calculo= ("Isento de Imposto de Renda");
//          calculo= ("O valor do seu imposto de renda é " + ir)+("O valor do seu salario bruto é " + salarioBruto)+("O valor do seu salario liquido é " + (salarioBruto - ir));
        }
        if (salarioBruto>=1903.99&&salarioBruto<=2826.65) {
            double ir= ((salarioBruto*0.075)-142.80);
            calculo=("O valor do seu imposto de renda é " + ir)+("O valor do seu salario bruto é " + salarioBruto)+("O valor do seu salario liquido é " + (salarioBruto - ir));
        }
        if (salarioBruto>=2826.66&&salarioBruto<=3751.05) {
            double ir= ((salarioBruto*0.15)-354.80);
            calculo=("O valor do seu imposto de renda é " + ir)+("O valor do seu salario bruto é " + salarioBruto)+("O valor do seu salario liquido é " + (salarioBruto - ir));
        }
        if (salarioBruto>=3751.06&&salarioBruto<=4664.68) {
            double ir= ((salarioBruto*0.225)-636.13);
            calculo=("O valor do seu imposto de renda é " + ir)+("O valor do seu salario bruto é " + salarioBruto)+("O valor do seu salario liquido é " + (salarioBruto - ir));
        }
        if (salarioBruto>=4664.68) {
            double ir= ((salarioBruto*0.275)-869.36);
            calculo=("O valor do seu imposto de renda é " + ir)+("O valor do seu salario bruto é " + salarioBruto)+("O valor do seu salario liquido é " + (salarioBruto - ir));
        }
        return calculo;
    }
    }
// System.out.println("O valor Salario Bruto: " + ir);
// System.out.println("O valor Salario Liquido: " + ir);
// System.out.println("O valor Imposto a pagar é: " + ir);
// }
//Fim Algoritmo
//Exercício 8 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//        valor do salário bruto, valor do salário líquido e o valor do imposto de renda.
//        Respeitando a tabela abaixo:
//
//        Base de cálculo 			Alíquota 				Dedução
//        de 0,00 até 1.903,98 		isento 					0
//        de 1.903,99 até 2.826,65 	7,50% 	= 0,075			142,8
//        de 2.826,66 até 3.751,05 	15,00% 	= 0,15			354,8
//        de 3.751,06 até 4.664,68 	22,50% 	= 				636,13
//        a partir de 4.664,68 		27,50% 	=				869,36
