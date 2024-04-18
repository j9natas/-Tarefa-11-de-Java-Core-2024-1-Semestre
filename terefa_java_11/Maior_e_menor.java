package lista_de_aitvidasde;

public class Maior_e_menor {

	
	
	 public static void main(String[] args) {
	        int[] vetor = {5, 3, 9, 1, 7, 2}; 
	
	
	        
	        
	        int maior = encontrarMaiorValor(vetor);
	        int menor = encontrarMenorValor(vetor);
	        
	        
	        
	        System.out.println("O maior valor no vetor é: " + maior);
	        System.out.println("O menor valor no vetor é: " + menor);
	    }
	
	 
	 public static int encontrarMaiorValor(int[] vetor) {
	        int maior = vetor[0];
	        
	        for (int i = 1; i < vetor.length; i++) {
	            if (vetor[i] > maior) {
	                maior = vetor[i];
	            }
	        }
	        
	        return maior;
	    }
	 
	 public static int encontrarMenorValor(int[] vetor) {
	        int menor = vetor[0];
	        
	        for (int i = 1; i < vetor.length; i++) {
	            if (vetor[i] < menor) {
	                menor = vetor[i];
	            }
	        }
	        
	        return menor;
	    }
	 
	 
	 
	 
	 
	 
	 
}