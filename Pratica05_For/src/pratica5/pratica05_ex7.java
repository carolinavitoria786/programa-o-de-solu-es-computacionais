package pratica5;
import java.util.Scanner;

public class pratica05_ex7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
			int maior = Integer.MIN_VALUE;
        	int menor = Integer.MAX_VALUE;
        	//para i começa em 1 enquanto i menor ou igual a 10			        	
        	for (int i = 1; i <= 10; i++) {
                System.out.print("Digite o número " + i + ": ");
                int numero = input.nextInt();
                
                if (numero > maior) {
                    maior = numero;
                }
                
                if (numero < menor) {
                    menor = numero;
                }
        	
        	}

			System.out.println("O maior número informado é: "+maior);
			System.out.println("O menor número Informado é: "+menor);
			input.close();
		}
	
}



