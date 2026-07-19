package pattern;

/*
n=3
   0
  303
 23032
1230321
 */

public class Pattern6 {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n+i;j++){
                if(j<n-i)System.out.print("  ");
                else if(j<n)System.out.print(j+1+" ");
                else if(j==n)System.out.print("0 ");
                else System.out.print(n-(j-(n+1))+" ");
            }
            System.out.println();
        }
        
    }
}
