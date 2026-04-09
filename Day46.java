//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Day46 {
    public static void Subsequences(String str, int idx, String Newstring) {
        if (idx == str.length()) {
            System.out.println(Newstring);
        } else {
            char currchar = str.charAt(idx);
            Subsequences(str, idx + 1, Newstring + currchar);
            Subsequences(str, idx + 1, Newstring);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        Subsequences(str, 0, "");
    }
}
