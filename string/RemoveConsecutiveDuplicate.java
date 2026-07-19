package string;
public class RemoveConsecutiveDuplicate{
    public static void main(String[] args) {
        String ques = "DABCCBA",duplicatRemovedString;
        boolean isDuplicate;
        do { 
            if(ques.length()<2){
                break;
            }
            duplicatRemovedString = "";
            isDuplicate = false;
            for(int pos=0;pos<ques.length();pos++){
                if(pos==0){
                    if(ques.charAt(pos)!=ques.charAt(pos+1)){
                        duplicatRemovedString+=ques.charAt(pos);
                    }
                    else{
                        isDuplicate = true;
                    }
                }
                else if(pos==ques.length()-1){
                    if(ques.charAt(pos-1)!=ques.charAt(pos)){
                        duplicatRemovedString+=ques.charAt(pos);
                    }
                    else{
                        isDuplicate = true;
                    }
                }
                else{
                    if(ques.charAt(pos-1)!=ques.charAt(pos) && ques.charAt(pos)!=ques.charAt(pos+1)){
                        duplicatRemovedString+=ques.charAt(pos);
                    }
                    else{
                        isDuplicate = true;
                    }
                }
                
            }
            ques = duplicatRemovedString;            
        } while (isDuplicate);
        System.out.println(ques);
    }
}
