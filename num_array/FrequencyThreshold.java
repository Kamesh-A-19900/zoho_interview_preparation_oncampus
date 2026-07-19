package num_array;
class FrequencyThreshold{
	public static void main(String[] args){
		int[] arr = {1,1,2,2,2,2,4,5,5,5,5,10,22};
		int freq = 3;
		int i=0,j = 0;
		while(j<arr.length){
			if(arr[i]==arr[j]){
				j++;
			}
			else{
				int count = j-i;
				if(count>=freq){
					System.out.print(arr[i]+"->"+count+" ");
				}
				i = j;
			}
		}
		int count = j-i;
		if(count>freq){
			System.out.print(arr[i]+"->"+count+" ");
		}
	}
}
