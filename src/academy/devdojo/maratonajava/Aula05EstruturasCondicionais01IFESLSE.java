package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais01IFESLSE {
    public static void main(String[] args) {
        int idade = 15;
        boolean AutorizadoComprarBebida = idade >= 18;

        // ! Quando aparece esete sinal na frente da variavel true é o mesmo que ( == false ), ou seja SENAO (else)

        if (AutorizadoComprarBebida){
            System.out.println("Voce pode comprar a bebida alcoolica.");
            }else{
            System.out.println("papi noel");
        }
        if (!AutorizadoComprarBebida){
            System.out.println("Voce NAO pode comprar a bebida alcoolica.");
            }
        System.out.println("fora do if ");
    }
}
