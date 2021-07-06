package exercicio1;

import javax.swing.JOptionPane;

public class Exer18 {

	public static void main(String[] args) {
		//recebendo valores da interface.
		String v1 = JOptionPane.showInputDialog("Digite numero 1 ");
		String v2 = JOptionPane.showInputDialog("Digite numero 2 ");
		//conversão de valores.
		int vl1 = Integer.parseInt(v1);
		int vl2 = Integer.parseInt(v2);
		//logica de programação.
		String relatorio = "Maior = ";
		if(vl1 > vl2) {
			relatorio += v1;
		}else {
			if(vl2 > vl1) {
				relatorio += v2;
			} else {
				relatorio = "Iguais =" + v1;
					
			}
		}
		
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);

	}

}
