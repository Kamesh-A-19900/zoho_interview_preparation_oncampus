package string;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "One Two Three";
        StringBuilder sb = new StringBuilder(str);
        StringBuilder rev = new StringBuilder();
        reverse(sb, rev, sb.length() - 1);
    }

    public static void reverse(StringBuilder str, StringBuilder rev, int pos) {
        if (pos == -1) {
            System.out.print(rev.reverse()); 
            return;
        }

        char currentChar = str.charAt(pos);

        if (currentChar == ' ') {
            System.out.print(rev.reverse() + " ");
            rev.setLength(0);
        } else {
            rev.append(currentChar);
        }

        reverse(str, rev, pos - 1);
    }
}