package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais05Exercicios {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7 imprima se é dia útil ou FDS
        //Considerando 1 como Domingo

        int dia = 5;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Invalida.");


        }
    }
}
