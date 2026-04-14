//place Tiles of size 1*m in a floor of size n*m
public class Day51 {
    public static int PlaceTiles(int n, int m) {

        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }
        int verticalPlacements = PlaceTiles(n-1, m);
        //vertical
        int HorizontalPlacements = PlaceTiles(n-m, m);
        //Horizontal
        return verticalPlacements + HorizontalPlacements;
    }

    public static void main(String args[]) {
        int n = 3, m = 4;
        int TotalPlacements = PlaceTiles(n, m);
        System.out.println("Total placements:" + TotalPlacements);
    }
}
