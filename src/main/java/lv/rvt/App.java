package lv.rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cik reizes?");
        int times = Integer.parseInt(scanner.nextLine());

        int count = 0;
        while (count < times) {
            printText();
            count++;
        }   
        scanner.close();
    }

    public static void printText() {
       
        System.out.println("Dziļumā zem zemes dzīvoja metode");
    }
}
