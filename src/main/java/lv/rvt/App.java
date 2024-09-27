package lv.rvt;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // int value = Integer.valueOf(scanner.nextLine());

        Scanner scanner = new Scanner(System.in);

    // mana programma

        System.out.print("Value of the gift? ");
        int box = Integer.valueOf(scanner.nextLine());

        double tax;

    if (box < 5000) {
        System.out.println("No tax!");
    } else if (box <= 25000) {
        tax = 100 + (box - 5000) * 0.08;
        System.out.printf("Tax: %.1f%n", tax);
    } else if (box <= 55000) {
        tax = 1700 + (box - 25000) * 0.10;
        System.out.printf("Tax: %.1f%n", tax);
    } else if (box <= 200000) {
        tax = 4700 + (box - 55000) * 0.12;
        System.out.printf("Tax: %.1f%n", tax);
    } else if (box <= 1000000) {
        tax = 22100 + (box - 200000) * 0.15;
        System.out.printf("Tax: %.1f%n", tax);
    } else {
        tax = 142100 + (box - 1000000) * 0.17;
        System.out.printf("Tax: %.1f%n", tax);
    }

}
}
