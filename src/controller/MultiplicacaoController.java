package controller;

public class MultiplicacaoController {

	public MultiplicacaoController() {
		super();
	}

	public int multiplicacao(int num1, int num2) {
		//Condição de parada
		int res = 0;
		if (num2 == 0) {
			return 0;
		} else {
		    res = res + num1;
			return res + multiplicacao(num1, num2 -1);
		}
	}
}
