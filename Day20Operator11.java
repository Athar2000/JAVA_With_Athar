
import java.util.*; 
public class Day20Operator11 {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        //this is same as after a few step : "a"+"1"
        //intger will be converted to Intger that will call toString ()
        System.out.println("kunal"+new ArrayList<>());
        System.out.println("kunal"+new Integer(56)); 
        String ans  =new Integer(56)+""+new ArrayList<>();
        
    }
    
}
