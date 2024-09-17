import java.util.*;
public class Day16ConLoop33 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Take input from user till user does not press X or x
        while(true){
            //take the operator as 
            int ans =0;

            char op=in.next().trim().charAt(0);
            if (op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                //input of two number
                int num1=in.nextInt();
                int num2=in.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;


            }
            if(op=='*'){
                ans=num1*num2;
        
            }
            if(op=='/'){
                if(num2!=0){
                ans=num1/2;

                }
        
    }
    
}
