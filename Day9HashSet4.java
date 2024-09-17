import java.util.HashSet;
import java.util.Iterator;
public class Day9HashSet4 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("size of set is "+set.size());
        System.out.println(set);
        //Iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //hashNext;next
       
        
    }
    
}
