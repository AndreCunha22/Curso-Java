package academy.devdojo.maratonajava;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Aula01HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date ();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());

        // Resolução da tela

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);

        // Idioma utilizado no SO

        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do seu sistema está configurado para: ");
        System.out.println(idioma.getDisplayLanguage());
    }

}

