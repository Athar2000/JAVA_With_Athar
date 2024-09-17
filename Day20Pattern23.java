public class Day20Pattern23 {
    public static void main(String[] args) {
        pattern(4);
        
    }
    static void pattern(int n){
        int originalIN=n;
        n=2*n;
        for (int row=0;row<2*n;row++){
            for(int col=0;col<2*n;col++){
                int atEveryIndex=originalIN-Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(atEveryIndex);

            }
            System.out.println();
        }
    }
    
}
