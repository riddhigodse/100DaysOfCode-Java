//Remove the duplicates in a string

public class Day45 {
    public static boolean[] map = new boolean[26];
    public static void RemoveDuplicates(String str,int idx,String Newstring){
        if(idx ==str.length()){
            System.out.println(Newstring);
            return;
        }
        char currChar= str.charAt(idx);
        if(map[currChar -'a']) {
            RemoveDuplicates(str, idx + 1, Newstring);
        }
        else {
            Newstring += currChar;// Newstring+=currChar = newString+currChar
            map[currChar - 'a'] = true;
            RemoveDuplicates(str, idx + 1, Newstring);
        }
        }
            public static void main (String args[]){
        String str="abbccda";
        RemoveDuplicates(str,0,"");
    }
}
