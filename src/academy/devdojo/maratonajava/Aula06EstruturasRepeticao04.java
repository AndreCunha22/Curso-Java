package academy.devdojo.maratonajava;

public class Aula06EstruturasRepeticao04 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    //Condição o ValorParcela >=100
    public static void main(String[] args) {
        double ValorTotal = 10000;
        for (int Parcela = 0; Parcela <= ValorTotal; Parcela++) {
            double ValorParcela = ValorTotal / Parcela;
            if (ValorParcela >= 1000) {
                System.out.println("Parcela " + Parcela + "R$ " + ValorParcela);
            }else{
                break;
            }

        }
        {

        }


    }
}
