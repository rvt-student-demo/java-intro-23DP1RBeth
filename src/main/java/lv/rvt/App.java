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

    
        while (true) {
            

            int com = Integer.valueOf(scanner.nextLine());

            sum += com;
    
            if (com == -1) {
    
                System.out.println("Thx! Bye!");

                System.out.println(sum);

        }
        }
    }}

        

