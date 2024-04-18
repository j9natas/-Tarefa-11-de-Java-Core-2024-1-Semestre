package lista_de_aitvidasde;

public class Vetor_invertido {

	
	 public static void main(String[] args) {
	        int[] vetor = {1, 2, 3, 4, 5};
	        
	        
	        inverterVetor(vetor);
	        
	        
	        
	        System.out.println("Vetor invertido:");
	        for (int elemento : vetor) {
	            System.out.print(elemento + " ");
	        }
	    }
	 
	 
	
	
	 public static void inverterVetor(int[] vetor) {
	        int tamanho = vetor.length;
	        for (int i = 0; i < tamanho / 2; i++) {
	            int temp = vetor[i];
	            vetor[i] = vetor[tamanho - 1 - i];
	            vetor[tamanho - 1 - i] = temp;
	        }
	    }
	}
	
	

