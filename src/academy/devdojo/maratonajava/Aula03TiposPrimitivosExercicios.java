package academy.devdojo.maratonajava;
/*
    Prática

    Crie Variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>
    confirmo que recebi salário de <salário>, nada data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {

        String nome = "André";
        String endereço = "Rua vanadio lt 08 bla blabla ";
        double salario = 1000.89;
        String dataquererecebisalario = "18/07/2000";

        System.out.println("Eu "+nome+ " morando no "+endereço);
        System.out.println("confirmo que recebi salário de "+salario+ " na data "+dataquererecebisalario);
    }
}
