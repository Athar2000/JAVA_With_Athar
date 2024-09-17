import java.util.*;
public class Day8Stack3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        // Push elements to the
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
