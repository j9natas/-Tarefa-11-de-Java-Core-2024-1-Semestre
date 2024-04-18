package lista_de_aitvidasde;

import java.util.Arrays;

public class UNIÃO_DE_VETORES {

	
	
	 public static void main(String[] args) {
	        int[] vetor1 = {1, 3, 5}; 
	        int[] vetor2 = {2, 4, 6};
	
	
	
	        int[] vetorUnido = unirVetores(vetor1, vetor2);
	        
	        
	        
	        System.out.println("Vetor unido: " + Arrays.toString(vetorUnido));
	    }
	    
	 
	 public static int[] unirVetores(int[] vetor1, int[] vetor2) {
	        int tamanho1 = vetor1.length;
	        int tamanho2 = vetor2.length;
	        int tamanhoUniao = tamanho1 + tamanho2;
	        
	        
	        
	        int[] vetorUnido = new int[tamanhoUniao];
	        
	        
	        
	        
	        
	        
	        for (int i = 0; i < tamanho1; i++) {
	            vetorUnido[i] = vetor1[i];
	        }
	        
	        
	        
	        for (int i = 0; i < tamanho2; i++) {
	            vetorUnido[tamanho1 + i] = vetor2[i];
	        }
	        
	        
	        
	        
	        
	        return vetorUnido;
	    }
	}
	

