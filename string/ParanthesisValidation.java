package string;

import java.util.*;
public class ParanthesisValidation {
    public static void main(String[] args) {
        String s = "{[]}}";
        boolean isValid = validateParanthesis(s);
        if(isValid)
            System.out.println("Valid Paranthesis");
        else
            System.out.println("Not a Valid Paranthesis"); 
    }
    public static char get(char ch){
        if(ch==')')return '(';
        else if(ch==']')return '[';
        else return '{';
    }
    public static boolean validateParanthesis(String s){
        Stack<Character> stack  = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')stack.push(ch);
            else{
                char open_brace;
                if(stack.isEmpty()){
                    return false;
                }
                open_brace = stack.pop();
                ch = get(ch);
                if(ch!=open_brace)return false;
            }
        }
        return stack.isEmpty();
    }
}
