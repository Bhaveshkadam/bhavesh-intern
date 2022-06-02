
// using for loop 

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



// using while loop

import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
     boolean swapped = true;
        while(swapped) {
            swapped = false;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    return array;
  }
}



