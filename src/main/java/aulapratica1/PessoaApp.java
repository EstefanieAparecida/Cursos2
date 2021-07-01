package aulapratica1;

public class PessoaApp {
	

	    
	    public static void main(String[] args){
	        
	        Pessoa pessoa1 = new Pessoa(1,"Elder");
	        
	        Pessoa pessoa2 = new Pessoa(2,"Ana");
	        
	        System.out.println("o nome do objeto pessoa1 eh: "+pessoa1.getNome());
	        
	        pessoa1.setNome("Helder");
	        
	        System.out.println("o nome do objeto pessoa1 eh: "+pessoa1.getNome());
	                
	        
	    }  
}
