package string;

/*
Reverse given string with space and special character at the same places
E.g. House 1 no :12
output : 21on1 e su :oH
 */
public class ReverseString1 {
    public static void main(String[] args) {
        String str = "House 1 no :12";
        StringBuilder str2 = new StringBuilder(str);
        int leftPos = 0,rightPos=str2.length()-1;
        while(leftPos<rightPos){
            char lft = str2.charAt(leftPos);
            char rht = str2.charAt(rightPos);
            if(Character.isLetterOrDigit(lft) && Character.isLetterOrDigit(rht)){
                str2.setCharAt(rightPos, lft);
                str2.setCharAt(leftPos, rht);
                leftPos++;
                rightPos--;
            }
            else if(Character.isLetterOrDigit(rht)){
                leftPos++;
            }
            else{
                rightPos--;
            }
        }
        System.out.println(str2.toString());
    }
    
}
