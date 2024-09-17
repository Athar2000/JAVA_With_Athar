public class Day172DArrays2 {
    public static void main(String[] args) {
        
        int [][]arr=new int [3][3];
        System.out.println(arr.length);//no of rows
        //input
        for (int row=0;row<arr.length;row++){
            //for each col in every row
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }

        }
    }
    
}
