import java.util.*;
public class Day9hashing3 {
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
        public static int intersection(int arr1[],int arr2[]){
            HashSet<Integer>set1 = new HashSet<>();
            int count=0;
            for(int i=0;i<arr1.length;i++){
                set.add(arr1[i]);
            }
            for(int j=0;j<arr2.length;j++){
                if(set.contains(arr2[j])){
                    count++;
                    set.remove(arr2[j]);
                }

            }
            return count;//intersection


    }
    public static void main(String args[]){
        int arr1[ ] = new int[]{7,3,9};
        int arr2[ ] = new int[]{6,3,9,2,9,4};
        System.out.println(union(arr1,arr2));

    }
    
}