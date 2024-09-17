public class Day4Bits1 {
    public static void main(String[] args) {
        int n=5;
        int pos=3;
        int bitMask=1<<pos;
        if((bitMask&n)==0){
            System.out.println("bits was zero");
        }else{
            System.out.println( "bits were one");
        }
        
    }
    
}
