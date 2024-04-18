package lista_de_aitvidasde;

public class Elementos_pares {

	
	 public static void main(String[] args) {
	        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        
	        
	        int quantidadePares = contarPares(vetor);
	        
	        
	        System.out.println("A quantidade de números pares no vetor é: " + quantidadePares);
	    }
	    
	 
	 public static int contarPares(int[] vetor) {
	        int quantidadePares = 0;
	        
	        
	        for (int elemento : vetor) {
	            if (elemento % 2 == 0) {
	                quantidadePares++;
	            }
	        }
	        
	        return quantidadePares;
	    }
	}
	
	
	
	
	

