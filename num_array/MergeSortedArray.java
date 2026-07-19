package num_array;

// Given two sorted arrays, merge them such that the elements are not repeated
// Eg 1: Input:
// Array 1: 2,4,5,6,7,9,10,13
// Array 2: 2,3,4,5,6,7,8,9,11,15
// Output:
// Merged array: 2,3,4,5,6,7,8,9,10,11,13,15

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,6,7,9,10,13};
        int[] arr2 = {2,3,4,5,6,7,8,9,11,15};
        int lenArr1 = arr1.length,lenArr2 = arr2.length;
        int pos1 = 0,pos2 = 0;
        while(pos1<lenArr1 && pos2<lenArr2){
            if(arr1[pos1]==arr2[pos2]){
                System.out.print(arr1[pos1]+" ");
                pos1++;
                pos2++;
            }
            else if(arr1[pos1]>arr2[pos2]){
                System.out.print(arr2[pos2]+" ");
                pos2++;
            }
            else{
                System.out.print(arr1[pos1]+" ");
                pos1++;
            }
        }
        while(pos1<lenArr1){
            System.out.print(arr1[pos1]+" ");
            pos1++;
        }
        while(pos2<lenArr2){
            System.out.print(arr2[pos2]+" ");
            pos2++;
        }
    }
}
