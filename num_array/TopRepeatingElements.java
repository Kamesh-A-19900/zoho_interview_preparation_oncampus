package num_array;

/*
Top Two Repeating Elements from sorted array
Input:
[1,1,2,2,2,2,4,5,5,5,10,12]
Output:
2 5
 */

public class TopRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,4,5,5,5,10,12,12,12,12};
        int firstElement = Integer.MIN_VALUE,firstFreq = Integer.MIN_VALUE;
        int secondElement = Integer.MIN_VALUE, secondFreq = Integer.MIN_VALUE;
        int lft = 0,rht = 0;
        while(rht<arr.length){
            if(arr[lft]!=arr[rht]){
                int count = rht-lft;
                if(count>firstFreq){
                    secondFreq = firstFreq;
                    secondElement = firstElement;
                    firstElement = arr[lft];
                    firstFreq = count;
                }
                else if(count>secondFreq){
                    secondFreq = count;
                    secondElement = arr[lft];
                }
                lft = rht;
            }
            else{
                rht++;
            }
        }
        int count = rht-lft;
        if(count>firstFreq){
            secondFreq = firstFreq;
            secondElement = firstElement;
            firstElement = arr[lft];
            firstFreq = count;
        }
        else if(count>secondFreq){
            secondFreq = count;
            secondElement = arr[lft];
        }
        System.out.println(firstElement+" "+secondElement);
    }
}
