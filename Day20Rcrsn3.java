public class Day20Rcrsn3 {
    public static void main(String[] args) {
        //write a funtion that take in a number and print it
        //print first 5 number:1 2 3 4 5
        print(1);

    }
    static void print(int n){
        if (n==5){
            return ;
        }
        System.out.println(n);
        //recursive call
        //if you are calling a funtion again and again traet it as a separate call in stack
        

        print(n+1);
    }
    
}
