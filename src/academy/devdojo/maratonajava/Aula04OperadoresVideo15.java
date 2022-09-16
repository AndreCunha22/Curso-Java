package academy.devdojo.maratonajava;

import java.sql.SQLOutput;

public class Aula04OperadoresVideo15 {
    public static void main(String[] args) {
        // Operadores basicos + - * /

        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(numero01 - numero02);
        System.out.println(numero01 + numero02);
        System.out.println(numero01 * numero02);
        System.out.println(resultado);

        // resto da divisão %,
        System.out.println(" Operador de resto da divisão");
        int resto = 21 % 2;
        System.out.println(resto);

        // (<) menor | (>) maior (<=)menor igual (>=)maior igual
        // (==)igual comparação  (!=) diferente
        //ESSES OPERADORES SEMPRE RETORNAM VALORES BOOLEAN !!!

        boolean isdezmaiorquevinte = 10 > 20;
        boolean isdezmenorquevinte = 10 < 20;
        boolean isdezigualavinte = 10 == 20;
        boolean isdezdiferentevinte = 10 != 20;

        System.out.println("10 e maior que 20? " + isdezmaiorquevinte);
        System.out.println("10 e menor que 20? " + isdezmenorquevinte);
        System.out.println("10 e igual a 20? " + isdezigualavinte);
        System.out.println("10 e diferente a 20? " + isdezdiferentevinte);
        System.out.println();

        // Operadores logicos && ( e = AND ) || ( ou = OR )

        int idade = 29;
        double salario = 3500;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println();

        double contaCorrente = 200;
        double contaPoupanca = 10000;
        float play5 = 5000F;
        boolean compraPlay5 = contaCorrente > play5 || contaPoupanca > play5;
        System.out.println("Vou ter dindin pro play 5? "+compraPlay5);
        System.out.println();

        //Operadores de Atribuição = += -= *= /= %=

        double bonus = 1800;
        bonus += 200; // bonus = 2000
        bonus -= 100; // bonus = 1900
        bonus *= 2; // bonus = 1900*2 = 3800
        bonus /= 2; // bonus = 3800/2 = 1900
        bonus %= 2; // bonus res to de 2 = 0
        System.out.println("bonus "+bonus);
        System.out.println();

        // ++ --
        int contador = 0;
        contador ++;
        contador --;
        ++contador;
        --contador;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(++contador2);
        System.out.println(contador2++); //ele primeiro executou a ação de imprimir o contador para só depois somar mais 1
        System.out.println(contador2);
        System.out.println();

        





    }
}
