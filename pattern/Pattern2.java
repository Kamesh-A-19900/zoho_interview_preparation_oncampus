package pattern;

public class Pattern2{
    public static void main(String[] args) {
        int n = 6;
        /*
        n = 6

         */
        for(int i=0;i<n*2;i++){
            //space
            for(int j=0;j<=(n*2-i)-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<=i;j++){
                if(i<n){
                    System.out.print("* ");
                }
                else{
                    if(j>=n || j<=i-n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
