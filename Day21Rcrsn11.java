public class Day21Rcrsn11 {
    public static void main(String[] args) {
        
    }
    static boolean (int [] arr,int target,int index){
        if(index==arr.length){
            return false;
    }
    return arr[index]==target ||find (arr,target,index+1);
    
    
}
static findindex (int [] arr,int target,int index){
    if(index==arr.length){
        return -1;
}
if(arr[index]==target){
    return index;
}else
return findaIndexLast(arr,target,index+1);
       }
   }
   static findindexLast (int [] arr,int target,int index){
    if(index==arr.length){
        return -1;
}
if(arr[index]==target){
    return index;
}else
return findaIndex(arr,target,index-1);
       }
   }
