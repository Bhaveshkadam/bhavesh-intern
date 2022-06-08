import java.util.*;

class Program {
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_ind = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_ind]) {
                    min_ind = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_ind];
            array[min_ind] = temp;
        }
        return array;
    }
}

