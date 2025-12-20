// Print Array from 5 to 1

public class Day34 {
    public static void printNumb(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumb(n +1); //n=5
    }
    public static void main (String args[]){
        int n = 1;
        printNumb(n); //n=1
    }
}
