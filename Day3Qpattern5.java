import java.util.*;


public class Day3Qpattern5 {
   public static void main(String args[]) {
       int n = 4;
      
       for(int i=n; i>=1; i--) {
        //inner loop->space print
           for(int j=1; j<i; j++) {
               System.out.print(" ");
           }


           for(int j=0; j<=n-i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}
