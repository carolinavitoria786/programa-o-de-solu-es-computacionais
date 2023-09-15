package pratica02_ex2;

import java.util.Scanner;
public class pratica02_ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Comprimento do lado A do Triângulo: ");
		double ladoA = scanner.nextDouble();
		System.out.println("Comprimento do lado B do Triângulo: ");
		double ladoB = scanner.nextDouble();
		System.out.println("Comprimento do lado C do Triângulo: ");
		double ladoC = scanner.nextDouble();
		//definindo condições.
		if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println("Este é um triângulo Equilátero, os três lados são iguais.");
		}else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
		// conjunção - AND(&&), disjunção - OR(||), negação - NOT(!a).
			System.out.println("Este é um triângulo Isóceles, possui dois lados iguais.");
		}else {
			System.out.println("Este é um triângulo Escaleno, todos os lados são diferentes.");
		}
		scanner.close();

	}

}
