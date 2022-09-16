package academy.devdojo.maratonajava;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // Outra forma de mostrar os arrays é vc criar ele com espaço determinado e os valores incluso
        // veja abaixo
        int [] numeros = new int [3];    // MODO NORMAL
        int [] numeros2 = {1,2,3,4,5};      // Incluido Valores e espaços
        numeros = new int[]{1,2,3};         // TBM é um metodo valido para classificar os arrays


        for (int i = 0; i < numeros2.length ; i++) {
            System.out.println(numeros2[i]);
        }
            for (int i : numeros2){
                System.out.println(i);

            }


    }
}
