package exercicio1;

public class Exer30_31 {

	public static void main(String[] args) {
		int valor = 10;
		System.out.println(valor);
		if(valor == 10) {
			//v2a dentro do escopo da vida do if verdadeiro,
			int v2 = 90;
			System.out.println(v2);
			System.out.println(valor);
		}else {
			//System.out.println(v2); não existe v2 nesse escopo.
		}
			//System.out.println(v2); não existe v2 nesse escopo.
		
		//Exercicio 31
		//v2 esta dentro do escopo de vida do metodo.
		byte v2 = 10;
		System.out.println(v2);
		
		int a = 90;
		System.out.println(a);
	}
	    //System.out.println(a); //não existe a nesse escopo.

}
