package lista_de_aitvidasde;

public class Media_dos_elementos {

	
	
	 public static void main(String[] args) {
	        double[] vetor = {2.5, 3.5, 4.0, 5.0, 2.0};
	        
	        
	        double media = calcularMedia(vetor);
	        
	        
	        System.out.println("A média dos elementos do vetor é: " + media);
	    }
	        
	 public static double calcularMedia(double[] vetor) {
	        double soma = 0.0;
	        
	        
	        for (double elemento : vetor) {
	            soma += elemento;
	        }
	        
	        
	        double media = soma / vetor.length;
	        
	        return media;
	    }
	
}
