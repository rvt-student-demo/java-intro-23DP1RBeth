package lv.rvt;

public class App {

        public static void printPattern() {
            
            int n = 10; 
    
            for (int i = 0; i < n; i++) {
                
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
              
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    
            for (int i = 0; i < 2; i++) { 
           
                System.out.print("        ");
             
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            printPattern();
        }
    }
    
    
