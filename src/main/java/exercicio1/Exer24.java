package exercicio1;

import javax.swing.JOptionPane;

public class Exer24 {

	public static void main(String[] args) {

		String qtd = JOptionPane.showInputDialog("Digite quantos filhos você tem? ");
		int filhos = Integer.parseInt(qtd);
		String rel = "";
		for (int ct = 1; ct <= filhos; ct++) {
			String nome = JOptionPane.showInputDialog("Digite o " + ct + " ºnome? ");
			String idade = JOptionPane.showInputDialog("Digite o " + ct + " ºidade? ");
			String item = "nome = " + nome + " " + "idade = " + idade + "\n";
			rel += item;
		}
		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);
	}

}
