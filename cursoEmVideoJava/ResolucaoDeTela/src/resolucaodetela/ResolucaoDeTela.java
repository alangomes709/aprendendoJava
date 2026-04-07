package resolucaodetela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDeTela {

    public static void main(String[] args) {
        Toolkit algo = Toolkit.getDefaultToolkit();
        Dimension tamanhoDaTela = algo.getScreenSize();
        
        System.out.println("Altura: " + tamanhoDaTela.height);
        System.out.println("Largura: " + tamanhoDaTela.width);
}
    
}
