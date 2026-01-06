//Tower Of Honoi

public class Day40{
    public static void TowerOfHonoi (int n,String src,String helper,String dest){
        if (n==1){
            System.out.println("transfer disk"+ n +"from"+ src+ "to" +dest);
            return;
        }
        TowerOfHonoi(n-1,src,helper,dest);
        System.out.println("transfer disk"+n+"from"+src+"to"+dest);
        TowerOfHonoi(n-1,helper,src,dest);
        System.out.println("transfer disk"+n+"from"+src+"to"+dest);
    }
    public static void main(String args[]){
        int n=3;
        TowerOfHonoi(n,"S","H","D");
    }
}
