package pratica02;

import java.util.Scanner;

public class pratica2_ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno:");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota do aluno:");
		double nota2 = scanner.nextDouble();
		double media = (nota1 + nota2) / 2.0;
		System.out.println("Média do aluno: " + media);
		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		scanner.close();
	}
}
