package num_array;

import java.util.Arrays;

/*
Merge Two Sorted Arrays
arr1 = [1, 4, 11, 17]
arr2 = [13, 8, 5]
Output:
[1, 4, 5 ,8 11, 13, 17]

Note: The arrays could be sorted either in ascending or descending order.

Before coding, we had to explain the approach for all four possible cases:
- Both arrays in ascending order
- Both arrays in descending order
- First array ascending and second array descending
- First array descending and second array ascending
Once they were satisfied with the explanation, we were allowed to write the code.
 */
public class MergeSortedArray2 {
   public static void main(String[] args) {
       int[] arr1 = {17,11,4,1};
       int[] arr2 = {13,8,5};

       int len1 = arr1.length,len2 = arr2.length;

       boolean isAscending1 = (arr1[0]<=arr1[len1-1])?true:false;
       boolean isAscending2 = (arr2[0]<=arr2[len2-1])?true:false;

       int step1 = (isAscending1)?1:-1;
       int step2 = (isAscending2)?1:-1;

       int pos1 = (isAscending1)?0:len1-1;
       int pos2 = (isAscending2)?0:len2-1;

       int[] ans = new int[len1+len2];
       int pos3 = 0;

       while(isValid(pos1,len1,isAscending1) && isValid(pos2,len2,isAscending2)){
            if(arr1[pos1]<=arr2[pos2]){
                ans[pos3++] = arr1[pos1];
                pos1+=step1;
            }
            else{
                ans[pos3++] = arr2[pos2];
                pos2+=step2;
            }
       }
       while(isValid(pos1,len1,isAscending1)){
            ans[pos3++] = arr1[pos1];
            pos1+=step1;
       }
       while(isValid(pos2,len2,isAscending2)){
            ans[pos3++] = arr2[pos2];
            pos2+=step2;
       }
       System.out.println(Arrays.toString(ans));
   } 
   public static boolean isValid(int index, int n, boolean ascending) {
        if (ascending)
            return index < n;
        else
            return index >= 0;
    }
}
