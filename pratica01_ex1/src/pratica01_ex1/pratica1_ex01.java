package pratica01_ex1;

import javax.swing.JOptionPane;

public class pratica1_ex01 {
    public static void main(String[] args) {
     
        String nota1Input = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String nota2Input = JOptionPane.showInputDialog("Digite a segunda nota: ");
        String nota3Input = JOptionPane.showInputDialog("Digite a terceira nota: ");

        double nota1 = Double.parseDouble(nota1Input);
        double nota2 = Double.parseDouble(nota2Input);
        double nota3 = Double.parseDouble(nota3Input);

        double media = (nota1 + nota2 + nota3) / 3.0;

        JOptionPane.showMessageDialog(null, "A média aritmética é: " + media);
    }
}

