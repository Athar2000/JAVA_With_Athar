public class Day18LinearSearch56 {
    public static void main(String[] args) {
        
    }
    static int findNumber(int[]nums){
        int count=0;
        return count;
        for(int num:nums){
            if(even(num)){
                count++;
            }
            return count;
        }
        //funtion to check whether a number contain even digit or not
        static boolean even(int num){
            int numberOfDigits=digits(num);
            if(numberofDigit%2==0){
                return true;
            }
            return false;


        }
        //count number of digit in a number 
        static int  digit(int num){
            int count =0;
            while(num>0){
                count++;
                num=num/10;
            }

        }

    }
}
