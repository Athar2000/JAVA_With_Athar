public class Day18BinarySearch2 {
    public static void main(String[] args) {
        static int orderAgnosticBS(int [] arr,int target){
            int start=0;
            int end=arr.length-1;
            if(arr[start]<arr[end]){
                isAsc=true;
            }else{
                isAsc=false;
            }
            while(start<=end){
                int mid = (start+end)/2;
                if (target<arr[mid]){
                    end = mid - 1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }else{
                    return mid;
                }
            }
            return -1;

        }
        
    }
    
}
