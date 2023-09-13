package pratica02_ex1;

import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Primeira nota: ");
		double nota01 = scanner.nextDouble();
		System.out.println("Pegunda nota: ");
		double nota02 = scanner.nextDouble();
		
		double media = (nota01 + nota02) / 2;
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado com " + media);
		}else {
			System.out.println("Aluno aprovado com " + media);
		}
		scanner.close();
	}

}
