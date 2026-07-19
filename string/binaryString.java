package string;
public class binaryString {
    public static void main(String[] args) {
        String a = "11";
        String b = "11";
        int current_sum;
        String ans = "";
        int carry_val = 0,aPos = a.length()-1,bPos = b.length()-1;
        while(aPos>=0 || bPos>=0){
            current_sum = 0;
            if(aPos>=0){
                current_sum+=(int)a.charAt(aPos)-48;
            }
            if(bPos>=0){
                current_sum+=(int)a.charAt(bPos)-48; 
            }
            current_sum+=carry_val;
            ans+=sum(current_sum);
            carry_val = carry(current_sum);
            aPos-=1;
            bPos-=1;
        }  
        if(carry_val==1){
            ans+='1';
        }
        for(int i = ans.length()-1;i>=0;i--){
            System.out.print(ans.charAt(i));
        }       
    }
    public static char sum(int n){
        if(n%2==0){
            return '0';
        }
        else{
            return '1';
        }
    }
    public static int carry(int n){
        return n/2;
    }

}
