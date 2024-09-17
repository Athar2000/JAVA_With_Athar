import java.util.Scanner;
public class Day4StrBldr3 {
   public static void main(String[] args) {
    StringBuilder sb=new StringBuilder("tony");
    System.out.println(sb);
    //char at index 0
    System.out.println(sb.charAt(0));
    //set char at index 0
    sb.insert(2,'n');
    System.out.println(sb);
    //delete the extra 'n'
    sb.delete(2,3);
    System.out.println(sb);
    
   }
    
}
