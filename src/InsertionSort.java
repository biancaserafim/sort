import java.util.*;

public class InsertionSort<T extends Comparable<T>> {

    public T[] sort(T[] array, Comparator<T> comparator) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            T chave = array[i];
            int j = i - 1;

            while (j >= 0 && comparator.compare(array[j], chave) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
        return array;
    }


    public T[] sort(T[] array) {
        return sort(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }
}