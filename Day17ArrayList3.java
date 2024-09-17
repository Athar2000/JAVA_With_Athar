import java.util.*;
public class Day17ArrayList3 {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> List = new ArrayList<>(10);
        List.add(67);
        List.add(69);
        List.add(65);
        List.add(57);
        List.add(67);
        List.add(60);
        List.add(87);
        System.out.println(List.contains(67));
        List.set(0,99);
        System.out.println(List);
        List.remove(2);
        System.out.println(List);



    }
    
}
