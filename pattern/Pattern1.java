package pattern;

public class Pattern1{
    public static void main(String[] args)
    {
        int n=5;
        /*
        n = 5

        1
        3 2
        6 5 4
        8 7
        9

        */
        
        int num=0;
        for(int i=0;i<n/2;i++)
        {
            num+=(i+1);
            for(int j=0;j<=i;j++)
                System.out.print(num-j+" ");
            System.out.println();
        }
        for(int i=n/2;i>=0;i--)
        {
            num+=(i+1);
            for(int j=0;j<=i;j++)
                System.out.print(num-j+" ");
            System.out.println();
        }       
    }

}
