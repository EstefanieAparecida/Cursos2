package exercicio1;

public class Exer37 {

	public static void main(String[] args) {
		// usando if normal
		int vl = 10;
		int a;
		if(vl > 20) {
			a = 50;
		}else {
			a = 100;
		}
		System.out.println(a);
		
		//usando operadores ternario, menor e mais rapido.
		int b = vl > 20?50 :100;
		System.out.println(b);
	}

}
