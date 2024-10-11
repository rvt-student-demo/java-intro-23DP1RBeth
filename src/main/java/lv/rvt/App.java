package lv.rvt;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // int value = Integer.valueOf(scanner.nextLine());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers: ");
        
        int sum = 0;

        int kop = 0;


        while (true) {
            
            int com = Integer.valueOf(scanner.nextLine());

            if (com == -1) {

                float average = sum / kop;

                System.out.println("Thx! Bye!");

                System.out.println("Sum: " + sum);

                System.out.println("Numbers: " + kop);

                System.out.println("Average:" + average);   

                if (kop % 2 == 0) {
                    System.out.println(" is even." + kop);
                  } else {
                    System.out.println(" is odd." + kop);
                  }

                break;
   
            }

            if(com >= 0) {

                sum += com;

                kop++;
            }

        }
    }}

        

