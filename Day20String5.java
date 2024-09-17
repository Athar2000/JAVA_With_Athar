public class Day20String5 {
    public static void main(String[] args) {
        String a="Kunal";
        String b="kunal";
        String c=a;
        System.out.println(a==c);
        String name1=new String("AThar");
        String name2=new String("AThar");
        System.out.println(name1==name2);//becouse when we are creating two refrence varibale and object are same the object will never be equal
    }
    
}
