package exercicio1;

public class Exer16 {

	public static void main(String[] args) {
		
		int v1 =10;
		//Executa se a condi��o for true
		if(v1 > 5){
			System.out.println("� maior");
			System.out.println("bloco 1");
		//Executa se a condi��o for false		
		} else {
			System.out.println("n�o � maior");
			System.out.println("bloco 2");
		}
		System.out.println("continua o programa 1");
		if(v1 > 20) {
			System.out.println("� maior");
			System.out.println("bloco 3");
		} else {
			System.out.println("n�o � maior");
			System.out.println("bloco 4");
		}
		System.out.println("continua o programa 2");
	}
}
