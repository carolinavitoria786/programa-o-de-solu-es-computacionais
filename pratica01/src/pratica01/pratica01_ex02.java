package pratica01;

import javax.swing.JOptionPane;

public class pratica01_ex02 {

	public static void main(String[] args) {
		String conversao2;
		
		int anoatual, anonascimento, idade;
		
		conversao2 = JOptionPane.showInputDialog("Informe o ano de seu nascimento: ");
		anonascimento = Integer.parseInt(conversao2);
		
		conversao2 = JOptionPane.showInputDialog("Informe o ano em que você está: ");
		anoatual = Integer.parseInt(conversao2);
		
		idade = anoatual - anonascimento;
		
		JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
		
	}

}
