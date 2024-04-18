package lista_de_aitvidasde;

public class Somas_dos_elementos {

    public static void main(String[] args) {
        int[] vetor = {2, 4, 6, 8, 10}; 
      
        int soma = calcularSoma(vetor);
        
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
    
    public static int calcularSoma(int[] vetor) {
        int soma = 0;
        
        for (int elemento : vetor) {
            soma += elemento;
        }
        
        return soma;
    }
}