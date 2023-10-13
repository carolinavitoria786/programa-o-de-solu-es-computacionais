package pratica02;

import java.util.Scanner;

public class pratica2_ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o comprimento do primeiro lado do triângulo:");
		double lado1 = scanner.nextDouble();
		System.out.println("Digite o comprimento do segundo lado do triângulo:");
		double lado2 = scanner.nextDouble();
		System.out.println("Digite o comprimento do terceiro lado do triângulo:");
		double lado3 = scanner.nextDouble();
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero: os três lados são iguais.");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Triângulo Isósceles: 2 lados são iguais.");
		} else {
			System.out.println("Triângulo Escaleno: 3 lados diferentes.");
		}
		scanner.close();
	}
}
