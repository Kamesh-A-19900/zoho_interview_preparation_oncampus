package other;
/*
Write a program to generate a 10 digit number where 1st digit is divisible by 1 ,first 2 digits 
should be divisible by 2 ,first 3 digits should be divisible by 3 and so on.
 */
public class GenerateNumber {
    public static void main(String[] args){
        long num = 8;
        for(int i=1;i<10;i++){
            if(num%i!=0){
                long rem = num%i;
                num = num+(i-rem);
            }
            num = num*10;
        }
        System.out.print(num);
    }
}
