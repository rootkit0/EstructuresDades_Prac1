package arraysorter;

import java.util.Random;

/**
 *
 * @author xbp1
 */
public class AnalisiSorter {
    
    //Creem els vectors
    public static int[] array_ordenat = new int [50];
    public static int[] array_ordenat_reves = new int [50];
    public static int[] array_desordenat = new int [50];
    public static int[] array_poc_desordenat = new int [50];
    
    //Algoritme de Fisher Yates
    public static int[] fisher_yates(int[] array, int bucle) {
        Random random = new Random();
        //Fem un for que recorri tantes posicions del vector com el paràmetre bucle
        for(int i=0; i < bucle; i++) {
            //Seleccionem un valor aleatori entre l'última posició del for i l'actual
            int randomValue = i + random.nextInt(bucle - i);
            //Utilitzem una funció auxiliar per a intercanviar els valors de la posició aleatoria i l'actual
            swap(array, randomValue, i);
        }
        return array;
    }
    
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    
    //Inicialitzem els vectors
    public static void inicialitzarVectors() {
        //Array ordenat
        for(int i=0; i<50; ++i) {
            array_ordenat[i] = i;
        }
        //Array ordenat reves
        for(int i=0; i<49; ++i) {
            array_ordenat_reves[i] = 50-i;
        }
        //Array desordenat
        for(int i=0; i<50; ++i) {
            array_desordenat[i] = i;
        }
        fisher_yates(array_desordenat, array_desordenat.length);
        //Array poc desordenat (desordenem mig array)
        for(int i=0; i<50; ++i) {
            array_poc_desordenat[i] = i;
        }
        fisher_yates(array_poc_desordenat, array_poc_desordenat.length/2);  
    }

    public static void main(String[] args) {
        //Cridem a la funció següent per a inicialitzar els vectors
        inicialitzarVectors();
        
        //Anàlisi insertion
        
        //Declarem el vector a ordenar (el primer cas és l'ordenat per a poder fer l'anàlisi)
        int[] array = array_ordenat;
        //Posem el vector a ordenar en una nova instància del IntArraySorter
        IntArraySorter sorter = new IntArraySorter(array);
        sorter.insertionSort();
        //Declarem dos variables on emmagatzemarem els canvis i les comparacions
        int swaps = sorter.getNumSwaps();
        int comparisons = sorter.getNumComparisons();
        //Imprimim per pantalla els swaps i les comparisons per a fer l'anàlisi
        System.out.println("Insertion Sort: (Ordenat)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions \n");
        
        array = array_ordenat_reves;
        sorter = new IntArraySorter(array);
        sorter.insertionSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Insertion Sort: (Ordenat al reves)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions \n");
        
        array = array_desordenat;
        sorter = new IntArraySorter(array);
        sorter.insertionSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Insertion Sort: (Molt desordenat)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions \n");
        
        array = array_poc_desordenat;
        sorter = new IntArraySorter(array);
        sorter.insertionSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Insertion Sort: (Poc desordenat)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions");
        System.out.println("-----------------------\n");
        
        //Anàlisi selection
        
        //Tornem a inicialitzar els vectors a utilitzar
        inicialitzarVectors();
        
        array = array_ordenat;
        sorter = new IntArraySorter(array);
        sorter.selectionSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Selection Sort: (Ordenat)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions \n");
        
        array = array_ordenat_reves;
        sorter = new IntArraySorter(array);
        sorter.selectionSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Selection Sort: (Ordenat al reves)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions \n");
        
        array = array_desordenat;
        sorter = new IntArraySorter(array);
        sorter.selectionSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Selection Sort: (Molt desordenat)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions \n");
        
        array = array_poc_desordenat;
        sorter = new IntArraySorter(array);
        sorter.selectionSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Selection Sort: (Poc desordenat)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions");
        System.out.println("-----------------------\n");
        
        //Anàlisi bubble
        
        inicialitzarVectors();
        
        array = array_ordenat;
        sorter = new IntArraySorter(array);
        sorter.bubbleSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Bubble Sort: (Ordenat)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions \n");
        
        array = array_ordenat_reves;
        sorter = new IntArraySorter(array);
        sorter.bubbleSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Bubble Sort: (Ordenat al reves)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions \n");
        
        array = array_desordenat;
        sorter = new IntArraySorter(array);
        sorter.bubbleSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Bubble Sort: (Molt desordenat)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions \n");
        
        array = array_poc_desordenat;
        sorter = new IntArraySorter(array);
        sorter.bubbleSort();
        swaps = sorter.getNumSwaps();
        comparisons = sorter.getNumComparisons();
        System.out.println("Bubble Sort: (Poc desordenat)");
        System.out.println("Ha fet " + swaps + " canvis");
        System.out.println("Ha fet " + comparisons + " comparacions");
        System.out.println("-----------------------\n");
    }
}
