public  class Day23OOP10 {
     static class Test{
        static String name;
        public Test(String name){
            this.name=name;
        }

    }
    public static void main(String[]args){
        Test a=new Test("kunal");
        Test b=new Test("Rahul");
        System.out.println(a.name);
        System.out.println(b.name);



    }

    
}
