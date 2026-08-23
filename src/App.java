import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class App {
    public static Integer[] vetorDeNumeros() {
        Random gerador = new Random();
        Integer[] numeros = new Integer[1000];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gerador.nextInt(10000); // Números de 0 a 9999
        }

        return numeros;
    };

    public static void main(String[] args) throws Exception {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] numeros = vetorDeNumeros();
        System.out.println("Vetor nao ordenado");
        System.out.println(Arrays.toString(numeros));

        System.out.println("Vetor Ordenado:");
        bubbleSort.sortVerbose(numeros); // ordenando
        System.out.println(Arrays.toString(numeros));

        // Ordem decrescente
        numeros = vetorDeNumeros();
        bubbleSort.sort(numeros, Comparator.reverseOrder());

        System.out.println("\n=== Ordem decrescente ===");
        System.out.println(Arrays.toString(numeros));


        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        
        //  Teste de tempo do Bubble Sort
        Integer[] vetorParaBubble = vetorDeNumeros();
        long inicioBubble = System.currentTimeMillis();
        bubbleSort.sort(vetorParaBubble);
        long tempoBubble = System.currentTimeMillis() - inicioBubble;

        //  Teste de tempo do Insertion Sort
        Integer[] vetorParaInsertion = vetorDeNumeros();
        long inicioInsertion = System.currentTimeMillis();
        insertionSort.sort(vetorParaInsertion);
        long tempoInsertion = System.currentTimeMillis() - inicioInsertion;

        // Exibindo os tempos medidos
        System.out.println("Tempo de execução do Bubble Sort:    " + tempoBubble + " ms");
        System.out.println("Tempo de execução do Insertion Sort: " + tempoInsertion + " ms");
    }
}
