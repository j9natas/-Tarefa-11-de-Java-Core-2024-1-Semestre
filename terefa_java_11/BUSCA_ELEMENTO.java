package lista_de_aitvidasde;

public class BUSCA_ELEMENTO {

	 public static void main(String[] args) {
	        int[] vetor = {2, 5, 8, 10, 6, 4};
	        int elementoProcurado = 8;
	
	
	
	        
	        boolean encontrado = verificarElemento(vetor, elementoProcurado);
	        
	        
	        if (encontrado) {
	            System.out.println("O elemento " + elementoProcurado + " está presente no vetor.");
	        } else {
	            System.out.println("O elemento " + elementoProcurado + " não está presente no vetor.");
	        }
	    }
	     
	 
	 
	 public static boolean verificarElemento(int[] vetor, int elemento) {

	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == elemento) {
	                return true;
	            }
	        }
	        return false; // 
	}
	        
	
	
	
}
