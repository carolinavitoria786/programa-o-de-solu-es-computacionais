package pratica5;
import java.util.Scanner;

	public class pratica05_ex8 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Digite um número: ");
			int n1 = input.nextInt();
			System.out.print("Digite um número: ");
			int n2 = input.nextInt();
			int resultado = calculo_da_potencia(n1, n2);
			System.out.println(n1 + " elevado a " + n2 + "é igual a " +resultado);
			input.close();
	}
//usando o metodo de calculo_da_potencia para os valores n1 e n2 edefinindo o resultado igual a 1		
	public static int calculo_da_potencia(int n1, int n2) {
	 int resultado = 1;
	 if(n2 < 0) {
		 System.out.println("error.");
		 return -1;
	 }
	 for(int i=0; i < n2; i++) {
		 resultado = resultado * n1;
	 }
	 return resultado;
 }
}
