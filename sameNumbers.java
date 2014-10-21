/**
 * Same Number Check
 * HW 5, part 2
 * CSC 211 602
 * @JustinWhite
 */
import java.util.*;

class sameNumbers {
public boolean sameNumbers(int nums1[ ], int nums2[ ]){
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    return Arrays.equals(nums1, nums2); 
  }
}