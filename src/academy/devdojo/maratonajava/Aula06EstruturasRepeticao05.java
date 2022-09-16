package academy.devdojo.maratonajava;

public class Aula06EstruturasRepeticao05 {
    // Parcela de forma decrescente
    public static void main(String[] args) {
        double ValorTotal = 30000;
        for (int Parcela = (int) ValorTotal; Parcela >= 1; Parcela--) {
            double ValorParcela = ValorTotal / Parcela;
            if (ValorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + Parcela + "R$ " + ValorParcela);
        }

    }
}

