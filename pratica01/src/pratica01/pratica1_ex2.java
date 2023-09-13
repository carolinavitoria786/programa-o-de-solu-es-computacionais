package pratica01;

import java.util.Scanner;

public class pratica1_ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o ano de nascimento: ");
		int anoDeNascimento = input.nextInt();
		System.out.print("Insira o ano atual: ");
		int anoAtual = input.nextInt();
		
		int idade = anoAtual - anoDeNascimento;
		int idade2050 = 2050 - anoDeNascimento;
		
		System.out.println("A idade da pessoa neste ano é: " + idade + "anos.");
		System.out.println("A idade da pessoa no ano de 2050 será: " + idade2050 + "anos.");
		input.close();
		
	}

}
