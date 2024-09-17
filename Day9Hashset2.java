import java.util.HashSet;
public class Day9Hashset2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //search-contain
        if(set.contains(1)){
            System.out.println("set contain 1");

        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }
        //Delete
        set.remove(1);
        if(!set.contains(1));
        System.out.println("does not conatin");

        
        
    }
    
}
