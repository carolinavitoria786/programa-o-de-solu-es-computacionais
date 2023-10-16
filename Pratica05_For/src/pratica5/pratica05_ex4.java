//importo a classe scanner para ler o que for digitado como a quantidade de idades
package pratica5;

import java.util.Scanner;
	
	public class pratica05_ex4 {
		public static void main(String[] args) { 
//classe pratica05_ex4 com o método main para q seja acessado de qualquer lugar
			Scanner input = new Scanner(System.in);
//Usando input para que o programa leia o que o usuario digitar
			System.out.print("Digite a quantidade de idades que deseja informar: ");
	        int contador = input.nextInt();
//Caso o valor n seja valido <= 0 o programa se encerra após a mensagem de erro e retorna para main
	        if (contador <= 0) {
	            System.out.println("Quantidade inválida. O programa será encerrado.");
	            input.close();
	            return;
	        }
//Adiciono a variavel soma_de_idades que começa em 0	        
	        int soma_de_idades = 0;
//para i começa em 1 enquanto i menor ou igual a variavel contador	      
	        for (int i = 1; i <= contador; i++) {
	            System.out.print("Digite a idade " + i + ": ");
	            int idade = input.nextInt();
	            
	            soma_de_idades = soma_de_idades + idade;
	        }
			
			input.close();
			//double para decimais
			if(contador > 0) {
				double media = (double) soma_de_idades / contador;
				System.out.printf("A média das %d idades é: %.2f%n", contador, media);
			}else {
				System.out.println("error.");
			}
		}
}
