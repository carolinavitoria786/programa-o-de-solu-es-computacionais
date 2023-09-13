package pratica01;

import java.util.Scanner;

public class pratica1_ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota01 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota02 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota03 = input.nextDouble();
        
        double media = (nota01 + nota02 + nota03) / 3.0;

        System.out.println("A média aritmética é: " + media);

        input.close();
    }
}
