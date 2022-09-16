package academy.devdojo.maratonajava;

import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais04 {
//    EU  0  EU 34,712  9.70%
//    EU  34,713  EU 68,507  37.35%
//    EU  68,508  49.50%
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
        }else if ( salarioAnual >= 34712 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaixa;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("Pagara a Taixa de : "+ valorImposto);
    }
}
