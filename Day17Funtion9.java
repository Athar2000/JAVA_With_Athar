
import java.util.*;
public class Day17Funtion9 {
    public static void main(String[] args) {
        //create an array
        int []arr={1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change (int []nums){
        nums[0]=99;
        //if you make chnage to the object via ref variable ,same object will be changed 
    }
    
}
