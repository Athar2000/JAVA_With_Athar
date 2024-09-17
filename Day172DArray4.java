public class Day172DArray4 {
    public static void main(String[]args){
        int [][]   arr={
            {3, 5, 9},
            {8, 6, 0},
            {3,4,6},
        };
        for (int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.println(arr[row][col]+"");
            }
            System.out.println();
        }
    }
    
}
