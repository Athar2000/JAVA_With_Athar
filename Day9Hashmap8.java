import java.util.*;

public class Day9Hashmap8{
    public  static void main(String[] args) {
        //country (key),population (value)
        HashMap<String,Integer> map = new HashMap<>();
        //Insertion
        map.put("India ",120);
        map.put("chungi ",121);
        map.put("jamalpur ",122);
        System.out.println(map);
        map.put("China",180);
        //System.out.println(map);
        //for(int val:arr)
    //     for(Map.Entry<String,Integer>e:map.entrySet()){
    //         System.out.println(e.getKey());
    //         System.out.println(e.getValue());
    //     }
    // Set<String>keys=map.keySet();
    // for(String key:keys){
    //     System.out.println(key+  " : "+map.get(key));
    // }

    map.remove("India");
    System.out.println(map);



    }
    
}