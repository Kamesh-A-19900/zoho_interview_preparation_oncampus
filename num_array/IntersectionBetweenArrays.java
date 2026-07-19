package num_array;
public class IntersectionBetweenArrays{
    public static void main(String[] args){
        int[] arr1 = {1,5,5,5,6};
        int[] arr2 = {2,5,5,6};
        int lenArr1 = arr1.length,lenArr2 = arr2.length;
        int posArr1=0,posArr2=0;
        while(posArr1<lenArr1 && posArr2<lenArr2){
            while(posArr1<arr1.length-1 && arr1[posArr1]==arr1[posArr1+1]){
                posArr1+=1;
            }
            while(posArr2<arr2.length-1 && arr2[posArr2]==arr2[posArr2+1]){
                posArr2+=1;
            }
            if(arr1[posArr1]==arr2[posArr2]){
                System.out.print(arr1[posArr1]+" ");
                posArr1++;
                posArr2++;
            }
            else if(arr1[posArr1]>arr2[posArr2]){
                posArr2++;
            }
            else{
                posArr1++;
            }
        }

    }
}
