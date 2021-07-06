package exercicio1;

import javax.swing.JOptionPane;

public class Exer17 {

	public static void main(String[] args) {
		String idade = JOptionPane.showInputDialog("Qual sua idade? ");
		int vl = Integer.parseInt(idade);
		String relatorio = "";
		if(vl >= 18) {
			relatorio = " Você ja pode tirar a carteira de motorista";
		} else {
			relatorio = "Você não pode ser motorista";
		}
		
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
	}

}
