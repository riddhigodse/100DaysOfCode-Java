//Print all unique subsequences of a string
import java.util.HashSet;
public class Da47 {
    public static void Subsequences(String str,int idx,String Newstring,HashSet< String>set){
        if(idx==str.length()){
            if(set.contains(Newstring)){
                return;
            }else{
                System.out.println(Newstring);
                set.add(Newstring);
                return;
            }
        }
        char currchar=str.charAt(idx);
        //take it
        Subsequences(str,idx+1,Newstring+currchar,set);
        //skip it
        Subsequences(str,idx+1,Newstring,set);
    }
    public static void main (String args[]){
        String str ="abc";

        HashSet<String>set = new HashSet<>();
        Subsequences(str,0,"",set);
    }

}
