//Print X^n (stack height = n)

public class Day38 {
    public static int calcpower(int x,int n) {

        if(n==0) { //base case 1
            return 1; //base case 2
        }
        if(x==0) {
            return 0;
        }
        int xPowernum1 = calcpower(x,n-1); //work
        int xPowernum = x * xPowernum1;
        return xPowernum;
    }

    public static void main(String args[]) {
        int x =2,n =5;
        int ans = calcpower(x,n);
        System.out.println(ans);
    }
}
