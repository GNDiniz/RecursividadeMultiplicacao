package view;

import controller.MultiplicacaoController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		MultiplicacaoController mc = new MultiplicacaoController();
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
		
		int multiplicacao = mc.multiplicacao(num1, num2);
		System.out.println(num1+" x "+num2+" = "+multiplicacao);
	}

}
