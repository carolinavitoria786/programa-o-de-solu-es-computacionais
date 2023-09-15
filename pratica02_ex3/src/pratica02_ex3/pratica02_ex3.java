package pratica02_ex3;

import java.util.Scanner;

public class pratica02_ex3 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite a primeira nota(de 1 a 10): ");
		double nota01 = scanner.nextDouble();
		System.out.println("Digite a segunda nota(de 1 a 10): ");
		double nota02 = scanner.nextDouble();
		System.out.println("Digite a terceira nota(de 1 a 10): ");
		double nota03 = scanner.nextDouble();
		
		double media = (nota01 + nota02 + nota03) / 3;
		
		if (media >= 0 && media < 3) {
			System.out.println("REPROVADO");
		}else if(media >= 7 && media <=10) {
			System.out.println("APROVADO");
		}else {
			System.out.println("EXAME");
		}
		

	}

}
