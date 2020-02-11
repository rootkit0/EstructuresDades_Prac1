package arraysorter;

/**
 *
 * @author xbp1
 */

public class IntArraySorter {
    private final int[] array;
    
    private int numComparisons;
    private int numSwaps;
    
    public int getNumComparisons() {
        return numComparisons;
    }
    
    public int getNumSwaps() {
        return numSwaps;
    }
    
    public IntArraySorter(int[] array) {
        this.array = array;
    }
    
    public boolean isSorted() {
        for(int i=0; i<array.length; i++) {
            if(array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }
    
    public void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        numSwaps += 1;
    }
    
    public boolean lessThanOrEqual(int i1, int i2) {
        numComparisons += 1;
        return i1 <= i2;
    }
    
    public void bubbleSort() {
        //Fem un for que recorri tot el vector
        for(int i=0; i<array.length; i++) {
            //Per cada posició del for recorrem tot el vector menys i posicions
            for(int j=1; j<(array.length-i); j++) {
                //Busquem un valor mes petit que l'anterior
                if(lessThanOrEqual(array[j], array[j-1])) {
                    //En cas que el trobem fem swap
                    swap(j, j-1);
                }
            }
        }
    }
    
    public void selectionSort() {
        //Fem un for que recorri tot el vector menys la última posició
        for(int i=0; i<array.length-1; i++) {
            //Suposem que el mínim es troba en la posició actual
            int min = i;
            //Fem un for que vagi de la posició actual + 1 fins al final de l'array
            for(int j=i+1; j < array.length; j++) {
                //Busquem un valor mes petit que el suposat anteriorment
                if(lessThanOrEqual(array[j], array[min])) {
                    min = j;
                }
            }
            //En cas d'haver trobat el valor sortim del segon for i intercanviem els valors
            swap(i, min);
        }
    }
    
    public void insertionSort() {
        // The prefix [0..s) is a sorted array
        // We insert element s into this prefix
        for(int s=1; s<array.length; s++) {
            int insert = s;
            // Element at insert is lower than any
            // element in [insert+1..s]
            for(int i=s-1; i>=0; i--) {
                if(!lessThanOrEqual(array[i], array[insert])) {
                    swap(i, insert);
                    insert = i;
                }
                else {
                    break;
                }
            }
        }
    }
}