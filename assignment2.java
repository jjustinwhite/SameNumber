/**
 * Same Number Check
 * HW 5, part 2
 * CSC 211 602
 * @JustinWhite
 */

import java.util.*;

public class assignment2 {
  
  public static void main(String [ ] args) {
    int num;
    int count = 0;
    int count2 = 0;
    int[] array1 = new int[20];
    int[] array2 = new int[20];
    Scanner input = new Scanner(System.in); 
    sameNumbers nums = new sameNumbers();
    //Ask for first string, and fill in array 'array1[]' with input.
    System.out.println("Enter a sequence of positive integers. End with -1.");
     while (true){
       num = input.nextInt();
       if (num == -1)
         break;
       array1[count] = num;
       count++;
     }
    //Ask for second string, and fill in array 'array2[]' with input.
    System.out.println("Enter another sequence of positive integers. End with -1.");
     while (true){
       num = input.nextInt();
       if (num == -1)
         break;
       array2[count2] = num;
       count2++;
     }
    
     //method call & print result
     boolean result = nums.sameNumbers(array1, array2);
     
     if (result == true)
     System.out.println("The sequences contain the same numbers.");
     else
     System.out.println("The sequences do NOT contain the same numbers.");
  }
}