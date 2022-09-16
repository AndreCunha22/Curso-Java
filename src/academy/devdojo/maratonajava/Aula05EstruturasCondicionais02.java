package academy.devdojo.maratonajava;

import org.w3c.dom.ls.LSOutput;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        /* Idade < 15 infantil
        * Idade >= 15 && < 18 Juvenil
        * Idade > 18 Adulto
         */
        int idade = 20;
        String categoria;

        if (idade < 15){
            categoria = "Infantil";
        }else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        }else{
            categoria = ("adulto");
        }
        System.out.println(categoria);
    }
}
