package pattern;

/*
n=5
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            int val = i;
            int decr = n-1;
            for(int j=0;j<i;j++){
                System.out.print(val+" ");
                val+=decr;
                decr--;
            }
            System.out.println();
        }
    }
}
