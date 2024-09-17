public class Day18LinearSearch4 {
    public static void main(String[] args) {
        int[] arr={19,12,-7,3,14,28};
        System.out.println(min(arr));
        
    }
    //assume arr.length!=0
    //return the mimimum value in the array
    static int min(int[]arr) {
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }

        }
        return ans;

    }
    
}
