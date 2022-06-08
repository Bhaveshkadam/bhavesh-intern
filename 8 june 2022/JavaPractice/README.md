# Selection Sort


![Selection Sort]( https://github.com/sp18-interns/bhavesh-intern/blob/main/1%20june%202022/JavaPractice/bubble-sort.gif "Selection Sort")


### Write a function that takes in an array of integers and returns a sorted version of that array. Use the Selection Sort algorithm to sort the array.


## Sample Input

array = [8, 5, 2, 9, 5, 6, 3]

## Sample Output 

[2, 3, 5, 5, 6, 8, 9]

## code :  


 ```
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

```