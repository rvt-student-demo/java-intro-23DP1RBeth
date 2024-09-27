package lv.rvt;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // int value = Integer.valueOf(scanner.nextLine());

        Scanner scanner = new Scanner(System.in);

    // mana programma

     int number = 49;
     int number_2 = 59;
     int number_3 = 69;
     int number_4 = 79;
     int number_5 = 89;
     int number_6 = 100;
     int number_7 = 110;

     System.out.println("uzraksti cik tev: ");
     int box = Integer.valueOf(scanner.nextLine());

     if (box < number) {
        System.out.println("Grade: failed");
     }

     else if (box < number_2) {
        System.out.println("Grade: 1");
     }

     else if (box < number_3) {
        System.out.println("Grade: 2");
     }

     else if (box < number_4) {
        System.out.println("Grade: 3");
     }
     else if (box < number_5) {
        System.out.println("Grade: 4");
     }

     else if (box < number_6) {

        System.out.println("Grade: 5");
     }

     else if (box < number_7) {

        System.out.println("impossible!");

     }
    }
}
