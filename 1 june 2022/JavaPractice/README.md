# Bubble Sort


![Bubble Sort]( https://github.com/sp18-interns/bhavesh-intern/blob/main/1%20june%202022/JavaPractice/Bubble%20Sort.gif "Bubble Sort")


### Write a function that takes in an array of integers and returns a sorted version of that array. Use the Bubble Sort algorithm to sort the array.


## Sample Input

array = [8, 5, 2, 9, 5, 6, 3]

## Sample Output 

[2, 3, 5, 5, 6, 8, 9]

## code :  

 ```
import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
   for(int i=0; i < array.length; i++) { 
      for(int j=1; j < (array.length-i); j++) {
         if(array[j-1] > array[j]){
           int temp = array[j-1];
           array[j-1] = array[j];
           array[j] = temp;
           }
        }
     }
    return array;
    }
}
```
