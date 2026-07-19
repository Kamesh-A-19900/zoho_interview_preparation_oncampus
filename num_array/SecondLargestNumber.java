package num_array;

// Note - Auxillary space : O(1) 

public class SecondLargestNumber {
    public static void main(String[] args){
        int[] arr = {10,8,5,7,6,3,14,18,18};
        int firstLarger = Integer.MIN_VALUE;
        int secondLarger = Integer.MIN_VALUE;
        for(int num: arr){
            if(num>firstLarger){
                secondLarger = firstLarger;
                firstLarger = num;
            }
            else if(num>secondLarger && num!=firstLarger){
                secondLarger = num;
            }
        }
        System.out.print(secondLarger);
    }
}
