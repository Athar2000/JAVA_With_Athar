import java.util.*;

public class Day9Hashmap4{
    public  static void main(String[] args) {
        //country (key),population (value)
        HashMap<String,Integer> map = new HashMap<>();
        //Insertion
        map.put("India ",120);
        map.put("chungi ",121);
        map.put("jamalpur ",122);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);
        //search
        // if(map.containsKey("China")){
        //     System.out.println("key is present in the map");

        // }else{
        //     System.out.println("key is not present in the map");
        // }
        System.out.println(map.get("120"));//key exist
        System.out.println(map.get("Delhi"));//key doesnot exist





    }
    
}