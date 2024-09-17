public class Day21Operator6 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
        
    }
    private static int setBits(int n){
        int count=0;
        while(n>0){
            count++;
            while(n>0){
                count++;
                n-=(n & -n);
            }
            return count;
        }
    }
    
}
