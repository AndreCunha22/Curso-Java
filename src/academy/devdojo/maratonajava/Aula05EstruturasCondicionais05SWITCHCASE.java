package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais05SWITCHCASE {
    // imprima os dias da semanda cosiderando 1 como domingo
    public static void main(String[] args) {
        // O switch so aceita as variaveis do tipo:
        // char - int - byte - short - enum - String
        // CASO VC NAO COLOQUE O COMANDO -BREAK- E O CASE ESCOLHIDO TENHA MAIS CASE BAIXO...
        // ELE CONTINUARA EXECUTANDO O CODIGO ATE QUE ACABE O SWITCH.

        int dia = 10;
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("Opção invalida!");
                break;

        }
        char sexo = 'M';
        switch (sexo) {
            case 'm':
                System.out.println("sexo masculino!");
                break;
            case 'M':
                System.out.println("sexo masculino!");
                break;
            case 'f':
                System.out.println("sexo feminino");
                break;
            case 'F':
                System.out.println("sexo feminino");
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }

    }
}
