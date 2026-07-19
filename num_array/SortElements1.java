package num_array;

// Write a program to sort the elements in odd positions in descending order and even positions
// elements in ascending order
// Eg 1: Input: 13,2 4,15,12,10,5
// Output: 13,2,12,10,5,15,4
// Eg 2: Input: 1,2,3,4,5,6,7,8,9
// Output: 9,2,7,4,5,6,3,8,1
import java.util.*;

public class SortElements1 {
    public static void main(String[] args) {
        int[] arr = {13,2,4,15,12,10,5};
        //even
        for(int pos = 0;pos<arr.length;pos+=2){
            for(int pos2 = pos+2;pos2<arr.length;pos2+=2){
                if(arr[pos]<arr[pos2]){
                    int temp = arr[pos];
                    arr[pos] = arr[pos2];
                    arr[pos2] = temp;
                }
            }
        }
        //odd
        for(int pos = 1;pos<arr.length;pos+=2){
            for(int pos2 = pos+2;pos2<arr.length;pos2+=2){
                if(arr[pos]>arr[pos2]){
                    int temp = arr[pos];
                    arr[pos] = arr[pos2];
                    arr[pos2] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
