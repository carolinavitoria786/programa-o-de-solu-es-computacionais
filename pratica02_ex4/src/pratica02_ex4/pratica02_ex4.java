package pratica02_ex4;

import java.util.Scanner;

public class pratica02_ex4 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Insira o peso em kg: ");
		double peso = scanner.nextDouble();
		System.out.println("Insira a altura em metros: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if(imc < 20) {
			System.out.println("Abaixo do Peso");
		}else if (imc >= 20 && imc <= 25) {
			System.out.println("Normal");
		}else if (imc >= 25 && imc <= 30) {
			System.out.println("Sobrepeso");
		}else if (imc >= 30 && imc <40) {
			System.out.println("Obesidade");
		}else {
			System.out.println("Obesidade Mórbida");
		}
		scanner.close();
	}

}
