public class Day4StrBldr5 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Athar");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;//5-4=2
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);


        }
        System.out.println(sb);
        
    }
    
}
