import java.util.*;

public class Day9Hashmap5{
    public  static void main(String[] args) {
        //country (key),population (value)
        HashMap<String,Integer> map = new HashMap<>();
        //Insertion
        map.put("India ",120);
        map.put("chungi ",121);
        map.put("jamalpur ",122);
        System.out.println(map);
        map.put("China",180);
        // System.out.println(map);
        // //search
        // if(map.containsKey("China")){
        //     System.out.println("key is present in the map");

        // }else{
        //     System.out.println("key is not present in the map");

        // }
        int arr[]={12,15,18};
        for(int i=0;i<3;i++){
            System.out.println(arr[i]+" ");





    }
    System.out.println();
    for(int val:arr){
        System.out.println(val+"");
    }
    System.out.println();
}
}