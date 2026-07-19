package string;

// Write a program to give the following output for the given input
// Eg 1: Input: a1b10
// Output: abbbbbbbbbb
// Eg: 2: Input: b3c6d15
// Output: bbbccccccddddddddddddddd
// The number varies from 1 to 99.

class EncodeToDecode{
    public static void main(String[] args){
        String ques = "b3c6d15";
        StringBuilder ans = new StringBuilder();
        char prev_char = ques.charAt(0);
        char curr_char;
        int prev_val = 0;
        for(int pos=1;pos<ques.length();pos++){
            curr_char = ques.charAt(pos);
            if(Character.isDigit(curr_char)){
                prev_val = prev_val*10+(curr_char-'0');
            }
            else{
                for(int i=0;i<prev_val;i++){
                    ans.append(prev_char);
                }
                prev_char = curr_char;
                prev_val = 0;
            }
        }
        for(int i=0;i<prev_val;i++){
            ans.append(prev_char);
        }
        System.out.print(ans);
    }
}