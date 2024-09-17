public class Day5Rcrsn2 {
    public static void printNumb(int n) {
        if(n==6){     //base condition 
            return ;
        
        
    }
    System.out.println(n);
        printNumb(n+1);
    
}
public static void main(String[] args) {
    int n=1;
    printNumb(n);//n=1
}
}

