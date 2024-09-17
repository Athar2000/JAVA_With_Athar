import java.util.ArrayList;

public class Day7Arraylist3 {
    public static void main(String[] args) {
     //creating array list
    ArrayList<Integer>list=new ArrayList<Integer>();
    //ArrayList<String>list2>new ArrayList<String>();
    
   // ArrayList<Boolean>list3>new ArrayList<Boolean>();
   list.add(0);
   list.add(2);
   list.add(3);
   System.out.println(list);
   //get element
   int element=list.get(0);
   System.out.println(element);
    //add el in between
    list.add(1,1);

    System.out.println(list);

        
    }
    
}
