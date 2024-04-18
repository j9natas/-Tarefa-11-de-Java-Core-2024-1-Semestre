package lista_de_aitvidasde;

import java.util.HashMap;
import java.util.Map;

public class Frequencia_elementos {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 2, 3, 1, 4, 1};
        
        Map<Integer, Integer> frequencia = determinarFrequencia(vetor);
        
        System.out.println("Frequência de elementos:");
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<Integer, Integer> determinarFrequencia(int[] vetor) {
        Map<Integer, Integer> frequencia = new HashMap<>();
        
        for (int elemento : vetor) {
            if (frequencia.containsKey(elemento)) {
                frequencia.put(elemento, frequencia.get(elemento) + 1);
            } else {
                frequencia.put(elemento, 1);
            }
        }
        
        return frequencia;
    }
}
	
	
	
	
	
	

