import java.util.Scanner;

public class DayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Welcome, " + name + "! Glad to have you on Day 2 of #100DaysOfCode ");

        sc.close();
    }
}
