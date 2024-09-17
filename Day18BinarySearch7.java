public class Day18BinarySearch7 {
    public static void main(String[] args) {
        
    }
    public int peakIndexInMountainArray(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end ){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in dec part of array
                //this may be the ans ,but look at left
                end =mid;

            }else{
                //you are in asc part of array
                start=mid+1;//becouse we know that mid+1 element>mid element

            }

        }
        return start;
        //in the end ,start==end and pointing to the largest number becouse of the 2 check above3
    }
    
}
