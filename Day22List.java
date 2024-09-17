
import java.util.*;
public class Day22List {
    public static void main(String[] args) {
        int [] arr={1,2,3,};
        List<List<Integer>>ans=subset(arr);
        for(List<Integer>list:ans){
            System.out.println(list);
        }

        
    }
    static List<List<Integer>>subset(int[] arr){
        List<List<Integer>>outer=new ArrayList<>();
        for(int num:arr){
            int size=outer.size();
            for(int i=0;i<num;i++){
                List<Integer>internal=new ArrayList<>();
                internal.add(num);
                outer.add(internal);

            }

        }
        return outer;
    }
    
}
