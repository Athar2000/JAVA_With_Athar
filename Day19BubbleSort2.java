public class Day19BubbleSort2 {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        System.out.println(Arrays.toString(arr));
        
    }
    static void selection (int []arr){
        for(int i=0;i<arr.length;i++){
            //find the max item in the remaining array and swap with correct indrx 
            int last =arr.length-i-1;
            int maxIndex=getMaxindex(arr,0,last);
    }
    
}
private static int getMaxIndex(int [] arr,int start,int end){
    int max=start;
    for (int i=start;i<=end;i++){
        if(arr[max]<arr[i]){
            max=i;
            
        }
    }

}