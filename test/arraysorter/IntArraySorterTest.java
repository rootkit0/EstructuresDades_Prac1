package arraysorter;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

/**
 *
 * @author xbp1
 */

public class IntArraySorterTest {
    
    @Test
    public void testInsertionSort() {
        //Inicialitzem dos vectors amb els mateixos elements, un desordenat i l'altre ordenat
        int[] array = new int [] {4, 2, 3, 0, 2, 1};
        int[] array_ordenat = new int [] {0, 1, 2, 2, 3, 4};
        //Printem el vector array abans de passar-l'hi l'algoritme
        System.out.println("Vector abans d'executar insertionSort: " + Arrays.toString(array));
        IntArraySorter sorter = new IntArraySorter(array);
        //L'hi passem l'algoritme corresponent (en aquest cas l'insertionSort)
        sorter.insertionSort();
        //Comprovem que el vector array actualitzat per l'algoritme coincideix amb el vector ordenat prèviament
        assertArrayEquals(array, array_ordenat);
        //Printem el vector array després de passar-l'hi l'algoritme
        System.out.println("Mateix vector després d'executar insertionSort: " + Arrays.toString(array));
        System.out.println("-----------------------\n");
    }
    
    @Test
    public void testSelectionSort() {
        int[] array = {4, 2, 3, 0, 2, 1};
        int[] array_ordenat = {0, 1, 2, 2, 3, 4};
        System.out.println("Vector abans d'executar selectionSort: " + Arrays.toString(array));
        IntArraySorter sorter = new IntArraySorter(array);
        sorter.selectionSort();
        assertArrayEquals(array, array_ordenat);
        System.out.println("Mateix vector després d'executar selectionSort: " + Arrays.toString(array));
        System.out.println("-----------------------\n");
    }
    
    @Test
    public void testBubbleSort() {
        int[] array = {4, 2, 3, 0, 2, 1};
        int[] array_ordenat = {0, 1, 2, 2, 3, 4};
        System.out.println("Vector abans d'executar bubbleSort: " + Arrays.toString(array));
        IntArraySorter sorter = new IntArraySorter(array);
        sorter.bubbleSort();
        assertArrayEquals(array, array_ordenat);
        System.out.println("Mateix vector després d'executar bubbleSort: " + Arrays.toString(array));
        System.out.println("-----------------------\n");
    }
}
