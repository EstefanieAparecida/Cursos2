package exercicio1;

public class Exer26 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;// parada da interação corrente, avançada para proxima.
			}
			
			System.out.println("->processando-" + i);
		}
		
			System.out.println("terminando programa");
	}

}
