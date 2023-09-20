package pratica02_ex5;

import java.util.Scanner;

public class pratica02_ex5 {

		static Scanner scanner = new Scanner(System.in);
		
		public static double valorFuncao(double x) {
			if (x < -2) {
				return 2 * x + 2;
			}else if ( x >= -2 && x < 3) {
				return 3;
			}else {
				return -x;
			}
		}
		public static void main(String[] args) {
			System.out.println("Insira um falor para a função: ");
			double x = scanner.nextDouble();
			double valor = valorFuncao(x);
			System.out.println("O valor da função para x = " + x + " é " + valor);
			

	}
		
}
