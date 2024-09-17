public class Day5Rcrsn14 {
    public static void subsequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.err.println(newString);
            return ;

        }
        char currChar=str.charAt(idx);
        subsequences(str,idx+1,newString+currChar);
        subsequences(str, idx+1, newString);
    }

    public static void main(String args[]){
        String str="abc";
        subsequences(str, 0, "");
    }
    
}
