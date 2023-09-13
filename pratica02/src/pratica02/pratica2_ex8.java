package pratica02;

import java.util.*;

public class pratica2_ex8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	//Definição de produtos e seus respectivos preços.
	String[] produtos = {"Sapato", "Bolsa", "Camisa", "Calsa", "Blusa"};	
	double[] precos = {99.99, 103.89, 49.98, 89.72, 97.35};
	System.out.println("Informe o codigo do produto(1 a 5): ");
	
	int codigo = scanner.nextInt();
	//Criando um intervalo para o código. 
	if (codigo >=1 && codigo <=5) {
		String produto =  produtos[codigo];
		double preco = precos[codigo];
		System.out.println("Produto: " + produto);
		System.out.println("Preço: " + preco);
	}else {
		System.out.println("Código inesistente");
	}
	scanner.close();
	}
}
