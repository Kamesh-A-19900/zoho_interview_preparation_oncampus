package other;

/*
Write a  program to check the following.
122+221=343
343+343=686
upto 5 iterations
 */

public class Palindrome1 {
    public static void main(String[] args) {
        int num = 122;
        boolean isNot = true;
        for(int i=0;i<5;i++){
            if(isPalindrome(num)){
                isNot = false;
            }
            int temp = reverse(num);;
            System.out.print(num+"+"+temp+"=");
            num+=temp;
            System.out.println(num);
        }
        if(isNot){
            System.out.println("Not a Palindrome");
        }
    }  
    public static int reverse(int n){
        int ans = 0;
        do { 
            ans=ans*10+n%10;
            n/=10;    
        } while (n>0);
        return ans;
    }
    public static boolean isPalindrome(int num){
        int ans = 0;
        int n = num;
        do { 
            ans=ans*10+n%10;
            n/=10;    
        } while (n>0);
        return ans==num;
    }
}
