package exercicios_easy;

public class Exec7 {
    public String salario(double valorSalario) {
        String imposto = "";
        if(valorSalario<=1045.00){
            imposto= (("O valor do INSS a ser pago é ")+valorSalario*0.075);}
        if(valorSalario>=1045.01&&valorSalario<=2089.60){
            imposto=(("O valor do INSS a ser pago é ")+valorSalario*0.09);}
        if(valorSalario>=2089.61&&valorSalario<=3134.40){
            imposto=(("O valor do INSS a ser pago é ")+valorSalario*0.12);}
        if(valorSalario>=3134.41){
            imposto=(("O valor do INSS a ser pago é ")+valorSalario*0.14);}
        return imposto;

}
}

// Exercício 7 - Faça um algoritmo para ler um valor de salário, calcular e exibir o
//valor do INSS a ser pago. Respeitando a tabela abaixo:
//Salário de Contribuição (R$) 	Alíquota
//Até R$ 1.045,00 >> 7,50% = 0,075
//De R$ 1.045,01 a R$ 2.089,60 	>> 9% = 0,009
//De R$ 2.089,61 até R$3.134,40 >>	12%	= 0,12
//De R$ 3.134,41 até R$ 6.101,06  >> 14%   = 0,14
