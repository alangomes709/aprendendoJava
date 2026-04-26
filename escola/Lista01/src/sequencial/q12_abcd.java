package sequencial;

import java.util.Scanner;

public class q12_abcd {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numA=0, numB=0, numC=0, numD=0;
        System.out.println("Digite valor de numA: ");
        numA = ler.nextDouble();
        System.out.println("Digite valor de numB: ");
        numB = ler.nextDouble();
        System.out.println("Digite valor de numC: ");
        numC = ler.nextDouble();
        System.out.println("Digite valor de numD: ");
        numD = ler.nextDouble();
        System.out.println("A+B = "+ (numA+numB));
        System.out.println("A+C = "+ (numA+numC));
        System.out.println("A+D = "+ (numA+numD));
        System.out.println("A*B = "+ (numA*numB));
        System.out.println("A*C = "+ (numA*numC));
        System.out.println("A*D = "+ (numA*numD));
        System.out.println("A/B = "+ (numA/numB));
        System.out.println("A/C = "+ (numA/numC));
        System.out.println("A/D = "+ (numA/numD));
        System.out.println("A-B = "+ (numA-numB));
        System.out.println("A-C = "+ (numA-numC));
        System.out.println("A-D = "+ (numA-numD));
    }
    
}
