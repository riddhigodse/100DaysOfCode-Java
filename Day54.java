class Day54{
  public static void printpermutations(String str,String perm,int idx){
    if(str.length()==0){
      System.out.println(perm);public class Day54 {

    public static void printpermutations(String str, String perm, int idx) {

        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char currChar = str.charAt(i);

            String newstr = str.substring(0, i) + str.substring(i + 1);

            printpermutations(newstr, perm + currChar, idx + 1);
        }
    }

    public static void main(String[] args) {

        String str = "Riddhi";

        printpermutations(str, "", 0);
    }
}
      return;
    }
    for(i=0;i<str.length();i++){
      String newstr =

    

