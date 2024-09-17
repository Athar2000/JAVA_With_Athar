import java.util.HashSet;
public class Day9HashSet3 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("size of set is "+set.size());
        System.out.println(set);
       
        
    }
    
}
