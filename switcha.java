
import java.util.*;

 class switcha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1:  System.out.println("You pressed Button A");
            break;
            case 2:System.out.print("Hi");
            break;
            case 3:System.out.print("by");
            break;
            default:System.out.println("Invalid button");


        }
    }
}