public class Day23OOP9 {
    //this is a demo to show initialisation of static variable
    static int a=4;
    static int b;
    static{
        System.out.println("i am in static block");
        b=a*5;
    }
    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b+=3;
        StaticBlock obj2=new StaticBlock();
        System.out.println(Static.a+" "+StaticBlock());
        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" "StaticB+);
    }
    
}
