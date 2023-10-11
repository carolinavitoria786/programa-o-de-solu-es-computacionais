package pratica01;

import javax.swing.JOptionPane;

public class pratica01_ex05 {

	public static void main(String[] args) {
		String conversao;
		
		double dmenor, dmaior, area;
		
		conversao = JOptionPane.showInputDialog("Insira a medida da Diagonal Maior:");
		dmaior = Double.parseDouble(conversao);
		
		conversao = JOptionPane.showInputDialog("Insira a medida da Diagonal Menor:");
		dmenor = Double.parseDouble(conversao);
		
		area = (dmenor * dmaior) / 2;
		
		JOptionPane.showMessageDialog(null, "A área do losango é: " + area);

	}

}
