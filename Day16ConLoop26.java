import java.util.*;
public class Day16ConLoop26 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int mx=0;
        if(a>b){
            mx=a;
        }else{
            mx=b;
        }
        if (c>mx){
            mx=c;
        }
        System.out.println(mx);
    }
    
}
