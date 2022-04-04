# Problem Solving

## Solve Me First

## Problem Statement : 


- Complete the function solveMeFirst to compute the sum of two integers.

- Example
a = 7
b = 3

- Return
 10

- Function Description

Complete the solveMeFirst function in the editor below.

- solveMeFirst has the following parameters:

    int a: the first value
    int b: the second value

- Returns
  - int: the sum of a and b

- Constraints
1<= a,b<=1000

Sample Input

a = 2
b = 3

Sample Output

5


## code :- 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int solveMeFirst(int a, int b) {
       return a+b;

   }

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        sum = a+b;
        System.out.println(sum);
   }
}



## Simple Array Sum

## Problem Statement : 

- Given an array of Integers, find the sum of its elements.
    For example, if the array ar = [1,2,3], 1+2+3=6, so return 6.

- Function Description
Complete the simpleArraysum function in the editor below. It must return the sum of the array elements as an integer.
simpleArraysum has the following parameter(s):
- ar: an array of integers

- Input Format
The first line contains an integer, n, denoting the size of the array The second line contains 72 space-separated integers representing the array's elements.
- Constraints

0< n, ari ≤ 1000

-  Output Format

Print the sum of the anay's elements of a single inteuers

- Sample Input

6
1 2 3 4 10 11

- Sample Input

31

- Explanation

We print the sum of the array's elements:
1 + 2 + 3 + 4 + 10 + 11 = 31  

## code :- 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        int sum =0;
    
    for (Integer number: ar)
        sum+= number;
    return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


## SQL

## PROBLEM - Weather Observation Station 7

    Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.

## SOLUTION

    SELECT DISTINCT CITY FROM STATION
    WHERE CITY REGEXP '[aeiou]$';
    
