package lista_de_aitvidasde;

public class REMOVER_elemento {

	 public static void main(String[] args) {
	        int[] vetor = {1, 3, 5, 3, 7, 9, 3}; 
	        int elementoRemover = 3;
	
	
	        int[] novoVetor = removerElemento(vetor, elementoRemover);
	        
	        
	        
	        System.out.println("Vetor após a remoção do elemento " + elementoRemover + ":");
	        for (int elemento : novoVetor) {
	            System.out.print(elemento + " ");
	        }
	    }
	        
	        
	 public static int[] removerElemento(int[] vetor, int elemento) {
	        int count = 0;
	        
	        
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == elemento) {
	                count++;
	            }
	        }
	        
	        
	        int[] novoVetor = new int[vetor.length - count];
	        int j = 0;
	
    
	        
	        
	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] != elemento) {
	                novoVetor[j] = vetor[i];
	                j++;
	            }
	        }
	        
	        return novoVetor;
	    }
	}

	 
	 
	 
	 