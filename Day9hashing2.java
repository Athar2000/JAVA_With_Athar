import java.util.*;
public class Day9hashing2 {
    public static int union(int arr1[],int arr2[]){
        HashSet<Integer>set=new HashSet();
        for(int i=0;i<arr1.length;i++ ){
            set.add(arr1[i]);

        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);

        }
        return set.size();


    }
    public static void main(String args[]){
        int arr1[ ] = new int[]{1, 3, 5, 7};
        int arr2[ ] = new int[]{-1, -3, -5, -7};
        System.out.println(union(arr1,arr2));

    }
    
}





































