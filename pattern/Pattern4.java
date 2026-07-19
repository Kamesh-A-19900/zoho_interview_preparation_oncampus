package pattern;

public class Pattern4 {
    public static void main(String[] args) {
        //String str = "12345";
        String str = "indianisgreat";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            for(int j=0;j<len;j++){
                if(j==i)
                    System.out.print(str.charAt(i)+" ");
                else if(j==len-i-1){
                    System.out.print(str.charAt(len-i-1)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
