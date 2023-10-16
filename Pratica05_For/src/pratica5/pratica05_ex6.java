package pratica5;
import java.util.Scanner;

public class pratica05_ex6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cont = 0;
//para i começa em 1 enquanto i menor ou igual a 10			
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um numero: "+ i +": ");
		
			int idade = input.nextInt();
			cont = cont + idade;
		}
		input.close();
		//double para decimais
		double media = (double) cont / 10;
		System.out.println("A média das idades informadas é: "+ media);
		}
		
}
