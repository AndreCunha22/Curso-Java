package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se for maior que 5000 OPERADOR TERNARIO
        double salario = 5;
        String mensagemDoar = "Tenho como Fazer.";
        String mensagemNaoDoar = "NAO Tenho como Fazer.";
        // resultado ( condição ) ? true : false ;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
        }

    }

