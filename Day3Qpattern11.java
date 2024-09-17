public class Day3Qpattern11 {
     public static void main(String[] args) {
        int n=5;
        //upper half
        for(int i=1;j<=n;j++){
            //1st half
            for(int j=1;j<=1;j++){
                System.out.println("*");
            }
            //space
            int space=2*(n-1);
            for(int j=1;j<=space;j++){

                System.out.println( );
            }
            //2nd part
            for (int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        
     }
    
}
