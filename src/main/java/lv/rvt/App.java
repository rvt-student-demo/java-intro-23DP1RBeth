package lv.rvt;

public class App {

    class Exercise5
    {
      public static void main ( String[] args )
      {
        int[] val = {0, 1, 2, 3}; 
        int temp = val[0];
     
        System.out.println("Original Array: " 
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
    
        val[0] = val[3];
        val[3] = temp;
        
        temp = val[1];
        val[1] = val[2];
        val[2] = temp;
     
        System.out.println("Reversed Array: " 
            + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
       }
    }
    
    }
    
    
