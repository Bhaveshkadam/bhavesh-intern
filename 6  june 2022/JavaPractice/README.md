# Insertion Sort


![Insertion Sort]( https://github.com/sp18-interns/bhavesh-intern/blob/main/6%20%20june%202022/JavaPractice/Insertion%20Sort.gif "Insertion Sort")


### Write a function that takes in an array of integers and returns a sorted version of that array. Use the Insertion Sort algorithm to sort the array.


## Sample Input

array = [8, 5, 2, 9, 5, 6, 3]
## Sample Output 

[2, 3, 5, 5, 6, 8, 9]

## code :  

 ```
import java.util.*;

class Program {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j] > temp)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }
}
```