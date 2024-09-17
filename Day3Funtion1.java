
import java.util.Scanner;
public class Day3Funtion1 {       //int,float,string->return type funtion name
   public static void printMyname(String name){
    System.out.println(name);
    return ;
   }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyname(name);//call kia funtion ko
        
    }
    
}
