package lista_de_aitvidasde;

public class ORDENAÇÃO_crescente {

    public static void main(String[] args) {
        int[] vetor = {5, 2, 7, 1, 8, 3};

        bubbleSort(vetor);

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }


    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                   
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
	
	
	

