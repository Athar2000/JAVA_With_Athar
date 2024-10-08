//*Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//{3, 4, 6, 2} is not sorted in ascending order.//

import java.util.*;

public class Day4Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int number[]=new int[size];
        //input
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<number.length-1;i++){
            if(number[i]>number[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("the array is sorted in ascending order");
        }else{
            System.out.println("The array is not sorted in ascending order");
        }
    }
    
    
}
