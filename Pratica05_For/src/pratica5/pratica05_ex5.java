//importo a classe scanner para ler o que for digitado como a quantidade de idades
package pratica5;

import java.util.Scanner;

public class pratica05_ex5 {

	public static void main(String[] args) {
//classe pratica05_ex4 com o método main para q seja acessado de qualquer lugar		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a quantidade de números que deseja inserir: ");
        int quantidade = input.nextInt();
        
        if (quantidade <= 0) {
            System.out.println("error");
        }else {
        	int maior = Integer.MIN_VALUE;
        	int menor = Integer.MAX_VALUE;
//para i começa em 1 enquanto i menor ou igual a variavel quantidade			
		for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = input.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
//se maior diferente do minimo e menor diferente do maximo imprima..., caso n imprima erro		
		if(maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
			System.out.println("O maior número informado é: "+maior);
			System.out.println("O menor número Informado é: "+menor);
		}else {
			System.out.println("error");
        	}
        }
        input.close();
	}
}