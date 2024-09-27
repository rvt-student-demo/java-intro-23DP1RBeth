package lv.rvt;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // int value = Integer.valueOf(scanner.nextLine());

        Scanner scanner = new Scanner(System.in);

    // mana programma

     System.out.println("uzraksti cik tev: ");
     int box = Integer.valueOf(scanner.nextLine());

     if (box <= 49) {
        System.out.println("Grade: failed");
     }

     else if (box <= 59) {
        System.out.println("Grade: 1");
     }

     else if (box <= 69) {
        System.out.println("Grade: 2");
     }

     else if (box <= 79) {
        System.out.println("Grade: 3");
     }
     else if (box <= 89) {
        System.out.println("Grade: 4");
     }

     else if (box <= 100) {
        System.out.println("Grade: 5");
     }

    }
}
