package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("O Idioma do seu sistema é: "+ idioma.getDisplayLanguage());
        System.out.println(idioma.toString());
    }
    
}
