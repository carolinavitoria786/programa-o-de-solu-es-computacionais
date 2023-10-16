package pratica01;

import java.util.Scanner;

public class pratica01_ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double dmaior, dmenor, area;
		
		System.out.println("Insira a medida da Diagonal maior: ");
		dmaior = input.nextDouble();
		
		System.out.println("Insira a medida da Diagonal menor: ");
		dmenor = input.nextDouble();
		
		area = (dmaior * dmenor) / 2;
		
		System.out.println("A área do losango é: " + area);
		
		input.close();
	}

}
