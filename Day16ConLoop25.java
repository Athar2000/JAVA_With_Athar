import java.util.*;
public class Day16ConLoop25 {
    public static void main(String[]args ){
        Scanner in=new Scanner(System.in);
        System.out.println("enter three number");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        //find largset of two number
        int max=a;
        if(b>max){
            max=b;
        }
       if (c>max){
        max=c;
       }
       System.out.println(max);
    
    
    
        
    }
    
}
