import java.util.Scanner;
public class Day16automatic10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       //type casting
       int num=(int)(67.56f);
       System.out.println(num);
       //automatics type promotion in expresssions
       int a=257;
       byte b=(byte)(a);//257%356=1
       System.out.println(b);
    }
    
}