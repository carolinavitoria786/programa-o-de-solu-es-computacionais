package pratica01;

import javax.swing.JOptionPane;

public class pratica01_ex03 {
	public static final double cotacaodolar = 4.88;
	
	public static void main(String[] args) {
		String conversao;
		
		double dolar, reais;
		
		conversao = JOptionPane.showInputDialog("Insira o valor em dólares: ");
		dolar = Double.parseDouble(conversao);
		
		reais = dolar * cotacaodolar;
		
		JOptionPane.showMessageDialog(null, "Seu valor em reais é: " + reais);
		
	}

}
