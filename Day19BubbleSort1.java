import java.util.*;
public class Day19BubbleSort1 {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the state n-1 times
        for (int i=0;i<arr.length;i++){
            //for each step, max item will come at the last respecyive index
            for (int j=1;j<=arr.length-i;i++){
                //swap if item is smaller than the previous  item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;


                }
            }
            //if  youn did not swap for a particular value pf i,it mean the array is sorted hence stop the program
       
       
       if(!swapped){//!false=true
        break;
       }
       
        }




    }
    
}
