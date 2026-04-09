//"Move all the 'X' to the end of the string"

public class Day44 {
    public static void MoveallX(String str, int idx, int count, String Newstring) {
        if (idx != str.length()) {
            char currChar = str.charAt(idx);
            if (currChar == 'x') {
                ++count;
                MoveallX(str, idx + 1, count, Newstring);
            } else {
                MoveallX(str, idx + 1, count, Newstring + currChar);
            }

        } else {
            for(int i = 0; i < count; ++i) {
                Newstring = Newstring + "X";
            }

            System.out.println(Newstring);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        MoveallX(str, 0, 0, "");
    }
}
