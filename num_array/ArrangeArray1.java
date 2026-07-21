package num_array;

/*
Arrange Even and Odd Numbers
Given an array, we had to arrange all even numbers on the left side and all odd numbers on the right side. The order of the numbers did not matter.

Input: [1, 2, 3, 4, 15, 6]
Possible outputs:
[2, 4, 6, 1, 3, 15]
[6, 2, 4, 3, 15, 1]
 */
import java.util.*;
public class ArrangeArray1 {
    public static void main(String[] args) {
        int[] arr = {2,1,4,6,5};
        int lft = 0,rht = arr.length-1;
        while(lft<rht){
            if(arr[lft]%2!=0){
                int temp = arr[lft];
                arr[lft] = arr[rht];
                arr[rht] = temp;
                rht--;
            }
            else{
                lft++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    
}
